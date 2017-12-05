package com.lxkj.officeassessment.app.ui.mine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.lxkj.officeassessment.MyApplication;
import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.ui.login.ChangeBindPhoneActivity;
import com.lxkj.officeassessment.app.ui.login.ModifyLoginPswdActivity;
import com.lxkj.officeassessment.app.ui.BaseActivity;
import com.lxkj.officeassessment.app.util.TimerUtil;

/**
 * Created by Administrator on 2017/5/10 0010.
 * 换绑手机号
 */

public class EditUserinfoActivity extends BaseActivity implements View.OnClickListener {

    private EditText et_phone;
    private EditText et_verification;

    private String VCode;
    private TimerUtil timerUtil;
    private ImageView image_right;
    private RelativeLayout rl_change_bind_phone,rl_modify_login_pswd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_userinfo);
        initTitle("编辑资料");
        initView();
    }

    private void initView() {
        et_phone = (EditText) findViewById(R.id.et_phone);
        et_verification = (EditText) findViewById(R.id.et_verification);
        image_right=(ImageView)findViewById(R.id.image_right);
        image_right.setVisibility(View.INVISIBLE);
        rl_change_bind_phone=(RelativeLayout)findViewById(R.id.rl_change_bind_phone);
        rl_change_bind_phone.setOnClickListener(this);
        rl_modify_login_pswd=(RelativeLayout)findViewById(R.id.rl_modify_login_pswd);
        rl_modify_login_pswd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_change_bind_phone:
                MyApplication.openActivity(this, ChangeBindPhoneActivity.class);
                break;
            case R.id.rl_modify_login_pswd:
                MyApplication.openActivity(this, ModifyLoginPswdActivity.class);
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
