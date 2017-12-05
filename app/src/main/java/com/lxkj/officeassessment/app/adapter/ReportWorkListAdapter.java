package com.lxkj.officeassessment.app.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lxkj.officeassessment.R;
import com.makeramen.roundedimageview.RoundedImageView;

import java.math.BigDecimal;
import java.util.List;


/**
 * 预约车
 * Created by Slingge on 2017/5/31 0031.
 */

public class ReportWorkListAdapter extends RecyclerView.Adapter<ReportWorkListAdapter.MyViewHolder>{

    private Context context;
    private List<String> reportWorkList;

    public ReportWorkListAdapter(Context context, List<String> reportWorkList) {
        this.context = context;
        this.reportWorkList = reportWorkList;

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_report_work, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final String bean = reportWorkList.get(position);
//
//        holder.txt_work_content_1.setText(bean);
//        holder.txt_content.setText(bean.discussContent);
//        holder.txt_time.setText(bean.time);
//        if (!TextUtils.isEmpty(bean.username)) {
//            holder.txt_name_1.setText(bean.username.substring(bean.username.length()-2, bean.username.length()));
//        }



    }

    @Override
    public int getItemCount() {
        return reportWorkList.size();
    }


    /**
     * 提供精确加法计算的add方法
     *
     * @param value1 被加数
     * @param value2 加数
     * @return 两个参数的和
     */
    public double add(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(String.valueOf(value1));
        BigDecimal b2 = new BigDecimal(String.valueOf(value2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 提供精确减法运算的sub方法
     *
     * @param value1 被减数
     * @param value2 减数
     * @return 两个参数的差
     */
    public double sub(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(String.valueOf(value1));
        BigDecimal b2 = new BigDecimal(String.valueOf(value2));
        return b1.subtract(b2).doubleValue();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txt_work_content_1, txt_work_content_2, txt_point,txt_date;
        RoundedImageView img_head;


        public MyViewHolder(View itemView) {
            super(itemView);
            txt_work_content_1 = (TextView) itemView.findViewById(R.id.txt_work_content_1);
            txt_work_content_2 = (TextView) itemView.findViewById(R.id.txt_work_content_2);
            txt_point = (TextView) itemView.findViewById(R.id.txt_point);
            txt_date=(TextView) itemView.findViewById(R.id.txt_date);
        }
    }


//    private void delCar(String shoppingCarId, final int position) {
//        ProgressDialogs.showProgressDialog(context, "正在删除...");
//        String json = "{\"cmd\":\"deleteConventionCart\",\"uid\":\"" + MyApplication.uId + "\",\"shoppingCarId\":\"" + shoppingCarId + "\"}";
//        OkHttpUtils.post().url(MyApplication.Url).addParams("json", json).build().execute(new StrCallback() {
//            @Override
//            public void onResponse(String response, int id) {
//                super.onResponse(response, id);
//                try {
//                    JSONObject obj = new JSONObject(response);
//                    if (obj.getString("result").equals("0")) {
//                        ToastUtil.showToast("删除成功");
//                        BookingCarFragment.carList.remove(position);
//                        intent = new Intent("OrderCar");
//                        context.sendBroadcast(intent);
//                        notifyDataSetChanged();
//                    } else {
//                        ToastUtil.showToast(obj.getString("resultNote"));
//                    }
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }


}