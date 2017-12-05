package com.lxkj.officeassessment.app.ui.mine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.adapter.MyFragmentPagerAdapter;
import com.lxkj.officeassessment.app.fragment.GetListFragment;
import com.lxkj.officeassessment.app.ui.BaseActivity;
import com.lxkj.officeassessment.app.util.StatusBarUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10 0010.
 * 换绑手机号
 */

public class MyGetListActivity extends BaseActivity implements View.OnClickListener {
    private List<String> myGetListList=new ArrayList<>();
    private TextView tv_title;
    private RelativeLayout rl;
    private ImageView image_back;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_getlist);
        initTitle("我的抢单");
        StatusBarUtil.setColor(this,getResources().getColor(R.color.colorWhite));
        initView();
    }

    private void initView() {
        myGetListList.add("aaa");
        myGetListList.add("aaa");
        myGetListList.add("aaa");
        myGetListList.add("aaa");
        myGetListList.add("aaa");
        myGetListList.add("aaa");
        myGetListList.add("aaa");
        image_back=(ImageView)findViewById(R.id.image_back);
        image_back.setImageResource(R.drawable.fanhui02);
        tv_title=(TextView)findViewById(R.id.tv_title);
        tv_title.setTextColor(getResources().getColor(R.color.colorBlack));
        rl=(RelativeLayout)findViewById(R.id.rl);
        rl.setBackgroundColor(getResources().getColor(R.color.colorWhite));
        tabLayout = (TabLayout) findViewById(R.id.tab);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        initTab();
;    }



    private void initTab() {
        List<String> tabList = new ArrayList<>();
        tabList.add("抢单中");
        tabList.add("抢单失败");
        tabList.add("进行中");
        tabList.add("审核中");
        tabList.add("已完成");
        tabList.add("已超期");

        List<Fragment> fragmentList = new ArrayList<>();

        for (int i = 0; i < tabList.size(); i++) {
            Fragment f1 = new GetListFragment();
//            Bundle bundle = new Bundle();
//            bundle.putSerializable("merchanBean", merchantBean.merchantList);//机构信息，最终传递给立即预约，加入购物车
//            bundle.putString("type", merchantBean.categoryList.get(i).categoryType);
//            f1.setArguments(bundle);
            fragmentList.add(f1);
        }
//        Bundle bundle = new Bundle();
//        bundle.putSerializable("bean", consultantBean);
//        f1.setArguments(bundle);
//
//        Fragment f2 = new IntegralListFragment();
//        bundle = new Bundle();
//        bundle.putString("id", consultantId);
//        f2.setArguments(bundle);
//        fragmentList.add(f2);

        if (tabLayout == null) {
            tabLayout = (TabLayout) findViewById(R.id.tab);
        }

        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), fragmentList, tabList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabsFromPagerAdapter(adapter);
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
//                break;
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



}
