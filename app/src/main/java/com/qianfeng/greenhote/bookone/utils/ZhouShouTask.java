package com.qianfeng.greenhote.bookone.utils;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by Administrator on 16-2-16.
 */
public class ZhouShouTask extends AsyncTask<Void,Integer,Object> {
    private Request request;
    private RequestCallback callback;
    private static final String tag ="----ZhouShouTask";

    public ZhouShouTask(Request request, RequestCallback callback) {
        if((request==null)||(callback==null)){
            Log.w(tag,"request||callback不能为空");
        }
        this.request = request;
        this.callback = callback;
    }

    @Override
    protected Object doInBackground(Void... params) {
        return request.doRequest();
    }

    @Override
    protected void onPostExecute(Object produce) {
        if(produce==null){
            callback.err("请求失败");
        }
        else{
            callback.success(produce);
        }
    }


    public interface  Request{
        Object doRequest();
    }

    public interface RequestCallback{
        void success(Object result);

        void err(String msg);
    }
}
