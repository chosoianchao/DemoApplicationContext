package com.dcht69.demoapplicationcontext1.demo;

import android.view.View;

import com.dcht69.demoapplicationcontext1.R;
import com.dcht69.demoapplicationcontext1.databinding.ActM002ResultBinding;

public class M002ResultAct extends BaseActvity<ActM002ResultBinding> {
    @Override
    protected void initViews() {
//        Intent intent = getIntent();
//        if (intent != null) {
//            double sum = intent.getDoubleExtra(M001MainAct.KEY_RESULT, 0);
//            mBinding.tvResult.setText(String.format("%s", sum));
//        }
        App app = (App) getApplication();
        mBinding.tvResult.setText(String.format("%s", getStorage().m001Sum));

    }

    @Override
    protected void clickVew(View view) {

    }

    @Override
    protected int getLayOutId() {
        return R.layout.act_m002_result;
    }

    @Override
    protected ActM002ResultBinding initViewBinding(View view) {
        return ActM002ResultBinding.bind(view);
    }
}
