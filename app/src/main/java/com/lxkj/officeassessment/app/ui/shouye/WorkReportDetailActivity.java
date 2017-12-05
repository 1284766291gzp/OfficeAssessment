package com.lxkj.officeassessment.app.ui.shouye;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xrecyclerview.XRecyclerView;
import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.adapter.ReportWorkDetailListAdapter;
import com.lxkj.officeassessment.app.adapter.ReportWorkListAdapter;
import com.lxkj.officeassessment.app.ui.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10 0010.
 * 换绑手机号
 */

public class WorkReportDetailActivity extends BaseActivity implements View.OnClickListener {
    private XRecyclerView recyclerView;
    private ReportWorkDetailListAdapter mAdapter;
    private List<String> reportWorkList=new ArrayList<>();
    private ImageView iv_message;
    private boolean isCollect=false;
    private TextView submit_getlist;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_report_detail);
        initTitle("详情");
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
        iv_message.setVisibility(View.INVISIBLE);

//        submit_getlist=(TextView)findViewById(R.id.submit_getlist);
//        submit_getlist.setOnClickListener(this);
        recyclerView = (XRecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLoadingMoreEnabled(false);
        recyclerView.setPullRefreshEnabled(false);
        recyclerView.setFocusable(false);
        LinearLayoutManager layoutManagerComment = new LinearLayoutManager(this);
        layoutManagerComment.setSmoothScrollbarEnabled(true);
        layoutManagerComment.setAutoMeasureEnabled(true);
        recyclerView.setLayoutManager(layoutManagerComment);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addHeaderView(setHeaderView());
        mAdapter = new ReportWorkDetailListAdapter(this, reportWorkList);
        recyclerView.setAdapter(mAdapter);
    }

    private View setHeaderView() {
        View view = LayoutInflater.from(this).inflate(R.layout.item_report_work, null, false);
        view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        return view;
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
                break;
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
            case R.id.submit_getlist:
                submit_getlist.setVisibility(View.INVISIBLE);
                Toast.makeText(this,"抢单成功,等待审核~",Toast.LENGTH_SHORT).show();
                break;
            default:break;

        }
    }



}
