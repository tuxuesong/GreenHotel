package com.qianfeng.greenhote.bookone.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.gson.Gson;
import com.qianfeng.greenhote.R;
import com.qianfeng.greenhote.bookone.adapter.ActivityChoosecityAdapterAdapter;
import com.qianfeng.greenhote.bookone.adapter.ActivityChoosecityAdapterAdaptertwo;
import com.qianfeng.greenhote.bookone.bean.Choosecity;
import com.qianfeng.greenhote.bookone.utils.BookoneUtils;
import com.qianfeng.greenhote.bookone.utils.ZhouShouTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChooseCityActivity extends Activity {

    private ListView listViewone,listViewtwo;
    private List<Map<String, String>> listhotcity = new ArrayList<>();
    private List<Map<String, String>> listnormalcity = new ArrayList<>();
    private ActivityChoosecityAdapterAdapter adapter;
    private ActivityChoosecityAdapterAdaptertwo adapterAdaptertwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        listViewone = (ListView) findViewById(R.id.bookone_listviewcityone);
        listViewtwo = (ListView) findViewById(R.id.bookone_listviewcitytwo);
        bookonechoosecity();
        adapter = new ActivityChoosecityAdapterAdapter(this, listhotcity);
        adapterAdaptertwo = new ActivityChoosecityAdapterAdaptertwo(this,listnormalcity);
        listViewone.setAdapter(adapter);
        listViewtwo.setAdapter(adapterAdaptertwo);

    }

    public void onshowcity(Choosecity city) {
        /**
         * 热门城市，添加到集合中
         */
        int hotcitysize = city.getResponseData().getHot().size();
        for (int i = 0; i < hotcitysize; i++) {
            Map<String, String> map = new HashMap<>();
            String hotcityname = city.getResponseData().getHot().get(i).getCityName();
            map.put("hotcityname", hotcityname);
            listhotcity.add(map);
        }
        /**
         * 添加普通城市和开头字母
         */
        int normalcitysize = city.getResponseData().getCommon().size();
        for (int i = 0; i < normalcitysize; i++) {
            Map<String, String> map = new HashMap<>();
            String title = city.getResponseData().getCommon().get(i).getTitle();
            map.put("title", title);
            List<Choosecity.ResponseDataEntity.CommonEntity.ItemsEntity> listitem = city.getResponseData().getCommon().get(i).getItems();
            int itemsize= listitem.size();
            for(int j=0;j<itemsize;j++){
                Map<String,String> params = new HashMap<>();
                String cityname = city.getResponseData().getCommon().get(i).getItems().get(j).getCityName();
                params.put("cityname",cityname);
                listnormalcity.add(params);
            }
            listnormalcity.add(map);

        }
    }

    /**
     * 网络请求城市
     */
    public void bookonechoosecity() {
        BookoneUtils.bookonerequestcity(new ZhouShouTask.RequestCallback() {
            @Override
            public void success(Object result) {
                Gson gson = new Gson();
                Choosecity city = gson.fromJson(result.toString(), Choosecity.class);
                onshowcity(city);
            }

            @Override
            public void err(String msg) {

            }
        });
    }
}
