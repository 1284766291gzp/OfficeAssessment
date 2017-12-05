package com.lxkj.officeassessment.app.ui.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lxkj.officeassessment.MyApplication;
import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.ui.BaseActivity;
import com.lxkj.officeassessment.app.ui.MainActivity;
import com.lxkj.officeassessment.app.util.StatusBarUtil;
import com.lxkj.officeassessment.app.util.TimerUtil;

/**
 * Created by Administrator on 2017/5/10 0010.
 * 换绑手机号
 */

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private EditText et_phone;
    private EditText et_verification;

    private String VCode;
    private TimerUtil timerUtil;
    private ImageView image_back,image_right;
    private RelativeLayout rl;
    private TextView tv_submit_login,tv_title,tv_forget_pass,tv_register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        StatusBarUtil.setColor(this,getResources().getColor(R.color.colorWhite));
        initTitle("登录");
        initView();
    }

    private void initView() {
        tv_title=(TextView)findViewById(R.id.tv_title);
        tv_title.setTextColor(getResources().getColor(R.color.txt_51));
        image_back=(ImageView)findViewById(R.id.image_back);
        image_right=(ImageView)findViewById(R.id.image_right);
        image_back.setVisibility(View.INVISIBLE);
        image_right.setVisibility(View.INVISIBLE);
        rl=(RelativeLayout)findViewById(R.id.rl);
        rl.setBackgroundColor(getResources().getColor(R.color.colorWhite));
        tv_submit_login=(TextView)findViewById(R.id.tv_submit_login);
        tv_submit_login.setOnClickListener(this);
        tv_forget_pass=(TextView)findViewById(R.id.tv_forget_pass);
        tv_forget_pass.setOnClickListener(this);
        tv_register=(TextView)findViewById(R.id.tv_register);
        tv_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_submit_login:
                MyApplication.openActivity(this, MainActivity.class);
                break;
            case R.id.tv_forget_pass:
                MyApplication.openActivity(this, ForgetPswdActivity.class);
                break;
            case R.id.tv_register:
                MyApplication.openActivity(this, RegisterActivity.class);
                break;
        }
    }

//    private void submit(String phone) {
//
//        Map<String, String> params = new HashMap<>();
//        String json = "{\"cmd\":\"updatePhoneNum\",\"uid\":\"" + MyApplication.uId + "\"," +
//                "\"phoneNum\":\"" + phone + "\"}";
//        params.put("json", json);
//        OkHttpUtils.post().url(MyApplication.Url).params(params).build().execute(new StrCallback() {
//            @Override
//            public void onResponse(String response, int id) {
//                super.onResponse(response, id);
//                try {
//                    JSONObject obj = new JSONObject(response);
//                    if (obj.getString("result").equals("0")) {
//                        ToastUtil.showToast("手机号更换成功");
//                        finish();
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
