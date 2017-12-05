package com.lxkj.officeassessment.app.util;

import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

/**
 * Created by Slingge on 2017/2/14 0014.
 */

public abstract class StrCallback extends StringCallback {

    @Override
    public void onError(Call call, Exception e, int id) {
        ProgressDialogs.dismissDialog();
         ToastUtil.showLongToast("网络错误");
    }

    @Override
    public void onResponse(String response, int id) {
        ProgressDialogs.dismissDialog();
        abLog.e2(response);
    }
}
