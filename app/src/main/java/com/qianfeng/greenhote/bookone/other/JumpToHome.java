package com.qianfeng.greenhote.bookone.other;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by Administrator on 16-2-16.
 */
public class JumpToHome {

    public static void  jumpToHome(Activity activity){
        Intent intent = new Intent(activity,HomeActivity.class);
        activity.startActivity(intent);
    }
}
