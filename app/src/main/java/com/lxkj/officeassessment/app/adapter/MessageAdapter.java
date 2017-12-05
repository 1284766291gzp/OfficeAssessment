package com.lxkj.officeassessment.app.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.lxkj.officeassessment.R;

import java.util.List;


/**
 * Created by Administrator on 2017/5/17 0017.
 */

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MyViewHolder> {

    private Context context;
    private List<String> list;

    public MessageAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_message, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//        MessageBean.MessageListBean bean = list.get(position);
//        holder.tv_content.setText(bean.messageContent);
//        holder.tv_time.setText(bean.messageTime);
//        holder.tv_title.setText(SwitchContent.switchType(bean.messageType));
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title, tv_time, tv_content;

        public MyViewHolder(View itemView) {
            super(itemView);
//            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
//            tv_time = (TextView) itemView.findViewById(R.id.tv_time);
//            tv_content = (TextView) itemView.findViewById(R.id.tv_content);
        }
    }


}
