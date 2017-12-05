package com.lxkj.officeassessment.app.ui.getlist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.xrecyclerview.XRecyclerView;
import com.lxkj.officeassessment.MyApplication;
import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.adapter.GetListListAdapter;
import com.lxkj.officeassessment.app.ui.BaseFragment;
import com.lxkj.officeassessment.app.util.RecyclerItemTouchListener;

import java.util.ArrayList;
import java.util.List;


/**
 * 首页
 * Created by Slingge on 2017/4/24 0024.
 */

public class HomeGetListFragment extends BaseFragment implements  View.OnClickListener {



    private GetListListAdapter mAdapter;
    private XRecyclerView recyclerView_get_list;
    private List<String> getListList=new ArrayList<>();
    private TextView tv_right,tv_title;
    private RelativeLayout rl;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_getlist, container, false);
        init(view);
        return view;
    }



    private void init(View view) {


        getListList.add("aaa");
        getListList.add("aaa");
        getListList.add("aaa");
        getListList.add("aaa");
        getListList.add("aaa");
        getListList.add("aaa");
        getListList.add("aaa");
        getListList.add("aaa");
        getListList.add("aaa");
        getListList.add("aaa");

//        tv_right=(TextView)view.findViewById(R.id.tv_right);
//        tv_right.setVisibility(View.VISIBLE);
//        tv_right.setText("我的抢单");
//        tv_right.setTextColor(getResources().getColor(R.color.txt_75141250));
        tv_title=(TextView)view.findViewById(R.id.tv_title);
        tv_title.setText("抢工作");
        tv_title.setTextColor(getResources().getColor(R.color.colorBlack));
        rl=(RelativeLayout)view.findViewById(R.id.rl);
        rl.setBackgroundColor(getResources().getColor(R.color.colorWhite));

        recyclerView_get_list=(XRecyclerView)view.findViewById(R.id.recyclerView_get_list);
        recyclerView_get_list.setLoadingMoreEnabled(false);
        recyclerView_get_list.setFocusable(false);
        LinearLayoutManager layoutManagerComment = new LinearLayoutManager(getActivity());
        layoutManagerComment.setSmoothScrollbarEnabled(true);
//        layoutManagerComment.setAutoMeasureEnabled(true);
        recyclerView_get_list.setLayoutManager(layoutManagerComment);
        recyclerView_get_list.setHasFixedSize(true);
        recyclerView_get_list.setNestedScrollingEnabled(false);
        mAdapter=new GetListListAdapter(getActivity(),getListList);
        recyclerView_get_list.setAdapter(mAdapter);
        recyclerView_get_list.addOnItemTouchListener(new RecyclerItemTouchListener(recyclerView_get_list) {
            @Override
            public void onItemClick(RecyclerView.ViewHolder vh) {
                int position = vh.getAdapterPosition();
                Log.e("position",position+"");
//                if (position < 0) {
//                    return;
//                }
//                Bundle bundle = new Bundle();
//                bundle.putString("id", recommendList.get(position).merchantId);
                MyApplication.openActivity(getActivity(), GetListDetailActivity.class);
            }
        });

    }


    @Override
    public void loadData() {

    }




    @Override
    public void onClick(View v) {
        switch (v.getId()) {
//            case R.id.rl_report_work://搜索
//                MyApplication.openActivity(getActivity(), ReportWorkActivity.class);
//                break;
//            case R.id.rl_regular_job://附近定位
//                MyApplication.openActivity(getActivity(), RegularJobActivity.class);
//                break;
//            case R.id.rl_scale_rank://预约
//
//                MyApplication.openActivity(getActivity(), ScaleRankActivity.class);
//                break;
//            case R.id.rl2://分类
//                MyApplication.openActivity(getActivity(), ClassificationActivity.class);
//                break;
//            case R.id.rl3://远程
//                bundle = new Bundle();
//                bundle.putInt("type", 2);
//                MyApplication.openActivity(getActivity(), MenuActivity.class, bundle);
//                break;
//            case R.id.rl4://上门
//                bundle = new Bundle();
//                bundle.putInt("type", 3);
//                MyApplication.openActivity(getActivity(), MenuActivity.class, bundle);
//                break;
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
