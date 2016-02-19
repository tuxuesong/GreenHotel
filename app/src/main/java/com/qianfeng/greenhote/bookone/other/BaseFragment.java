package com.qianfeng.greenhote.bookone.other;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 16-2-16.
 */
public abstract class BaseFragment extends Fragment {
    public View root;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(getLayout(),container,false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViews();
        initEvents();
        initDatas();
    }

    /**
     * 初始化布局
     * @return
     */
    public abstract int getLayout();

    /**
     * 初始化控件
     */
    public abstract void initViews();

    /**
     * 初始化监听器
     */
    public abstract void initEvents();

    /**
     * 初始化数据
     */
    public abstract  void initDatas();
}
