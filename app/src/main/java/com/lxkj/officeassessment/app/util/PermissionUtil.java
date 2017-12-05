package com.lxkj.officeassessment.app.util;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import me.iwf.photopicker.utils.PhotoPickerIntent;

/**
 * 权限申请
 * Created by Slingge on 2017/5/3 0003.
 */

public class PermissionUtil {


    /**
     * 访问相册权限
     */
    public static boolean ApplyPermissionAlbum(Activity context) {

        if (ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED
                | ContextCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED
                | ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(context, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE
                    , Manifest.permission.CAMERA}, 0);
            return false;
        } else {
            return true;
        }
    }


    /**
     * 定位
     */
    public static boolean LocationPermissionAlbum(Activity context) {

        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(context, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
            return false;
        } else {
            return true;
        }
    }


    private void toPhotoPicker(Activity context, int position) {
        PhotoPickerIntent intent = new PhotoPickerIntent(context);
        intent.setPhotoCount(position);
        intent.setShowCamera(true);
        context.startActivityForResult(intent, 0);
    }


}
