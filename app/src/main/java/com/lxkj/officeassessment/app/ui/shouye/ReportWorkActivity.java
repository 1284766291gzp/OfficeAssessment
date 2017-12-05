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
import com.lxkj.officeassessment.app.adapter.ReportWorkListAdapter;
import com.lxkj.officeassessment.app.ui.BaseActivity;
import com.lxkj.officeassessment.app.util.RecyclerItemTouchListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10 0010.
 * 换绑手机号
 */

public class ReportWorkActivity extends BaseActivity implements View.OnClickListener {
    private XRecyclerView recyclerView_report_work;
    private ReportWorkListAdapter mAdapter;
    private List<String> reportWorkList=new ArrayList<>();
    private ImageView iv_message;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_work);
        initTitle("工作汇报");
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
        iv_message.setImageResource(R.drawable.tianjia);
        iv_message.setOnClickListener(this);
        recyclerView_report_work=(XRecyclerView)findViewById(R.id.recyclerView_report_work);
        recyclerView_report_work.setLoadingMoreEnabled(false);
        recyclerView_report_work.setFocusable(false);
        LinearLayoutManager layoutManagerComment = new LinearLayoutManager(this);
        layoutManagerComment.setSmoothScrollbarEnabled(true);
//        layoutManagerComment.setAutoMeasureEnabled(true);
        recyclerView_report_work.setLayoutManager(layoutManagerComment);
        recyclerView_report_work.setHasFixedSize(true);
        recyclerView_report_work.setNestedScrollingEnabled(false);
        mAdapter=new ReportWorkListAdapter(this,reportWorkList);
        recyclerView_report_work.setAdapter(mAdapter);
        recyclerView_report_work.addOnItemTouchListener(new RecyclerItemTouchListener(recyclerView_report_work) {
            @Override
            public void onItemClick(RecyclerView.ViewHolder vh) {
                int position = vh.getAdapterPosition();
                Log.e("position",position+"");
//                if (position < 0) {
//                    return;
//                }
//                Bundle bundle = new Bundle();
//                bundle.putString("id", recommendList.get(position).merchantId);
                MyApplication.openActivity(ReportWorkActivity.this, WorkReportDetailActivity.class);
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_right:
                MyApplication.openActivity(this,AddReportWorkActivity.class);
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
        }
    }



}
