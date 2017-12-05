package com.lxkj.officeassessment.app.networkRequest;

import android.content.Context;

import com.google.gson.Gson;



import com.lxkj.officeassessment.MyApplication;
import com.lxkj.officeassessment.app.bean.BannerBean;
import com.lxkj.officeassessment.app.util.ProgressDialogs;
import com.lxkj.officeassessment.app.util.StrCallback;
import com.lxkj.officeassessment.app.util.ToastUtil;
import com.zhy.http.okhttp.OkHttpUtils;

import java.util.List;

/**
 * 轮播图
 * 首页轮播图 flag 0首页，1预约，2远程，3上门，4特惠专区,5高端品牌，6长见识
 * Created by Slingge on 2017/6/1 0001.
 */

public class BannerRequest {

    private Context context;

    private String cmd[] = {"getHomeBannerList", "getConventionBannerList", "getRemoteBannerList", "getDoorBannerList", "getPreferentialBannerList", "getBrandBannerList", "getNewsBannerList"};

    public BannerRequest(Context context) {
        this.context = context;
    }

    public interface BannerCallBack {
        void banner(List<BannerBean.bannerListBean> bannerList);
    }

    public BannerCallBack bannerCallBack;

    public void setBannerCallBack(BannerCallBack bannerCallBack) {
        this.bannerCallBack = bannerCallBack;
    }

    public void getbanner(int flag) {
        ProgressDialogs.showProgressDialog(context, "");
        String json = "{\"cmd\":\"" + cmd[flag] + "\"" + "}";
        OkHttpUtils.post().url(MyApplication.Url).addParams("json", json).build().execute(new StrCallback() {
            @Override
            public void onResponse(String response, int id) {
                super.onResponse(response, id);
                BannerBean bean = new Gson().fromJson(response, BannerBean.class);
                if (bean.result.equals("0")) {
                    bannerCallBack.banner(bean.bannerList);
                } else {
                    ToastUtil.showToast(bean.resultNote);
                }
            }
        });

    }


}
