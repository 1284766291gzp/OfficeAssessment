package com.lxkj.officeassessment.app.ui.shouye;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.xrecyclerview.XRecyclerView;
import com.google.gson.Gson;

import com.lxkj.officeassessment.MyApplication;
import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.adapter.GetListListAdapter;
import com.lxkj.officeassessment.app.adapter.MessageAdapter;
import com.lxkj.officeassessment.app.ui.BaseActivity;
import com.lxkj.officeassessment.app.util.StatusBarUtil;
import com.lxkj.officeassessment.app.util.StrCallback;
import com.lxkj.officeassessment.app.util.ToastUtil;
import com.zhy.http.okhttp.OkHttpUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 消息
 * Created by Administrator on 2017/5/17 0017.
 */

public class MessageActivity extends BaseActivity {

    private XRecyclerView recyclerView;
    private MessageAdapter messageAdapter;
//    private MessageAdapter mesgAdapter;
//    private List<MessageBean.MessageListBean> msgList = new ArrayList<>();


    private int nowPage = 1, totalPage = 1;
    private boolean isFirst = true;
    private int onRefresh = 0;
    private List<String> messageList=new ArrayList<>();
    private ImageView image_back;
    private TextView tv_title;
    private RelativeLayout rl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        StatusBarUtil.setColor(this,getResources().getColor(R.color.colorWhite));
        initTitle("消息");
        GoneRightImage();
        image_back=(ImageView)findViewById(R.id.image_back);
        image_back.setImageResource(R.drawable.fanhui02);

        tv_title=(TextView)findViewById(R.id.tv_title);
        tv_title.setTextColor(getResources().getColor(R.color.colorBlack));
        rl=(RelativeLayout)findViewById(R.id.rl);
        rl.setBackgroundColor(getResources().getColor(R.color.colorWhite));
        recyclerView=(XRecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        messageAdapter = new MessageAdapter(this,messageList);
        recyclerView.setAdapter(messageAdapter);

//        init();
//        getMessage(nowPage);
    }

//
//    private void init() {
//        recyclerView = (XRecyclerView) findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
//            @Override
//            public void onRefresh() {
//                msgList.clear();
//                mesgAdapter.notifyDataSetChanged();
//                nowPage = 1;
//                onRefresh = 1;
//                getMessage(nowPage);
//            }
//
//            @Override
//            public void onLoadMore() {
//                nowPage++;
//                if (nowPage > totalPage) {
//                    recyclerView.noMoreLoading();
//                } else {
//                    onRefresh = 2;
//                    getMessage(nowPage);
//                }
//            }
//        });
//
//        mesgAdapter = new MessageAdapter(this, msgList);
//        recyclerView.setAdapter(mesgAdapter);
//    }


//    private void getMessage(int page) {
//        if (isFirst) {
//            ProgressDialogs.showProgressDialog(this, "");
//            isFirst = false;
//        }
//        String json = "{\"cmd\":\"getSystemMessage\",\"uid\":\"" + MyApplication.uId + "\",\"nowPage\":\"" + page + "\"}";
//        OkHttpUtils.post().url(MyApplication.Url).addParams("json", json).build().execute(new StrCallback() {
//            @Override
//            public void onResponse(String response, int id) {
//                super.onResponse(response, id);
//                MessageBean bean = new Gson().fromJson(response, MessageBean.class);
//                if (bean.result.equals("0")) {
//                    MessageActivity.this.totalPage = bean.totalPage;
//                    msgList.addAll(bean.messageList);
//                    if (MessageActivity.this.msgList.size() == 0 || MessageActivity.this.totalPage == 1) {
//                        recyclerView.noMoreLoading();
//                    }
//                    if (onRefresh == 1) {
//                        recyclerView.refreshComplete();
//                    } else if (onRefresh == 2) {
//                        recyclerView.loadMoreComplete();
//                    }
//                    mesgAdapter.notifyDataSetChanged();
//                } else {
//                    ToastUtil.showToast(bean.resultNote);
//                }
//            }
//        });
//    }


}