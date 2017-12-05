//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.lxkj.officeassessment.app.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.lxkj.officeassessment.R;


public class YHAlertDialog extends Dialog implements OnClickListener {
    private YHAlertDialog.Controller params;
    public YHAlertDialog.OnDialogClickListener clickListener;
    private TextView titleView;
    private TextView messageView;
    private TextView confirmBtn;
    private TextView cancelBtn;

    public YHAlertDialog(Context context) {
        super(context, R.style.YHAlertDialogStyle);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.dialog_yhalert_layout);
        this.initView();
        this.setCanceledOnTouchOutside(false);
    }

    private void setParams(YHAlertDialog.Controller controller) {
        this.params = controller;
    }

    public void setOnDialogClickListener(YHAlertDialog.OnDialogClickListener listener) {
        this.clickListener = listener;
    }

    private void initView() {
        this.titleView = (TextView)this.findViewById(R.id.TitleView);
        this.messageView = (TextView)this.findViewById(R.id.MessageView);
        this.confirmBtn = (TextView)this.findViewById(R.id.confirmBtn);
        this.cancelBtn = (TextView)this.findViewById(R.id.cancelBtn);
        this.confirmBtn.setOnClickListener(this);
        this.cancelBtn.setOnClickListener(this);
        if(!TextUtils.isEmpty(this.params.title)) {
            this.titleView.setText(this.params.title);
        }

        if(!TextUtils.isEmpty(this.params.message)) {
            this.messageView.setText(this.params.message);
        }

        if(!TextUtils.isEmpty(this.params.confirmText)) {
            this.confirmBtn.setText(this.params.confirmText);
        }

        if(!TextUtils.isEmpty(this.params.cancelText)) {
            this.cancelBtn.setText(this.params.cancelText);
        }

    }

    public void onClick(View v) {
        if(this.clickListener != null) {
            if(v.getId() ==R. id.confirmBtn) {
                this.clickListener.onConfirm();
                this.dismiss();
            } else if(v.getId() == R.id.cancelBtn) {
                this.clickListener.onCancel();
                this.dismiss();
            }

        }
    }

    protected static class Controller {
        public String title;
        public String message;
        public String confirmText = "确定";
        public String cancelText = "取消";

        public Controller() {
        }
    }

    public interface OnDialogClickListener {
        void onConfirm();

        void onCancel();
    }

    public static class Builder {
        private YHAlertDialog.Controller controller = new YHAlertDialog.Controller();
        private Context mContext;

        public Builder(Context mContext) {
            this.mContext = mContext;
        }

        public YHAlertDialog.Builder setTitle(String title) {
            this.controller.title = title;
            return this;
        }

        public YHAlertDialog.Builder setMessage(String message) {
            this.controller.message = message;
            return this;
        }

        public YHAlertDialog.Builder setConfirm(String str) {
            this.controller.confirmText = str;
            return this;
        }

        public YHAlertDialog.Builder setCancel(String str) {
            this.controller.cancelText = str;
            return this;
        }

        public YHAlertDialog create() {
            YHAlertDialog dialog = new YHAlertDialog(this.mContext);
            dialog.setParams(this.controller);
            dialog.show();
            return dialog;
        }
    }
}
