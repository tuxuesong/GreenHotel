package com.qianfeng.greenhote.bookone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.qianfeng.greenhote.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ActivityChoosecityAdapterAdaptertwo extends BaseAdapter {

    private List<Map<String, String>> objects = new ArrayList<>();
    private Context context;
    private LayoutInflater layoutInflater;

    public ActivityChoosecityAdapterAdaptertwo(Context context, List<Map<String, String>> list) {
        this.context = context;
        this.objects = list;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Map<String, String> getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.activity_choosecity_adapter, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.choosecityAdapterTv = (TextView) convertView.findViewById(R.id.choosecity_adapter_tv);

            convertView.setTag(viewHolder);
        }
        initializeViews((Map<String, String>) getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(Map<String, String> object, ViewHolder holder) {
        //TODO implement
        holder.choosecityAdapterTv.setText(object.get("title"));
        holder.choosecityAdapterTv.setText(object.get("cityname"));

    }

    protected class ViewHolder {
        private TextView choosecityAdapterTv;
    }
}
