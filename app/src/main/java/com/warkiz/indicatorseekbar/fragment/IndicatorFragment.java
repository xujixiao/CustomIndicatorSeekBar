package com.warkiz.indicatorseekbar.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.warkiz.indicatorseekbar.R;

/**
 * created by ZhuangGuangquan on  2017/9/6
 */


public class IndicatorFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.custom_indicator, container, false);
    }

}
