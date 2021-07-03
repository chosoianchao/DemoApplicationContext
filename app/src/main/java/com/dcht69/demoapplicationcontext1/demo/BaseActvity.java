package com.dcht69.demoapplicationcontext1.demo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

public abstract class BaseActvity<T extends ViewBinding> extends AppCompatActivity implements View.OnClickListener {
    protected T mBinding;

    protected abstract void initViews();

    @Override
    public final void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = LayoutInflater.from(this).inflate(getLayOutId(), null);
        mBinding = initViewBinding(view);
        setContentView(view);
        initViews();
    }

    @Override
    public void onClick(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
        clickVew(view);
    }

    protected abstract void clickVew(View view);

    protected abstract int getLayOutId();

    protected abstract T initViewBinding(View view);

    public final Storage getStorage() {
        return App.getInstance().getStorage();
    }

    public final void showNotify(String msg) {
        Toast.makeText(App.getInstance(), msg, Toast.LENGTH_LONG).show();
    }
}
