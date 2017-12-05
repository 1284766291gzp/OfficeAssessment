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
import com.lxkj.officeassessment.app.util.DataCleanManager;
import com.lxkj.officeassessment.app.util.StatusBarUtil;
import com.lxkj.officeassessment.app.view.YHAlertDialog;

/**
 * Created by Administrator on 2017/5/10 0010.
 * 换绑手机号
 */

public class SettingActivity extends BaseActivity implements View.OnClickListener {

    private TextView tv_title,txt_cache;
    private RelativeLayout rl,rl_feedback,rl_clear_cache;
    private ImageView image_back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        initTitle("设置");
        StatusBarUtil.setColor(this,getResources().getColor(R.color.colorWhite));
        initView();
    }

    private void initView() {
        tv_title=(TextView)findViewById(R.id.tv_title);
        tv_title.setTextColor(getResources().getColor(R.color.colorBlack));
        rl=(RelativeLayout)findViewById(R.id.rl);
        rl.setBackgroundColor(getResources().getColor(R.color.colorWhite));
        image_back=(ImageView)findViewById(R.id.image_back);
        image_back.setImageResource(R.drawable.fanhui02);
        rl_feedback=(RelativeLayout)findViewById(R.id.rl_feedback);
        rl_feedback.setOnClickListener(this);
        rl_clear_cache=(RelativeLayout)findViewById(R.id.rl_clear_cache);
        rl_clear_cache.setOnClickListener(this);
        txt_cache=(TextView)findViewById(R.id.txt_cache);


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
            case R.id.rl_feedback:
                MyApplication.openActivity(this, FeedbackActivity.class);
                break;
            case R.id.rl_clear_cache:
                YHAlertDialog dialog = new YHAlertDialog.Builder(this)
                        .setCancel("取消")
                        .setConfirm("确定")
                        .setMessage("确定要清除缓存吗？")
                        .setTitle("提示")
                        .create();
                dialog.setOnDialogClickListener(new YHAlertDialog.OnDialogClickListener() {
                    @Override
                    public void onConfirm() {
                        DataCleanManager.clearAllCache(SettingActivity.this);
                        txt_cache.setText("0KB");
                    }

                    @Override
                    public void onCancel() {

                    }
                });


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
