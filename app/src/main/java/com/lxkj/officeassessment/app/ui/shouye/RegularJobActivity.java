package com.lxkj.officeassessment.app.ui.shouye;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.xrecyclerview.XRecyclerView;
import com.lxkj.officeassessment.MyApplication;
import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.adapter.RegularJobListAdapter;
import com.lxkj.officeassessment.app.ui.BaseActivity;
import com.lxkj.officeassessment.app.util.RecyclerItemTouchListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10 0010.
 * 换绑手机号
 */

public class RegularJobActivity extends BaseActivity implements View.OnClickListener {
    private XRecyclerView recyclerView_regular_job;
    private RegularJobListAdapter mAdapter;
    private List<String> reportWorkList=new ArrayList<>();
    private ImageView iv_message;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_job);
        initTitle("固定工作");
        initView();
    }

    private void initView() {
        reportWorkList.add("aaa");
        reportWorkList.add("aaa");
        reportWorkList.add("aaa");
        reportWorkList.add("aaa");
        reportWorkList.add("aaa");
        reportWorkList.add("aaa");
        reportWorkList.add("aaa");
        iv_message=(ImageView)findViewById(R.id.image_right);
        iv_message.setImageResource(R.drawable.shaixuan);
        recyclerView_regular_job=(XRecyclerView)findViewById(R.id.recyclerView_regular_job);
        recyclerView_regular_job.setLoadingMoreEnabled(false);
        recyclerView_regular_job.setFocusable(false);
        LinearLayoutManager layoutManagerComment = new LinearLayoutManager(this);
        layoutManagerComment.setSmoothScrollbarEnabled(true);
//        layoutManagerComment.setAutoMeasureEnabled(true);
        recyclerView_regular_job.setLayoutManager(layoutManagerComment);
        recyclerView_regular_job.setHasFixedSize(true);
        recyclerView_regular_job.setNestedScrollingEnabled(false);
        mAdapter=new RegularJobListAdapter(this,reportWorkList);
        recyclerView_regular_job.setAdapter(mAdapter);
        recyclerView_regular_job.addOnItemTouchListener(new RecyclerItemTouchListener(recyclerView_regular_job) {
            @Override
            public void onItemClick(RecyclerView.ViewHolder vh) {
                int position = vh.getAdapterPosition();
                Log.e("position",position+"");
//                if (position < 0) {
//                    return;
//                }
//                Bundle bundle = new Bundle();
//                bundle.putString("id", recommendList.get(position).merchantId);
                MyApplication.openActivity(RegularJobActivity.this, ShouyeWorkDetailActivity.class);
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_get_ver:
//                String phone = AbStrUtil.etTostr(et_phone);
//                if(TextUtils.isEmpty(phone)){
//                    ToastUtil.showToast("请输入手机号");
//                    return;
//                }
//                VCode = timerUtil.getNum();
//                SMSVerificationCode.sendSMS(this, phone, VCode);
//                timerUtil.timersStart();
//                break;
            case R.id.tv_submit:
//                phone = AbStrUtil.etTostr(et_phone);
//                if (TextUtils.isEmpty(phone)) {
//                    Toast.makeText(this, "手机号不能为空", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                String code = AbStrUtil.etTostr(et_verification);
//                if (!code.equals(VCode)) {
//                    ToastUtil.showToast("验证码错误");
//                    return;
//                }
//                submit(phone);
                break;
        }
    }



}