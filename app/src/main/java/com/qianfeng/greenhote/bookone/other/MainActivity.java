package com.qianfeng.greenhote.bookone.other;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;

import com.qianfeng.greenhote.R;
import com.qianfeng.greenhote.bookone.utils.Contants;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * 第一次安装，引导页面
         */
        if (isFirst()) {
            Intent intent = new Intent();
            intent.setClass(this, GuideActivity.class);
            startActivity(intent);
        }
        /**
         * 加载主布局文件
         */
        else {
            second();
        }
    }

    private void second() {
        setContentView(R.layout.activity_main);
        SystemClock.sleep(2000);
        JumpToHome.jumpToHome(this);
        finish();
    }

    /**
     * 判断是否是第一次安装
     * @return
     */
    public boolean isFirst() {
        SharedPreferences sharedPreferences = getSharedPreferences(Contants.isFirst, MODE_PRIVATE);
        return sharedPreferences.getBoolean(Contants.isFlag, true);
    }
}
