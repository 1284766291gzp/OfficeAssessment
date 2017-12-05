package com.lxkj.officeassessment.app.ui.shouye;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.lxkj.officeassessment.R;
import com.lxkj.officeassessment.app.dialog.RaffleDialog;
import com.lxkj.officeassessment.app.ui.BaseActivity;
import com.lxkj.officeassessment.app.util.StatusBarUtil;
import com.lxkj.officeassessment.app.view.LotteryView;
import com.lxkj.officeassessment.app.view.LuckyPanView;
import com.lxkj.officeassessment.app.view.Prize;

import java.util.ArrayList;
import java.util.List;
import com.lxkj.officeassessment.app.view.LotteryView.OnTransferWinningListener;

/**
 * Created by Administrator on 2017/5/10 0010.
 * 换绑手机号
 */

public class RaffleActivity extends BaseActivity implements View.OnClickListener {
    private List<String> reportWorkList=new ArrayList<>();
    private ImageView iv_message;
    private boolean isCollect=false;
    private TextView tv_right,tv_title;
    private RadioButton rb_1,rb_2,rb_3;
    private RelativeLayout rl;
    private ImageView image_back;
    private ImageView mStartBtn;
    private LotteryView nl;
    private RaffleDialog mRaffleDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raffle);
        initTitle("抽奖专区");
        StatusBarUtil.setColor(this,getResources().getColor(R.color.colorWhite));
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
        iv_message=(ImageView)findViewById(R.id.image_right);
        iv_message.setVisibility(View.INVISIBLE);
        tv_right=(TextView)findViewById(R.id.tv_right) ;
        tv_right.setVisibility(View.INVISIBLE);

//        tv_right.setTextColor(getResources().getColor(R.color.txt_75141250));

        rb_1=(RadioButton)findViewById(R.id.rb_1);
        tv_title=(TextView)findViewById(R.id.tv_title);
        tv_title.setTextColor(getResources().getColor(R.color.colorBlack));
        rl=(RelativeLayout)findViewById(R.id.rl);
        rl.setBackgroundColor(getResources().getColor(R.color.colorWhite));
        image_back=(ImageView)findViewById(R.id.image_back);
        image_back.setVisibility(View.VISIBLE);
        image_back.setImageResource(R.drawable.fanhui02);
        image_back.setOnClickListener(this);
        nl=(LotteryView) findViewById(R.id.nl);

        int[]prizesIcon={R.drawable.danfan,R.drawable.meizi,R.drawable.iphone,R.drawable.f015,R.drawable.anniu,R.drawable.f040,R.drawable.ipad,R.drawable.spree_icon,R.drawable.spree_success_icon};        final List<Prize>prizes=new ArrayList<Prize>();
        for(int x=0;x<9;x++){
            Prize lottery=new Prize();
            lottery.setId(x+1);
            lottery.setName("Lottery"+(x+1));
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), prizesIcon[x]);
            lottery.setIcon(bitmap);
            if((x+1)%2==0){
                lottery.setBgColor(getResources().getColor(R.color.raffle_bg));
            }else if(x==4){
                lottery.setBgColor(getResources().getColor(R.color.raffle_bg));
            }else{
                lottery.setBgColor(getResources().getColor(R.color.raffle_bg));
            }

            prizes.add(lottery);
        }
        nl.setPrizes(prizes);
        nl.setOnTransferWinningListener(new OnTransferWinningListener() {

            @Override
            public void onWinning(int position) {
                mRaffleDialog = new RaffleDialog(RaffleActivity.this, new RaffleDialog.OnSureBtnClickListener() {
                    @Override
                    public void sure() {
                        mRaffleDialog.dismiss();
                    }
                });
                mRaffleDialog.show();
                mRaffleDialog.setCanceledOnTouchOutside(true);

//                Toast.makeText(getApplicationContext(), prizes.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_back:
                finish();
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
