package com.lxkj.officeassessment.app.ui.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.dialog.CategoryPop;
import com.lxkj.officeassessment.app.ui.BaseActivity;
import com.lxkj.officeassessment.app.util.TimerUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10 0010.
 * 换绑手机号
 */

public class RegisterActivity extends BaseActivity implements View.OnClickListener ,CategoryPop.Categoryinterface{

    private EditText et_phone;
    private EditText et_verification;

    private String VCode;
    private TimerUtil timerUtil;
    private ImageView image_right;
    private TextView txt_back_tologin,txt_position;
    private CategoryPop categoryPop;
    private List<String> positionList=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initTitle("注册");
        initView();
    }

    private void initView() {
        image_right=(ImageView) findViewById(R.id.image_right);
        image_right.setVisibility(View.INVISIBLE);

        et_phone = (EditText) findViewById(R.id.et_phone);
        et_verification = (EditText) findViewById(R.id.et_verification);
        TextView tv_get_ver = (TextView) findViewById(R.id.tv_get_ver);
        TextView tv_submit = (TextView) findViewById(R.id.tv_submit);
        tv_get_ver.setOnClickListener(this);
        tv_submit.setOnClickListener(this);
        timerUtil = new TimerUtil(tv_get_ver);
        txt_back_tologin=(TextView)findViewById(R.id.txt_back_tologin);
        txt_back_tologin.setOnClickListener(this);
        txt_position=(TextView)findViewById(R.id.txt_position);
        txt_position.setOnClickListener(this);
        categoryPop = new CategoryPop(this);
        categoryPop.setCategoryinterface(this);
        positionList.add("员工");
        positionList.add("部门负责人");
        positionList.add("副经理");
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
            case R.id.txt_back_tologin:
                finish();
                break;
            case R.id.txt_position:
                categoryPop.screenPopwindow(positionList, txt_position);
                break;
        }
    }

    @Override
    public void category(int position) {

        txt_position.setText(positionList.get(position));
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
