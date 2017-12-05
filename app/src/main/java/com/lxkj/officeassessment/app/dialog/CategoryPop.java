package com.lxkj.officeassessment.app.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;


import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.util.RecyclerItemTouchListener;

import java.util.List;

/**
 * 预约时间
 * Created by Slingge on 2017/5/3 0003.
 */

public class CategoryPop {

    private Context context;
    private PopupWindow pop;

    public CategoryPop(Context context) {
        this.context = context;
    }

    public interface Categoryinterface {
        void category(int position);
    }

    public Categoryinterface categoryinterface;

    public void setCategoryinterface(Categoryinterface categoryinterface) {
        this.categoryinterface = categoryinterface;
    }

    public void screenPopwindow(List<String> list, View rlTopBar) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.pop_category, null);

        RecyclerView rv_screen = (RecyclerView) view.findViewById(R.id.recyclerView);
        rv_screen.setLayoutManager(new LinearLayoutManager(context));
//            rv_screen.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL_LIST));
        ScreenPopAdapter adapter = new ScreenPopAdapter(list);
        rv_screen.setAdapter(adapter);
        rv_screen.addOnItemTouchListener(new RecyclerItemTouchListener(rv_screen) {
            @Override
            public void onItemClick(RecyclerView.ViewHolder vh) {
                int position = vh.getAdapterPosition();
                categoryinterface.category(position);
                pop.dismiss();
            }
        });

        // 创建弹出窗口
        // 窗口内容为layoutLeft，里面包含一个ListView
        // 窗口宽度跟tvLeft一样
        pop = new PopupWindow(view, rlTopBar.getWidth(),
                FrameLayout.LayoutParams.WRAP_CONTENT);

        ColorDrawable cd = new ColorDrawable(0000);
        pop.setBackgroundDrawable(cd);
        pop.setAnimationStyle(R.style.PopupAnimation);
        pop.update();
        pop.setInputMethodMode(PopupWindow.INPUT_METHOD_NEEDED);
        pop.setTouchable(true); // 设置popupwindow可点击
        pop.setOutsideTouchable(true); // 设置popupwindow外部可点击
        pop.setFocusable(true); // 获取焦点

        // 设置popupwindow的位置（相对tvLeft的位置）
        pop.showAsDropDown(rlTopBar, 0, 0);

        pop.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // 如果点击了popupwindow的外部，popupwindow也会消失
                if (event.getAction() == MotionEvent.ACTION_OUTSIDE) {
                    pop.dismiss();
                    return true;
                }
                return false;
            }
        });
    }


    private class ScreenPopAdapter extends RecyclerView.Adapter<MyViewHolder> {

        private List<String> list;

        public ScreenPopAdapter(List<String> list) {
            this.list = list;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_category, parent, false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.text.setText(list.get(position));
            if ((position + 1) == list.size()) {
                holder.line.setVisibility(View.GONE);
            }
        }

        @Override
        public int getItemCount() {
            return list.size();
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        View line;

        public MyViewHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.text);
            line = itemView.findViewById(R.id.line);
        }
    }


}
