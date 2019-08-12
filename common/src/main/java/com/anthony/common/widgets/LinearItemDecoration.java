package com.anthony.common.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anthony.common.util.DensityUtil;

import java.util.ArrayList;
import java.util.List;


/**
 * 自定义 ItemDecoration ，实现 RecyclerView 分割线
 */
public class LinearItemDecoration extends RecyclerView.ItemDecoration {
    private static final String TAG = "LinearItemDecoration";

    private Context context;
    private int leftMargin;
    private int rightMargin;
    private int height;
    private Paint paint;
    private int itemOffsetsLeft = 0;   // 默认值 0
    private int itemOffsetsRight = 0;
    /**
     * 跳过指定集合中的 position ，不设置分割线
     */
    private List<Integer> jumpPositionList = new ArrayList<>();

    public LinearItemDecoration(Context context) {
        this.context = context;
        height = DensityUtil.dp2px(context, 1);   // 默认值 1dp

        // 初始化画笔
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
    }

    /**
     * 设置 ItemDecoration 左右 宽度，设置 getItemOffsets() 中的 outRect.left,outRect.right
     *
     * @param itemOffsetsLeft
     * @param itemOffsetsRight
     * @return
     */
    public LinearItemDecoration itemOffsets(int itemOffsetsLeft, int itemOffsetsRight) {
        this.itemOffsetsLeft = DensityUtil.dp2px(context, itemOffsetsLeft);
        this.itemOffsetsRight = DensityUtil.dp2px(context, itemOffsetsRight);
        return this;
    }

    /**
     * 设置 ItemDecoration 的高度
     *
     * @param height
     * @return
     */
    public LinearItemDecoration height(float height) {
        this.height = DensityUtil.dp2px(context, height);
        return this;
    }

    public LinearItemDecoration color(int color) {
        paint.setColor(color);
        return this;
    }

    public LinearItemDecoration margin(int left, int right) {
        this.leftMargin = DensityUtil.dp2px(context, left);
        this.rightMargin = DensityUtil.dp2px(context, right);
        return this;
    }

    /**
     * 跳过指定 position ，不设置分割线
     *
     * @param positions
     * @return
     */
    public LinearItemDecoration jumpPositions(int[] positions) {
        if (jumpPositionList == null) {
            jumpPositionList = new ArrayList<>();
        }
        for (int position : positions) {
            jumpPositionList.add(position);
        }
        return this;
    }


    @Override
    public void onDraw(@NonNull Canvas c, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.onDraw(c, parent, state);
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int leftPadding = parent.getPaddingLeft();
        int rightPadding = parent.getPaddingRight();

        for (int i = 0; i < parent.getChildCount(); i++) {
            View childView = parent.getChildAt(i);
            // 获取 leftItemDecoration 宽度，即是 getItemOffsets() 中 outRect.left 的值
            int leftDecorationWidth = layoutManager.getLeftDecorationWidth(childView);
            // 获取 rightItemDecoration 宽度，即是 getItemOffsets() 中 outRect.right 的值
            int rightDecorationWidth = layoutManager.getRightDecorationWidth(childView);
            // 获取 rightItemDecoration 高度，即是 getItemOffsets() 中 outRect.bottom 的值
            int bottomDecorationHeight = layoutManager.getBottomDecorationHeight(childView);
            // 将 RecyclerView 的 leftPadding,rightPadding 考虑进来,保证分割线内容平齐
            int left = leftDecorationWidth + leftPadding + leftMargin;
            int right = parent.getRight() - rightDecorationWidth - rightPadding - rightMargin;
            int top = childView.getBottom();
            int bottom = childView.getBottom() + bottomDecorationHeight;
            c.drawRect(new RectF(left, top, right, bottom), paint);
        }
    }

    @Override
    public void onDrawOver(@NonNull Canvas c, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.onDrawOver(c, parent, state);
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        Log.e(TAG, "getItemOffsets: ");
        outRect.left = itemOffsetsLeft;
        outRect.right = itemOffsetsRight;

        // 当前 item 的 position
        int childLayoutPosition = parent.getChildLayoutPosition(view);
        // 最后一条 item 的 position
        int lastItemPosition = state.getItemCount() - 1;
        /**
         *  因为是设置的是 outRect.bottom, 所以最后一条不设置底部分割线
         */
        if (jumpPositionList.contains(childLayoutPosition) || childLayoutPosition == lastItemPosition) {
            outRect.bottom = 0;
        } else {
            outRect.bottom = height;
        }
    }
}
