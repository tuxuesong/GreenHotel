package com.qianfeng.greenhote.bookone.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 16-2-16.
 */
public class ZhouShouUtils {
    public static final String tag = "----ZhouShouUtils";

    /**
     * doGet请求
     *
     * @param httpUrl
     * @return
     */
    public static Object doGet(String httpUrl) {
        InputStream inputStream = null;
        InputStreamReader reader = null;
        BufferedReader br = null;

        try {


            URL url = new URL(httpUrl);
            /**
             * 打开一个链接
             */
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.setReadTimeout(2000);
            conn.setConnectTimeout(2000);
            conn.setDoInput(true);
            conn.connect();

            int code = conn.getResponseCode();
            if (code == HttpURLConnection.HTTP_OK) {
                inputStream = conn.getInputStream();
                reader = new InputStreamReader(inputStream);
                br = new BufferedReader(reader);

                String msg = "";
                StringBuffer stringBuffer = new StringBuffer();
                while ((msg = br.readLine()) != null) {
                    stringBuffer.append(msg);
                }

                String result = stringBuffer.toString();
                return result;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream == null) {
                    Log.w(tag, "请求失败");
                }
                inputStream.close();
                reader.close();
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * dopost请求
     */
    public static Object doPost(String httpUrl, Map<String, String> map) {
        /**
         * 先把map转化为set
         *
         */
        Set<Map.Entry<String, String>> set = map.entrySet();
        /**
         * 迭代set集合
         *  map=2&ver=v1.2.2
         */
        Iterator<Map.Entry<String, String>> it = set.iterator();
        /**
         * 遍历set集合
         */
        StringBuffer stringBuffer = new StringBuffer();
        while (it.hasNext()) {
            Map.Entry<String, String> me = it.next();

            String key = me.getKey();
            stringBuffer.append(key);
            stringBuffer.append("=");

            String value = me.getValue();
            stringBuffer.append(value);
            stringBuffer.append("&");
        }

        String params = stringBuffer.toString();
        /**
         * 去掉最后一个&
         */
        params = params.substring(0, params.length() - 1);

        InputStream in = null;
        InputStreamReader reader = null;
        BufferedReader br = null;
        OutputStream os = null;
        try {
            URL url = new URL(httpUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setReadTimeout(2000);
            conn.setConnectTimeout(2000);
            conn.setDoOutput(true);
            conn.setUseCaches(false);

            os = conn.getOutputStream();
            os.write(params.getBytes());
            os.flush();

            int code = conn.getResponseCode();
            if (code == HttpURLConnection.HTTP_OK) {
                in = conn.getInputStream();
                reader = new InputStreamReader(in);
                br = new BufferedReader(reader);

                StringBuffer line = new StringBuffer();
                String msg = "";
                while ((msg = br.readLine()) != null) {
                    line.append(msg);
                }
                String result = line.toString();
                return reader;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in == null) {
                    Log.w("tag", "doPost请求失败");
                }
                in.close();
                reader.close();
                br.close();
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public static Bitmap loadimage(String picUrl) {
        InputStream inputStream = null;
        try {
            URL url = new URL(picUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setDoInput(true);
            conn.setReadTimeout(5000);
            conn.setConnectTimeout(5000);
            conn.connect();
            
            int code = conn.getResponseCode();
            Log.w(tag,"code的值"+code);
            if (code == HttpURLConnection.HTTP_OK) {
                inputStream = conn.getInputStream();
             Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                return bitmap;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(inputStream!=null){
                    inputStream.close();
                }

            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

}
