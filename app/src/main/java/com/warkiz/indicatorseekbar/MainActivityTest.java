package com.warkiz.indicatorseekbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.warkiz.widget.Indicator;
import com.warkiz.widget.IndicatorSeekBar;

import java.util.Random;

/**
 * Created by 11073 on 2018/1/25.
 */

public class MainActivityTest extends AppCompatActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, MainActivityTest.class);
//        starter.putExtra();
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_layout);
        final IndicatorSeekBar indicatorSeekBar = findViewById(R.id.indicator_seek_bar);
        Indicator.topHintText = "计息150天，历史年化10.5%";
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                indicatorSeekBar.setProgress(new Random().nextInt(100));

            }
        }, 500);
        indicatorSeekBar.forbidUserToSeek(true);
//        indicatorSeekBar.getIndicator().setTopContentText("计息180天，历史年化10.5");
    }
}
