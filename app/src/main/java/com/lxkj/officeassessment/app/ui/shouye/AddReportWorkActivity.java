package com.lxkj.officeassessment.app.ui.shouye;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.ui.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10 0010.
 * 换绑手机号
 */

public class AddReportWorkActivity extends BaseActivity implements View.OnClickListener {
    private List<String> reportWorkList=new ArrayList<>();
    private ImageView iv_message;
    private boolean isCollect=false;
    private TextView tv_right,tv_title;
    private RadioButton rb_1,rb_2,rb_3;
    private RelativeLayout rl;
    private ImageView image_back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_report_work);
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
        iv_message.setVisibility(View.INVISIBLE);
        tv_right=(TextView)findViewById(R.id.tv_right) ;
        tv_right.setVisibility(View.VISIBLE);
        tv_right.setText("提交");
        tv_right.setTextColor(getResources().getColor(R.color.txt_75141250));

        rb_1=(RadioButton)findViewById(R.id.rb_1);
        tv_title=(TextView)findViewById(R.id.tv_title);
        tv_title.setTextColor(getResources().getColor(R.color.colorBlack));
        rl=(RelativeLayout)findViewById(R.id.rl);
        rl.setBackgroundColor(getResources().getColor(R.color.colorWhite));
        image_back=(ImageView)findViewById(R.id.image_back);
        image_back.setVisibility(View.VISIBLE);
        image_back.setImageResource(R.drawable.fanhui02);
        image_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_back:
                finish();
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
//            case R.id.submit_getlist:
//                submit_getlist.setVisibility(View.INVISIBLE);
//                Toast.makeText(this,"抢单成功,等待审核~",Toast.LENGTH_SHORT).show();
//                break;
            default:break;

        }
    }



}
