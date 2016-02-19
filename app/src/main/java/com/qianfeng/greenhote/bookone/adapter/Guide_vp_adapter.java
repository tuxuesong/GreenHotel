package com.qianfeng.greenhote.bookone.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Administrator on 16-2-15.
 */
public class Guide_vp_adapter extends PagerAdapter {
    private List<ImageView> list;
    private Context context;
    public Guide_vp_adapter(List<ImageView> list,Context context) {
        this.list = list;
        this.context =context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    public List<ImageView> getList() {
        return list;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ImageView imageView = list.get(position);
        container.removeView(imageView);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = list.get(position);
        container.addView(imageView);
        return imageView;
    }
}
