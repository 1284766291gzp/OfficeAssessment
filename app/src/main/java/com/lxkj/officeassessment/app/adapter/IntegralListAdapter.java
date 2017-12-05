package com.lxkj.officeassessment.app.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


import com.lxkj.officeassessment.R;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Slingge on 2017/5/24 0024.
 */

public class IntegralListAdapter extends RecyclerView.Adapter<IntegralListAdapter.MyViewHolder> {

    private Context context;
    private List<String> integralList=new ArrayList<>();
//    private List<MerchantCategorListBean.consultantBean> CategoryList;
//    private MerchantDetailInfoBean.merchantInfoBean mernBean;

//    public IntegralListAdapter(Context context, List<MerchantCategorListBean.consultantBean> CategoryList, MerchantDetailInfoBean.merchantInfoBean mernBean) {
//        this.context = context;
////        this.CategoryList = CategoryList;
////        this.mernBean = mernBean;
//    }



    public IntegralListAdapter(Context context, List<String> integralList) {
        this.context = context;
        this.integralList=integralList;
//        this.CategoryList = CategoryList;
//        this.mernBean = mernBean;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_integral, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//        AnimUtil.startShow(holder.image);
//
//        final MerchantCategorListBean.consultantBean bean = CategoryList.get(position);
//
//        ImageLoader.getInstance().displayImage(bean.consultantIcon, holder.image);
//        holder.tv_name.setText(bean.consultantName);
//        holder.tv_fee.setText("服务费：" + bean.consultantFees + "元/次");
//        holder.tv_ocupation.setText(bean.consultantProfession);
//        holder.tv_quantity.setText("月约" + bean.consultantNum + "单");
//        holder.ratingBar.setRating(Float.valueOf(bean.consultantScore));
//        holder.tv_score.setVisibility(View.VISIBLE);

//        if(bean.consultantScore.equals("0")){
//            holder.tv_score.setText("0.0分");
//        }else{
//            DecimalFormat df = new DecimalFormat("#.0");
//            holder.tv_score.setText(df.format(Double.valueOf(bean.consultantScore)) + "分");
//        }
//
//        holder.tv_subscribe.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putString("id", bean.consultantId);
//                MyApplication.openActivity(context, MakeAppointmentActivity.class, bundle);
//            }
//        });
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putString("id", bean.consultantId);
//                bundle.putString("name", bean.consultantName);
//                MyApplication.openActivity(context, ConsultantDetailsActivity.class, bundle);
//            }
//        });
//        holder.tv_reservecar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putString("id", bean.consultantId);
//                MyApplication.openActivity(context, MakeAppointmentActivity.class, bundle);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return 6;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView tv_name, tv_quantity, tv_reservecar, tv_score;
        TextView tv_ocupation, tv_fee, tv_subscribe;
        RatingBar ratingBar;

        public MyViewHolder(View itemView) {
            super(itemView);
//            image = (ImageView) itemView.findViewById(R.id.image);
//
//            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
//            tv_quantity = (TextView) itemView.findViewById(R.id.tv_quantity);
//            tv_ocupation = (TextView) itemView.findViewById(R.id.tv_ocupation);
//            tv_fee = (TextView) itemView.findViewById(R.id.tv_fee);
//            tv_subscribe = (TextView) itemView.findViewById(R.id.tv_subscribe);
//            tv_reservecar = (TextView) itemView.findViewById(R.id.tv_reservecar);
//            ratingBar = (RatingBar) itemView.findViewById(R.id.ratingBar);
//            tv_score = (TextView) itemView.findViewById(R.id.tv_score);
        }
    }

}
