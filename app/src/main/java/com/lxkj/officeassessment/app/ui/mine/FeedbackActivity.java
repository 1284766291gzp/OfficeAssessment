package com.lxkj.officeassessment.app.ui.mine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lxkj.officeassessment.MyApplication;
import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.ui.login.ChangeBindPhoneActivity;
import com.lxkj.officeassessment.app.ui.login.ModifyLoginPswdActivity;
import com.lxkj.officeassessment.app.ui.BaseActivity;
import com.lxkj.officeassessment.app.util.StatusBarUtil;

/**
 * Created by Administrator on 2017/5/10 0010.
 * 换绑手机号
 */

public class FeedbackActivity extends BaseActivity implements View.OnClickListener {

    private TextView tv_title;
    private RelativeLayout rl;
    private ImageView image_back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        initTitle("意见反馈");
        initView();
    }

    private void initView() {
        StatusBarUtil.setColor(this,getResources().getColor(R.color.colorWhite));
        tv_title=(TextView)findViewById(R.id.tv_title);
        tv_title.setTextColor(getResources().getColor(R.color.colorBlack));
        rl=(RelativeLayout)findViewById(R.id.rl);
        rl.setBackgroundColor(getResources().getColor(R.color.colorWhite));
        image_back=(ImageView)findViewById(R.id.image_back);
        image_back.setImageResource(R.drawable.fanhui02);

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
