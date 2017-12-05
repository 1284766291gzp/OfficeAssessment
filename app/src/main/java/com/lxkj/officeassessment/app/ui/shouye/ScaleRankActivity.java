package com.lxkj.officeassessment.app.ui.shouye;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.xrecyclerview.XRecyclerView;
import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.adapter.ScaleRankListAdapter;
import com.lxkj.officeassessment.app.ui.BaseActivity;
import com.lxkj.officeassessment.app.util.StatusBarUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10 0010.
 * 换绑手机号
 */

public class ScaleRankActivity extends BaseActivity implements View.OnClickListener {

    private XRecyclerView recyclerView_scale_rank;
    private ScaleRankListAdapter mAdapter;
    private List<String> scaleRankList=new ArrayList<>();
    private TextView tv_right,tv_title;
    private RelativeLayout rl;
    private ImageView image_back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_rank);
        StatusBarUtil.setColor(this,getResources().getColor(R.color.colorWhite));
        initTitle("排行榜");
        initView();
    }


    private View setHeaderView()
    {
        View view = LayoutInflater.from(this).inflate(R.layout.header_scale_rank_layout, null, false);
        view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        return view;
    }


    private void initView() {
        scaleRankList.add("aaa");
        scaleRankList.add("aaa");
        scaleRankList.add("aaa");
        scaleRankList.add("aaa");
        scaleRankList.add("aaa");
        scaleRankList.add("aaa");
        scaleRankList.add("aaa");
        scaleRankList.add("aaa");
        scaleRankList.add("aaa");
        scaleRankList.add("aaa");
        scaleRankList.add("aaa");
        scaleRankList.add("aaa");
        scaleRankList.add("aaa");
        scaleRankList.add("aaa");
        scaleRankList.add("aaa");
        tv_right=(TextView)findViewById(R.id.tv_right);
        tv_right.setVisibility(View.VISIBLE);
        tv_right.setText("我的总分");
        tv_right.setTextColor(getResources().getColor(R.color.txt_75141250));

        image_back=(ImageView)findViewById(R.id.image_back);
        image_back.setImageResource(R.drawable.fanhui02);

        tv_title=(TextView)findViewById(R.id.tv_title);
        tv_title.setTextColor(getResources().getColor(R.color.colorBlack));
        rl=(RelativeLayout)findViewById(R.id.rl);
        rl.setBackgroundColor(getResources().getColor(R.color.colorWhite));

        recyclerView_scale_rank=(XRecyclerView)findViewById(R.id.recyclerView_scale_rank);
        recyclerView_scale_rank.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_scale_rank.setPullRefreshEnabled(false);
        recyclerView_scale_rank.setLoadingMoreEnabled(false);
        recyclerView_scale_rank.addHeaderView(setHeaderView());
        mAdapter=new ScaleRankListAdapter(this,scaleRankList);
        recyclerView_scale_rank.setAdapter(mAdapter);
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
