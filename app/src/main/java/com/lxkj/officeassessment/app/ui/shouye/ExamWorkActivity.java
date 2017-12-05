package com.lxkj.officeassessment.app.ui.shouye;

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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10 0010.
 * 换绑手机号
 */

public class ExamWorkActivity extends BaseActivity implements View.OnClickListener {
    private List<String> myGetListList=new ArrayList<>();
    private TextView tv_title;
    private RelativeLayout rl;
    private ImageView image_back,image_right;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_work);
        initTitle("工作审核");
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
        image_right=(ImageView)findViewById(R.id.image_right);
        image_right.setImageResource(R.drawable.shaixuan);
        image_back=(ImageView)findViewById(R.id.image_back);
        image_back.setImageResource(R.drawable.fanhui01);
        tabLayout = (TabLayout) findViewById(R.id.tab);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        initTab();
;    }



    private void initTab() {
        List<String> tabList = new ArrayList<>();
        tabList.add("待审核");
        tabList.add("已审核");

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
