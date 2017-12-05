package com.lxkj.officeassessment.app.ui.shouye;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.ui.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10 0010.
 * 换绑手机号
 */

public class AddTempWorkActivity extends BaseActivity implements View.OnClickListener {
    private List<String> reportWorkList=new ArrayList<>();
    private ImageView iv_message;
    private boolean isCollect=false;
    private TextView tv_left,tv_right;
    private RadioButton rb_1,rb_2,rb_3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_temp_work);
        initTitle("");
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
        iv_message.setVisibility(View.GONE);
        findViewById(R.id.image_back).setVisibility(View.GONE);
        tv_left=(TextView)findViewById(R.id.tv_left);
        tv_left.setVisibility(View.VISIBLE);
        tv_left.setText("取消");
        tv_left.setOnClickListener(this);
        tv_right=(TextView)findViewById(R.id.tv_right) ;
        tv_right.setVisibility(View.VISIBLE);
        tv_right.setText("完成");
        rb_1=(RadioButton)findViewById(R.id.rb_1);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_left:
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
