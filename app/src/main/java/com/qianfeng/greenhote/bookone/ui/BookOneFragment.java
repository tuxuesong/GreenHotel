package com.qianfeng.greenhote.bookone.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.android.volley.toolbox.ImageLoader;
import com.google.gson.Gson;
import com.qianfeng.greenhote.R;
import com.qianfeng.greenhote.bookone.adapter.Bookone_vpheader_adapter;
import com.qianfeng.greenhote.bookone.bean.Header;
import com.qianfeng.greenhote.bookone.other.BaseFragment;
import com.qianfeng.greenhote.bookone.other.MyApplication;
import com.qianfeng.greenhote.bookone.utils.BookoneUtils;
import com.qianfeng.greenhote.bookone.utils.ZhouShouTask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 16-2-16.
 */
public class BookOneFragment extends BaseFragment {
    private ViewPager viewPager;
    private Bookone_vpheader_adapter adapter;
    private List<ImageView> list = new ArrayList<>();
    private LinearLayout linearone, lineartwo;
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            switch (v.getId()) {
                case R.id.bookone_tv_linearone:
                    intent.setClass(getActivity(), ChooseCityActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };
    private ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


        }

        @Override
        public void onPageSelected(int position) {
            if (position == (list.size() - 1)) {
                viewPager.setCurrentItem(0);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    @Override
    public int getLayout() {
        return R.layout.home_bookonefragment;
    }

    @Override
    public void initViews() {

        viewPager = (ViewPager) root.findViewById(R.id.bookone_viewpager);
        linearone = (LinearLayout) root.findViewById(R.id.bookone_tv_linearone);
    }

    @Override
    public void initEvents() {
        linearone.setOnClickListener(onClickListener);

    }

    @Override
    public void initDatas() {
        bookoneRequest();


    }

    /**
     * 首页viewpager网络请求
     */
    public void bookoneRequest() {
        BookoneUtils.bookonerequestheader(new ZhouShouTask.RequestCallback() {
            @Override
            public void success(Object result) {
                Gson gson = new Gson();
                Header header = gson.fromJson(result.toString(), Header.class);
                bookoneshowpicHeader(header);
            }

            @Override
            public void err(String msg) {

            }
        });
    }

    /**
     * 获取图片地址并加入集合
     *
     * @param header
     */
    public void bookoneshowpicHeader(Header header) {
        int isize = header.getResponseData().getBannerList().size();
        for (int i = 0; i < isize; i++) {
            String bannerUrl = header.getResponseData().getBannerList().get(i).getBannerUrl();
            bookoneloadimage(bannerUrl);
        }
        adapter = new Bookone_vpheader_adapter(list);
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(pageChangeListener);
    }

    public void bookoneloadimage(String url) {
        final ImageView imageView = new ImageView(getActivity());
        // imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 200));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageLoader imageLoader = new ImageLoader(MyApplication.requestQueue
                , new ImageLoader.ImageCache() {
            @Override
            public Bitmap getBitmap(String url) {
                Bitmap bitmap = MyApplication.lruCache.get(url);
                if (bitmap != null) {
                    imageView.setImageBitmap(bitmap);
                    return bitmap;
                } else {
                    return null;
                }
            }

            @Override
            public void putBitmap(String url, Bitmap bitmap) {
                if (bitmap != null) {
                    MyApplication.lruCache.put(url, bitmap);
                }
            }
        });

        ImageLoader.ImageListener listener = ImageLoader.getImageListener(imageView, R.drawable.arrow_white,
                R.drawable.arrow_white
        );
        imageLoader.get(url, listener);
        list.add(imageView);
        Log.w("---bookonefragmentlist", list.toString());
    }
}
