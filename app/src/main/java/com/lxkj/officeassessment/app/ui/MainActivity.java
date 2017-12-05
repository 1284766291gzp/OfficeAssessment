package com.lxkj.officeassessment.app.ui;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.adapter.MyFragmentPagerAdapter;
import com.lxkj.officeassessment.app.ui.getlist.HomeGetListFragment;
import com.lxkj.officeassessment.app.ui.mine.MineFragment;
import com.lxkj.officeassessment.app.ui.shouye.ShouYeFragment;
import com.lxkj.officeassessment.app.util.AppManager;
import com.lxkj.officeassessment.app.util.StatusBarUtil;
import com.lxkj.officeassessment.app.view.CustomViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    public CustomViewPager viewPager;
    private TextView tv_title;
    private RelativeLayout rl;
    private ImageView iv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        setContentView(R.layout.activity_main);
        init();
        initvViewPager();
//        if (PermissionUtil.LocationPermissionAlbum(this)) {
//            Intent intent = new Intent(MainActivity.this, LocationService.class);
//            startService(intent);
//        }
    }


    private void init() {
        tv_title = (TextView) findViewById(R.id.tv_title);
        iv_back = (ImageView) findViewById(R.id.image_back);
        iv_back.setVisibility(View.INVISIBLE);
        iv_back.setOnClickListener(this);
        iv_back.setImageResource(R.drawable.ic_gear2);
        ImageView image_right = (ImageView) findViewById(R.id.image_right);
        image_right.setOnClickListener(this);
        rl = (RelativeLayout) findViewById(R.id.rl);

        RadioButton rb1 = (RadioButton) findViewById(R.id.rb_1);
        rb1.setChecked(true);
        rl.setVisibility(View.GONE);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_1:
                        rl.setVisibility(View.GONE);
                        viewPager.setCurrentItem(0);
                        iv_back.setVisibility(View.INVISIBLE);
                        StatusBarUtil.setColorNoTranslucent(MainActivity.this, getResources().getColor(R.color.AsukaColor));
                        break;
                    case R.id.rb_2:
                        rl.setVisibility(View.GONE);
                        tv_title.setText("抢工作");
                        viewPager.setCurrentItem(1);
                        iv_back.setVisibility(View.INVISIBLE);
                        StatusBarUtil.setColorNoTranslucent(MainActivity.this, getResources().getColor(R.color.colorWhite));
                        break;
                    case R.id.rb_3:
                        rl.setVisibility(View.GONE);
                        tv_title.setText("我的");
                        iv_back.setVisibility(View.GONE);
                        viewPager.setCurrentItem(3);
                        StatusBarUtil.setColorNoTranslucent(MainActivity.this, getResources().getColor(R.color.colorWhite));
                        break;
                }
            }
        });
    }


    private void initvViewPager() {
        viewPager = (CustomViewPager) findViewById(R.id.viewPager);
        List<Fragment> list = new ArrayList<>();
        list.add(new ShouYeFragment());
        list.add(new HomeGetListFragment());
        list.add(new MineFragment());
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(adapter);
    }


    private long exitTime = 0;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                exitTime = System.currentTimeMillis();
            } else {
                new AppManager().finishAllActivity();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.image_back://设置
//                MyApplication.openActivity(MainActivity.this, SetActivity.class);
                break;
            case R.id.image_right:
//                MyApplication.openActivity(MainActivity.this, MessageActivity.class);
                break;
        }
    }


    /**
     * 申请权限结果
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 0) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                Intent intent = new Intent(MainActivity.this, LocationService.class);
//                startService(intent);
            } else {
//                PermissionsDialog.dialog(this, "需要获取手机位置");
            }
        }
    }

}
