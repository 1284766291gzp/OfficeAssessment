package com.lxkj.officeassessment.app.ui.getlist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xrecyclerview.XRecyclerView;
import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.adapter.ReportWorkListAdapter;
import com.lxkj.officeassessment.app.ui.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10 0010.
 * 换绑手机号
 */

public class GetListDetailActivity extends BaseActivity implements View.OnClickListener {
    private XRecyclerView recyclerView_report_work;
    private ReportWorkListAdapter mAdapter;
    private List<String> reportWorkList=new ArrayList<>();
    private ImageView iv_message;
    private boolean isCollect=false;
    private TextView submit_getlist;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_list_detail);
        initTitle("抢单详情");
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
        iv_message.setImageResource(R.drawable.dianjishoucang02);
        iv_message.setOnClickListener(this);
        submit_getlist=(TextView)findViewById(R.id.submit_getlist);
        submit_getlist.setOnClickListener(this);
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
            case R.id.image_right:
                isCollect=!isCollect;
//                Log.e("isCollect",isCollect+"");
                if (isCollect)
                {
                    iv_message.setImageResource(R.drawable.dianjishoucang);
                }else
                {
                    iv_message.setImageResource(R.drawable.dianjishoucang02);
                }
                break;
            case R.id.submit_getlist:
                submit_getlist.setVisibility(View.INVISIBLE);
                Toast.makeText(this,"抢单成功,等待审核~",Toast.LENGTH_SHORT).show();
                break;
            default:break;

        }
    }



}
