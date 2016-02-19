package com.qianfeng.greenhote.bookone.bean;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 16-2-18.
 */
/**
 * 标签自定义View
 */
public class LabelView extends View {
    private Paint paintBg,paintTxt;
    private int radiu =30;
    private String label;

    public LabelView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    private void init(){
        //默认为隐藏且不占位
        this.setVisibility(GONE);
        paintBg = new Paint();

        paintBg.setColor(Color.parseColor("#7fb7f2"));
        paintBg.setAntiAlias(true);

        paintTxt = new Paint();
        paintTxt.setAntiAlias(true);
        paintTxt.setTextSize(35);
        paintTxt.setColor(Color.WHITE);
        paintTxt.setTextAlign(Paint.Align.CENTER);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(label!=null){
            canvas.drawCircle(getWidth()/2,getHeight()/2,radiu,paintBg);
            canvas.drawText(label, getWidth() / 2, getHeight() / 2 + ((paintTxt.descent() - paintTxt.ascent()) / 2 - paintTxt.descent()), paintTxt);
        }
    }
}
