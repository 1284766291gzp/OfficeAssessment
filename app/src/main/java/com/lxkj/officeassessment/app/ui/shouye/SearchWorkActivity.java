package com.lxkj.officeassessment.app.ui.shouye;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
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

public class SearchWorkActivity extends BaseActivity implements View.OnClickListener {
    private List<String> reportWorkList=new ArrayList<>();
    private ImageView iv_message;
    private boolean isCollect=false;
    private TextView tv_left,tv_right;
    private RadioButton rb_1,rb_2,rb_3;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ImageView BackImgBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_work);
        initView();
    }

    private void initView() {
        reportWorkList.add("aaa");
        reportWorkList.add("aaa");
        reportWorkList.add("aaa");
        reportWorkList.add("aaa");
        reportWorkList.add("aaa");
        reportWorkList.add("aaa");
        reportWorkList.add("aaa");
        BackImgBtn=(ImageView)findViewById(R.id.BackImgBtn);
        BackImgBtn.setOnClickListener(this);
//        image_right=(ImageView)findViewById(R.id.image_right);
//        image_right.setImageResource(R.drawable.shaixuan);
//        image_back=(ImageView)findViewById(R.id.image_back);
//        image_back.setImageResource(R.drawable.fanhui01);
        tabLayout = (TabLayout) findViewById(R.id.tab);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        initTab();
    }



    private void initTab() {
        List<String> tabList = new ArrayList<>();
        tabList.add("临时性工作");
        tabList.add("抢单工作");

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
            case R.id.BackImgBtn:
                finish();
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
            case R.id.image_right:
                isCollect=!isCollect;
//                Log.e("isCollect",isCollect+"");
                if (isCollect)
                {
                    iv_message.setImageResource(R.drawable.dianjishoucang);
                }else
                {
                    iv_message.setImageResource(R.drawable.dianjishoucang02);
                }
                break;
//            case R.id.submit_getlist:
//                submit_getlist.setVisibility(View.INVISIBLE);
//                Toast.makeText(this,"抢单成功,等待审核~",Toast.LENGTH_SHORT).show();
//                break;
            default:break;

        }
    }



}
