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
public class MineFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mine_fragment_layout,null);
        return view;
    }
}
