package com.lxkj.officeassessment.app.util;

import android.content.Context;
import android.widget.ImageView;

import com.youth.banner.loader.ImageLoader;

/**
 * 加载轮播图片
 * Created by Slingge on 2017/4/25 0025.
 */

public class GlideImageLoader extends ImageLoader {


    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        com.nostra13.universalimageloader.core.ImageLoader.getInstance().displayImage(path.toString(), imageView);
    }


}
