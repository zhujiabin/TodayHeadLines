package com.todayheadlines.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.todayheadlines.R;
import com.todayheadlines.base.BaseFragment;

/**
 * Created by Administrator on 2016/8/5.
 */
public class FollowFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.follow_fragment_layout,null);
        return view;
    }
}