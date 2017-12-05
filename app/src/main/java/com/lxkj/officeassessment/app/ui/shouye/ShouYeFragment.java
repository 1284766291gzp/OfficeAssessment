package com.lxkj.officeassessment.app.ui.shouye;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.lxkj.officeassessment.MyApplication;
import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.bean.BannerBean;
import com.lxkj.officeassessment.app.networkRequest.BannerRequest;
import com.lxkj.officeassessment.app.ui.BaseFragment;
import com.lxkj.officeassessment.app.util.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerClickListener;

import java.util.ArrayList;
import java.util.List;



/**
 * 首页
 * Created by Slingge on 2017/4/24 0024.
 */

public class ShouYeFragment extends BaseFragment implements OnBannerClickListener, View.OnClickListener, BannerRequest.BannerCallBack {

    private Banner banner;
    private BannerRequest bannerRequest;
    private List<BannerBean.bannerListBean> bannerList;
    private ImageView img_raffle,iv_message;//底部抽奖
    private RelativeLayout rl_report_work,rl_regular_job,rl_scale_rank,rl_temp_work,rl_report_work_look,rl_exam_work;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shouye, container, false);
        init(view);
        return view;
    }


    private void init(View view) {

        bannerRequest = new BannerRequest(getActivity());
        bannerRequest.setBannerCallBack(this);

        rl_report_work=(RelativeLayout)view.findViewById(R.id.rl_report_work);
        rl_report_work.setOnClickListener(this);
        rl_regular_job=(RelativeLayout)view.findViewById(R.id.rl_regular_job);
        rl_regular_job.setOnClickListener(this);
        rl_scale_rank=(RelativeLayout)view.findViewById(R.id.rl_scale_rank);
        rl_scale_rank.setOnClickListener(this);
        rl_temp_work=(RelativeLayout)view.findViewById(R.id.rl_temp_work);
        rl_temp_work.setOnClickListener(this);
        rl_report_work_look=(RelativeLayout)view.findViewById(R.id.rl_report_work_look);
        rl_report_work_look.setOnClickListener(this);
        img_raffle=(ImageView)view.findViewById(R.id.img_raffle);
        img_raffle.setOnClickListener(this);
        rl_exam_work=(RelativeLayout)view.findViewById(R.id.rl_exam_work);
        rl_exam_work.setOnClickListener(this);
        iv_message=(ImageView)view.findViewById(R.id.iv_message);
        iv_message.setOnClickListener(this);
        EditText et_search = (EditText) view.findViewById(R.id.et_search);
        et_search.setOnClickListener(this);
        et_search.setFocusable(false);

    }


    @Override
    public void loadData() {

    }


    @Override
    public void OnBannerClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putString("id", bannerList.get(position - 1).bannerUrl);
//        MyApplication.openActivity(getActivity(), MechanismInfoActivity.class, bundle);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rl_report_work://工作汇报
                MyApplication.openActivity(getActivity(), ReportWorkActivity.class);
                break;
            case R.id.rl_regular_job://固定工作
                MyApplication.openActivity(getActivity(), RegularJobActivity.class);
                break;
            case R.id.rl_scale_rank://分值排行榜

                MyApplication.openActivity(getActivity(), ScaleRankActivity.class);
                break;
            case R.id.rl_temp_work://临时性工作
                MyApplication.openActivity(getActivity(), TempWorkActivity.class);
                break;
            case R.id.rl_report_work_look://远程
                MyApplication.openActivity(getActivity(), ReportWorkLookActivity.class);
                break;
            case R.id.img_raffle://抽奖
                MyApplication.openActivity(getActivity(), RaffleActivity.class);
                break;
            case R.id.iv_message://消息
                MyApplication.openActivity(getActivity(), MessageActivity.class);
                break;
            case R.id.rl_exam_work://工作审核
                MyApplication.openActivity(getActivity(), ExamWorkActivity.class);
                break;
            case R.id.et_search://搜索
                MyApplication.openActivity(getActivity(), SearchWorkActivity.class);
                break;
//            case R.id.ll_3://长见识
//                MyApplication.openActivity(getActivity(), LongKnowledgeActivity.class);
//                break;
        }
    }


    /**
     * 轮播图
     */
    @Override
    public void banner(List<BannerBean.bannerListBean> bannerList) {
        this.bannerList = bannerList;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < bannerList.size(); i++) {
//            list.add(bannerList.get(i).bannerImage);
//            list.add(R.drawable.shouyebanner)
        }
        banner.setImages(list)
                .setImageLoader(new GlideImageLoader())
                .start();
    }




    @Override
    public void onDestroy() {
        super.onDestroy();
//        AnimUtil.endAnim();
    }


}
