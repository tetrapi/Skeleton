package io.rmiri.placeholder;

import android.content.Context;
import android.os.Build;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;
import android.view.View;

import io.rmiri.placeholder.Master.CLog;
import io.rmiri.placeholder.Master.PlaceholderMaster;


/**
 * Created by Rasoul Miri on 8/8/17.
 */

public class PlaceholderGradient extends PlaceholderMaster {

    public PlaceholderGradient(@NonNull Context context) {
        super(context);
    }

    public PlaceholderGradient(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PlaceholderGradient(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PlaceholderGradient(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr, @StyleRes int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }
}