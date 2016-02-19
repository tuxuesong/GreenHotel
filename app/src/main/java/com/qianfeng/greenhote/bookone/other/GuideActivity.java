package com.qianfeng.greenhote.bookone.other;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.qianfeng.greenhote.R;
import com.qianfeng.greenhote.bookone.adapter.Guide_vp_adapter;
import com.qianfeng.greenhote.bookone.utils.Contants;

import java.util.ArrayList;
import java.util.List;

public class GuideActivity extends Activity {

    private ViewPager vp;
    private List<ImageView> listimage = new ArrayList<>();
    private Guide_vp_adapter adapter;
    private Button btn;
    private int [] bitmaps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        vp = (ViewPager) findViewById(R.id.guide_vp);
        btn = (Button) findViewById(R.id.guide_btn);
        guideonshow();
        adapter = new Guide_vp_adapter(listimage,this);
        vp.setAdapter(adapter);
        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == bitmaps.length - 1) {
                    btn.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isUsed();

            }
        });

    }
    public void guideonshow(){
         bitmaps = new int[]{R.drawable.g1,R.drawable.g2,R.drawable.g3};
        for(int i=0;i<bitmaps.length;i++) {
            ImageView imageViewone = new ImageView(this);
            imageViewone.setImageResource(bitmaps[i]);
            imageViewone.setScaleType(ImageView.ScaleType.FIT_XY);
            listimage.add(imageViewone);
        }
    }


    public void isUsed(){
        SharedPreferences sharedPreferences = getSharedPreferences(Contants.isFirst,MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(Contants.isFlag, false);
        editor.commit();
       JumpToHome.jumpToHome(GuideActivity.this);
        finish();
    }
}
