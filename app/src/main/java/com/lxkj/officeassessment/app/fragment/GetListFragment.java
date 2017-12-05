package com.lxkj.officeassessment.app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.xrecyclerview.XRecyclerView;
import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.adapter.GetListListAdapter;
import com.lxkj.officeassessment.app.adapter.IntegralListAdapter;
import com.lxkj.officeassessment.app.ui.BaseFragment;

import java.util.ArrayList;
import java.util.List;


/**
 * 咨询师列表
 * Created by Slingge on 2017/5/22 0022.
 */

public class GetListFragment extends BaseFragment {

    private XRecyclerView recyclerView;
    private GetListListAdapter getListListAdapter;
//    private List<MerchantCategorListBean.consultantBean> CategoryList = new ArrayList<>();
//    private MerchantCategoryList_319 merchantCategoryList319;
    private List<String> getListList=new ArrayList<>();

    private int nowPage = 1, totalPage = 1, onRefresh = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.xml_recycler, container, false);
        init(view);

        return view;
    }


    private void init(View view) {
        RelativeLayout rl = (RelativeLayout) view.findViewById(R.id.rl);
        rl.setVisibility(View.GONE);
        recyclerView = (XRecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setFocusable(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setPullRefreshEnabled(false);

        recyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
            }

            @Override
            public void onLoadMore() {
                nowPage++;
                if (nowPage > totalPage) {
                    recyclerView.noMoreLoading();
                    return;
                }
                onRefresh = 2;
//                merchantCategoryList319.categoryList(nowPage);
            }
        });

//        MerchantDetailInfoBean.merchantInfoBean merchanBean = (MerchantDetailInfoBean.merchantInfoBean) getArguments().getSerializable("merchanBean");
        getListListAdapter = new GetListListAdapter(getActivity(),getListList);
        recyclerView.setAdapter(getListListAdapter);

//        merchantCategoryList319 = new MerchantCategoryList_319(getActivity(), getArguments().getString("type"));
//        merchantCategoryList319.setMerchantCategoryListCallBack(this);

    }





    @Override
    public void onDestroy() {
        super.onDestroy();
//        AnimUtil.endAnim();
    }

    @Override
    public void loadData() {
        nowPage = 1;
//        CategoryList.clear();
//        consultantListAdapter.notifyDataSetChanged();
//        merchantCategoryList319.categoryList(nowPage);
    }

}
