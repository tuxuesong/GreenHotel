package com.qianfeng.greenhote.bookone.other;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.qianfeng.greenhote.R;
import com.qianfeng.greenhote.bookone.ui.BookOneFragment;
import com.qianfeng.greenhote.booktwo.ui.BookTwoFragment;
import com.qianfeng.greenhote.my.ui.MyFragment;
import com.qianfeng.greenhote.server.ui.ServerFragment;

public class HomeActivity extends FragmentActivity {

    private FrameLayout fl;
    private RadioGroup radioGroup;
    private Fragment[] fragments;
    private int checkIndex = 0;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        radioGroup = (RadioGroup) findViewById(R.id.home_radiogroup);

        FragmentManager fragmentManager = getSupportFragmentManager();
        /**
         * 获取事务管理器
         */
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fl = (FrameLayout) findViewById(R.id.home_fl);
        /**
         * 实例化fragment数组，并添加到数组中
         */
        fragments = new Fragment[]{new BookOneFragment(), new BookTwoFragment()
                , new ServerFragment(), new MyFragment()};

        for (int i = 0; i < fragments.length; i++) {
            Fragment fragment = fragments[i];
            fragmentTransaction.add(R.id.home_fl, fragment);
            fragmentTransaction.hide(fragment);
        }

        fragmentTransaction.show(fragments[0]);
        fragmentTransaction.commit();

        View firstRB = radioGroup.getChildAt(0);
        firstRB.performClick();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                index = 0;
                switch (checkedId) {
                    case R.id.home_rb_bookone:
                        index = 0;
                        break;
                    case R.id.home_rb_booktwo:
                        index = 1;
                        break;
                    case R.id.home_rb_server:
                        index = 2;
                        break;
                    case R.id.home_rb_my:
                        index = 3;
                        break;
                    default:
                        index = 0;
                        break;
                }
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.show(fragments[index]);
                fragmentTransaction.hide(fragments[checkIndex]);
                fragmentTransaction.commit();
                checkIndex = index;
            }
        });

    }
}