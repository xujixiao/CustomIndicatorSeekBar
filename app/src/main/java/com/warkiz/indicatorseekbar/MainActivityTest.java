package com.warkiz.indicatorseekbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

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

    }
}
