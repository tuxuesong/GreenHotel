package com.qianfeng.greenhote.bookone.utils;

/**
 * Created by Administrator on 16-2-16.
 */
public class BookoneUtils {
    public static final String bookoneheader = "http://app.greentree.cn/Api/index.php/Other/getBannerNew/\\u63a5\\u53e3\\u901a\\u4fe1\\u6210\\u529f\\uff01";
    public static final String choosecityurl="http://app.greentree.cn/Api/index.php/City/getCityListNew";
    public static void bookonerequestheader(ZhouShouTask.RequestCallback callback){
        ZhouShouTask.Request request = new ZhouShouTask.Request()
        {
            @Override
            public Object doRequest()
            {
                return ZhouShouUtils.doGet(bookoneheader);
            }
        };

        ZhouShouTask task = new ZhouShouTask(request,callback);
        task.execute();
    }
    /**
     * 下载城市
     */
    public static void bookonerequestcity(ZhouShouTask.RequestCallback callback){
        ZhouShouTask.Request request = new ZhouShouTask.Request() {
            @Override
            public Object doRequest() {
                return ZhouShouUtils.doGet(choosecityurl);
            }
        };
        ZhouShouTask task = new ZhouShouTask(request,callback);
        task.execute();
    }

}
