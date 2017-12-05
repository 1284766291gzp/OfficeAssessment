package com.lxkj.officeassessment.app.ui.mine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lxkj.officeassessment.MyApplication;
import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.ui.BaseFragment;
import com.lxkj.officeassessment.app.util.StatusBarUtil;


/**
 * 首页
 * Created by Slingge on 2017/4/24 0024.
 */

public class MineFragment extends BaseFragment implements  View.OnClickListener {



    private TextView tv_right,tv_title;
    private RelativeLayout rl,rl_userinfo,rl_scale_value,rl_my_getlist,rl_my_raffle,rl_my_collect,rl_setting;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        init(view);
        StatusBarUtil.setColor(getActivity(),getResources().getColor(R.color.colorWhite));
        return view;
    }



    private void init(View view) {
        tv_title=(TextView)view.findViewById(R.id.tv_title);
        tv_title.setText("我的");
        tv_title.setTextColor(getResources().getColor(R.color.colorBlack));
        rl=(RelativeLayout)view.findViewById(R.id.rl);
        rl.setBackgroundColor(getResources().getColor(R.color.colorWhite));
        rl_userinfo=(RelativeLayout)view.findViewById(R.id.rl_userinfo);
        rl_userinfo.setOnClickListener(this);
        rl_scale_value=(RelativeLayout)view.findViewById(R.id.rl_scale_value);
        rl_scale_value.setOnClickListener(this);
        rl_my_getlist=(RelativeLayout) view.findViewById(R.id.rl_my_getlist);
        rl_my_getlist.setOnClickListener(this);
        rl_my_raffle=(RelativeLayout)view.findViewById(R.id.rl_my_raffle);
        rl_my_raffle.setOnClickListener(this);
        rl_my_collect=(RelativeLayout)view.findViewById(R.id.rl_my_collect);
        rl_my_collect.setOnClickListener(this);
        rl_setting=(RelativeLayout)view.findViewById(R.id.rl_setting);
        rl_setting.setOnClickListener(this);



    }


    @Override
    public void loadData() {

    }




    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rl_userinfo://编辑资料
                MyApplication.openActivity(getActivity(), EditUserinfoActivity.class);
                break;
            case R.id.rl_scale_value://我的分值
                MyApplication.openActivity(getActivity(), ScaleValueActivity.class);
                break;
            case R.id.rl_my_getlist://我的抢单
                MyApplication.openActivity(getActivity(), MyGetListActivity.class);
                break;
            case R.id.rl_my_raffle://我的抽奖
                MyApplication.openActivity(getActivity(), MyRaffleActivity.class);
                break;
            case R.id.rl_my_collect://我的收藏

                MyApplication.openActivity(getActivity(), MyCollectActivity.class);
                break;
            case R.id.rl_setting://设置
                MyApplication.openActivity(getActivity(), SettingActivity.class);
                break;
//            case R.id.iv_message://消息
//                MyApplication.openActivity(getActivity(), MessageActivity.class);
//                break;
//            case R.id.ll_1://高端品牌
//                bundle = new Bundle();
//                bundle.putInt("type", 5);
//                MyApplication.openActivity(getActivity(), MenuActivity.class, bundle);
//                break;
//            case R.id.ll_2://特惠专区
//                bundle = new Bundle();
//                bundle.putInt("type", 4);
//                MyApplication.openActivity(getActivity(), MenuActivity.class, bundle);
//                break;
//            case R.id.ll_3://长见识
//                MyApplication.openActivity(getActivity(), LongKnowledgeActivity.class);
//                break;
        }
    }






    @Override
    public void onDestroy() {
        super.onDestroy();
//        AnimUtil.endAnim();
    }


}
