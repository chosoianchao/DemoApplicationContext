package com.dcht69.demoapplicationcontext1.demo;

import android.content.Intent;
import android.view.View;

import com.dcht69.demoapplicationcontext1.R;
import com.dcht69.demoapplicationcontext1.databinding.ActivityMainBinding;

public class M001MainAct extends BaseActvity<ActivityMainBinding> {


    protected static final String KEY_RESULT = "KEY_RESULT";

    @Override
    protected void initViews() {
        mBinding.btSum.setOnClickListener(this);

    }

    @Override
    protected void clickVew(View view) {
        if (view.getId() == R.id.bt_sum) {
            doSum();
        }

    }

    private void doSum() {
        try {
            double numA = Double.parseDouble(mBinding.edtA.getText().toString());
            double numB = Double.parseDouble(mBinding.edtB.getText().toString());

            double sum = numA + numB;
            showNotify("Sum = " + sum);
            //save data into "sum" variable in App class
            getStorage().m001Sum = sum;

            // start activity2
            Intent intent = new Intent(this, M002ResultAct.class);
            //intent.putExtra(KEY_RESULT, sum);
            startActivity(intent);
        } catch (Exception exception) {
            exception.printStackTrace();

        }
    }

    @Override
    protected int getLayOutId() {
        return R.layout.activity_main;
    }

    @Override
    protected ActivityMainBinding initViewBinding(View view) {
        return ActivityMainBinding.bind(view);
    }


}