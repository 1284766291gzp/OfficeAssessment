package com.lxkj.officeassessment.app.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


import com.lxkj.officeassessment.R;

import java.util.List;

/**
 * Created by 小火
 * Create time on  2017/10/18
 * My mailbox is 1403241630@qq.com
 */

public class RaffleDialog extends Dialog implements
        View.OnClickListener {
    private OnSureBtnClickListener mSureListener;
//    private List<RecommendAndVipBean.NewUserList> newUserList;
    private Context mContext;
    private GridView mRecomend;
    private TextView mAllSayHi;
    protected Dialog dialog1;
    private ImageView img_delete;
//    private RecommendAdapter mRecommendAdapter;
    public RaffleDialog(Context context,  OnSureBtnClickListener mSureListener) {
        super(context);
        this.mContext = context;
        this.mSureListener = mSureListener;
//        this.newUserList = newUserList;
//        dialog1 = ProgressDialog.createLoadingDialog(context, "加载中.....");
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_raffle);
        initView();
    }

    private void initView() {
        img_delete=(ImageView)findViewById(R.id.img_delete);
        img_delete.setOnClickListener(this);
//        mRecomend = (GridView) findViewById(R.id.recommend_grid);
//        mAllSayHi = (TextView) findViewById(R.id.text_all_say_hi);
//        mAllSayHi.setOnClickListener(this);
//        mRecommendAdapter = new RecommendAdapter(mContext,newUserList);
//        mRecomend.setAdapter(mRecommendAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_delete:
                dismiss();
                break;
//            case R.id.text_all_say_hi:
//                if ( mSureListener != null) {
//                    mSureListener.sure();
//                    dialog1.show();
//                    TimerUtil timerUtil = new TimerUtil(mAllSayHi, new TimerUtil.CountDownListener() {
//                        @Override
//                        public void sendMessage(boolean isFinish) {
//                            if (isFinish){
//                                dialog1.dismiss();
//                                ToastUtils.showMessageShort(mContext,"一键打招呼成功");
//                            }
//                        }
//                    });
//                    timerUtil.countDown();
//                }
//                break;
        }
    }

    public interface OnSureBtnClickListener {
        public void sure();
    }

    @Override
    public void show() {
        windowDeploy(0, 0);
        super.show();
    }

    public void windowDeploy(int x, int y) {
        Window window = getWindow(); // 得到对话框
//        window.setBackgroundDrawableResource(R.drawable.transpant_bg); // 设置对话框背景为透明

        WindowManager.LayoutParams wl = window.getAttributes();
        wl.width = (int) (mContext.getApplicationContext().getResources()
                .getDisplayMetrics().widthPixels * 0.85);
        wl.x = x;
        wl.y = y;
        wl.gravity = Gravity.CENTER;// 设置重力
        window.setAttributes(wl);
    }

}
