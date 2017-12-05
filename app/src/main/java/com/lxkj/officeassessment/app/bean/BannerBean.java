package com.lxkj.officeassessment.app.bean;

import java.util.List;

/**
 * 轮播图
 * Created by Slingge on 2017/6/1 0001.
 */

public class BannerBean {

    public String result;
    public String resultNote;
    public List<bannerListBean> bannerList;

    public class bannerListBean {
        public String bannerImage;
        public String bannerName;
        public String bannerUrl;
    }
}
