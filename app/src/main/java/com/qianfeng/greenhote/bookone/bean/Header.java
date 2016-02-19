package com.qianfeng.greenhote.bookone.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 16-2-16.
 */
public class Header {

    /**
     * result : 0
     * message : 接口通信成功！
     * responseData : {"bannerList":[{"bannerId":1278,"description":"&lt;span style=&quot;font-family: 宋体;&quot;&gt;&lt;span style=&quot;font-size: 14px;&quot;&gt;一、【活动时间】&lt;br /&gt;\r\n2016年1月16日－2016年2月22日&lt;br /&gt;\r\n&lt;br /&gt;\r\n二、【活动内容】&lt;br /&gt;\r\n1、 每日1000个红包，等您来领&lt;br /&gt;\r\n每位会员可领取3次＂格林红包＂，除夕、初一、元宵节三天可额外领取3次＂格林红包＂；每日领取时间12:30/15:30/19:00/21:00。 每日红包奖池：一千元现金/ 免房券红包、一万元代金券红包。 会员关注格林微信，可给好友发送电子代金券、现金券、储值红包。&lt;br /&gt;\r\n2、特惠豪房天天享&lt;br /&gt;\r\n活动期间，会员不限次数，预订入住99.8元特惠房。 更有108元/118/128元等多档限量/连住特惠房海量上线。 具体以官网/APP/H5的酒店详情界面房型房价信息为准。&lt;br /&gt;\r\n3、 门店礼遇惊喜多&lt;br /&gt;\r\n除夕、初一入住客人，可在酒店前台领取一个红包，惊喜连连；元宵节入住客人，可参与酒店猜灯谜游戏，赢取礼品。&lt;br /&gt;\r\n温馨提示：具体参与门店与活动详情，请咨询酒店前台。&lt;/span&gt;&lt;/span&gt;","bannerUrl":"http://app.greentree.cn/Public/uploadfile/content/2016/02/20160216014659888.jpg"},{"bannerId":1279,"description":"&lt;p style=&quot;white-space: normal; margin: 5px 0px; font-family: sans-serif; font-size: 16px;&quot;&gt;&lt;span style=&quot;font-size: 14px;&quot;&gt;&lt;span style=&quot;font-family: 宋体;&quot;&gt;一、【活动主题】&lt;br /&gt;\r\n尖货一元限时抢&lt;br /&gt;\r\n&lt;br /&gt;\r\n二、【活动对象】&lt;br /&gt;\r\n格林会员客人&lt;br /&gt;\r\n&lt;br /&gt;\r\n三、【活动内容】&lt;br /&gt;\r\n格林商城推出1元秒杀限时抢购活动，每天&lt;/span&gt;&lt;span style=&quot;font-family: 宋体;&quot;&gt;12:30、15:30、19:00、21:00四个时刻均有1款尖货定价1元秒杀，&lt;/span&gt;&lt;span style=&quot;font-family: 宋体;&quot;&gt;更多详情可登陆＂&lt;/span&gt;http://mall.998.com/＂&lt;span style=&quot;font-family: 宋体;&quot;&gt;格林商城查看。&lt;br /&gt;\r\n&lt;br /&gt;\r\n&lt;font style=&quot;font-family: 宋体;&quot;&gt;四、【分享有礼】&lt;br /&gt;\r\n分享本活动并截图发给格林豪泰官方微信，还有机会赢得额外奖励。&lt;/font&gt;&lt;/span&gt;&lt;br /&gt;\r\n&lt;br /&gt;\r\n温馨提示：&lt;br /&gt;\r\n1、参与活动的商品多多，超大电量充电宝、可爱卡通杯、不同面值代金券、更有酒店免房惊喜奉上；&lt;br /&gt;\r\n2、另格林商城每日都将不定时更新秒杀商品，更多好礼，敬请期待；&lt;br /&gt;\r\n3、秒杀成功后，商品（实物）将在3至5个工作日内寄出；&lt;br /&gt;\r\n4、如您成功秒杀到免房，烦请保持手机通讯顺畅，我们的工作人员将会在24小时内联系您。&lt;/span&gt;&lt;span style=&quot;font-size: 14px;&quot;&gt; &lt;/span&gt;&lt;/p&gt;\r\n&lt;div&gt;&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt;如有疑问，可致电格林客服热线4001-681-681.&lt;/span&gt;&lt;/div&gt;","bannerUrl":"http://app.greentree.cn/Public/uploadfile/content/2016/02/20160202062147831.jpg"},{"bannerId":1280,"description":"&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt;一、【储值优惠政策】&lt;/span&gt;&lt;br style=&quot;font-family: 宋体; font-size: 14px;&quot; /&gt;\r\n&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt; 2015年12月1-2016年1月31日期间，充1000元送1000格林币+100元电子代金券（5张面额20元）。&lt;/span&gt;&lt;br /&gt;\r\n&lt;br style=&quot;font-family: 宋体; font-size: 14px;&quot; /&gt;\r\n&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt;二、【如何充值】&lt;/span&gt;&lt;br style=&quot;font-family: 宋体; font-size: 14px;&quot; /&gt;\r\n&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt; 登录官网、APP或官方微信，进入会员中心＂我的储值＂页面充值，也可在酒店扫描二维码进行充值。&lt;/span&gt;&lt;br style=&quot;font-family: 宋体; font-size: 14px;&quot; /&gt;\r\n&lt;br style=&quot;font-family: 宋体; font-size: 14px;&quot; /&gt;\r\n&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt;三、【关于发票】&lt;/span&gt;&lt;br style=&quot;font-family: 宋体; font-size: 14px;&quot; /&gt;\r\n&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt; 1、可选择在充值时一次性开发票，也可选择预订入住时开发票。&lt;/span&gt;&lt;br style=&quot;font-family: 宋体; font-size: 14px;&quot; /&gt;\r\n&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt; 2、如您是扫酒店指定二维码进入充值并选择一次性开发票，由酒店前台现场开发票。&lt;/span&gt;&lt;br style=&quot;font-family: 宋体; font-size: 14px;&quot; /&gt;\r\n&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt; 3、如您是通过其他途径进入充值并选择一次性开发票，且单笔充值满5000元，由格林总部在10个工作日内为您邮寄发票。&lt;/span&gt;&lt;br style=&quot;font-family: 宋体; font-size: 14px;&quot; /&gt;\r\n&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt; 4、使用储值在商城购物暂无法开发票，充值时开发票的储值暂不支持在商城购物。&lt;/span&gt;&lt;br style=&quot;font-family: 宋体; font-size: 14px;&quot; /&gt;\r\n&lt;br style=&quot;font-family: 宋体; font-size: 14px;&quot; /&gt;\r\n&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt;四、【储值如何使用】&lt;/span&gt;&lt;br style=&quot;font-family: 宋体; font-size: 14px;&quot; /&gt;\r\n&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt; 1、会员储值可用于官网、APP、官方微信预订支付，以及商城购物。&lt;/span&gt;&lt;br style=&quot;font-family: 宋体; font-size: 14px;&quot; /&gt;\r\n&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt; 2、会员储值不能提现，不能退款。&lt;/span&gt;&lt;br style=&quot;font-family: 宋体; font-size: 14px;&quot; /&gt;\r\n&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt; 3、两种不同开票方式的储值不能在同一订单中使用。&lt;/span&gt;","bannerUrl":"http://app.greentree.cn/Public/uploadfile/content/2016/02/20160216114015501.jpg"},{"bannerId":1282,"description":"&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt;一、【活动时间】&lt;/span&gt;&lt;br /&gt;\r\n&lt;span style=&quot;font-family: 宋体; font-size: 14px;&quot;&gt;2016年01月01日-2016年3月31日&lt;/span&gt;&lt;br /&gt;\r\n&lt;br /&gt;\r\n&lt;span style=&quot;font-size: 14px;&quot;&gt;&lt;span style=&quot;font-family: 宋体;&quot;&gt;二、【活动对象】&lt;br /&gt;\r\n格林豪泰客人&lt;br /&gt;\r\n&lt;br /&gt;\r\n三、【活动范围】&lt;/span&gt;&lt;/span&gt;&lt;br /&gt;\r\n&lt;span style=&quot;white-space: normal; font-family: 宋体; font-size: 14px; line-height: 25px; background-color: rgb(255, 255, 255);&quot;&gt;限参与格林豪泰三亚市城区活动的酒店&lt;/span&gt;&lt;br /&gt;\r\n&lt;br /&gt;\r\n&lt;span style=&quot;font-size: 14px;&quot;&gt;&lt;span style=&quot;font-family: 宋体;&quot;&gt;四、【活动内容】&lt;br /&gt;\r\n新春将至，格林豪泰海南省三亚市城区酒店联合推出优惠活动，活动内容如下：&lt;br /&gt;\r\n1、活动期间，凡是凭当日飞机票、汽车票、火车票或出租车票入住酒店，可凭车票抵10元房费；&lt;br /&gt;\r\n2、活动期间，凡新办铂金卡客人首晚尊享0元/间夜；新办金卡客人首晚尊享99.8元/间夜（注：2016年2月7日-2016年2月15日期间除外）；&lt;br /&gt;\r\n3、活动期间，凡会员本人入住全天房，均可获赠早餐1份（每间最多赠送一份1份早餐）；&lt;br /&gt;\r\n4、活动期间，会员入住休闲房，可尊享休闲房68元/4小时；&lt;br /&gt;\r\n温馨提示：以上活动不与其它优惠活动共享,99.8房、特价房不参与此活动，活动详情可电话至酒店前台询问。&lt;br /&gt;\r\n&lt;br /&gt;\r\n四、【参与活动的酒店】&lt;br /&gt;\r\n格林豪泰海南省三亚市春园海鲜广场快捷酒店&lt;br /&gt;\r\n格林豪泰海南省三亚市和平街情人桥快捷酒店&lt;br /&gt;\r\n格林豪泰海南省三亚市国际购物中心贝壳酒店&lt;br /&gt;\r\n格林豪泰海南省三亚市酒吧街临春河路商务酒店&lt;br /&gt;\r\n格林豪泰海南省三亚市亚龙湾迎宾大道吉阳区政府商务酒店&lt;br /&gt;\r\n格林豪泰海南省三亚市凤凰机场路商务酒店&lt;/span&gt;&lt;/span&gt;","bannerUrl":"http://app.greentree.cn/Public/uploadfile/content/2016/01/20160113034110940.jpg"},{"bannerId":1283,"description":"&lt;p style=&quot;margin: 5px 0px; font-family: sans-serif; font-size: 16px; white-space: normal;&quot;&gt;&lt;strong&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;一、【&lt;/span&gt;&lt;/strong&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;活动主题&lt;/span&gt;&lt;strong&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;】&lt;/span&gt;&lt;/strong&gt;&lt;/p&gt;\r\n&lt;p style=&quot;margin: 5px 0px; font-family: sans-serif; font-size: 16px; white-space: normal;&quot;&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;邀好友，免费送45元&lt;/span&gt;&lt;/p&gt;\r\n&lt;p style=&quot;margin: 5px 0px; font-family: sans-serif; font-size: 16px; white-space: normal;&quot;&gt;&lt;strong&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;二、【&lt;/span&gt;&lt;/strong&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;活动时间&lt;/span&gt;&lt;strong&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;】&lt;/span&gt;&lt;/strong&gt;&lt;/p&gt;\r\n&lt;p style=&quot;margin: 5px 0px; font-family: sans-serif; font-size: 16px; white-space: normal;&quot;&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;2016年1月1日-2016年2月29日&lt;/span&gt;&lt;/p&gt;\r\n&lt;p style=&quot;margin: 5px 0px; font-family: sans-serif; font-size: 16px; white-space: normal;&quot;&gt;&lt;strong&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;三、【&lt;/span&gt;&lt;/strong&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;活动内容&lt;/span&gt;&lt;strong&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;】&lt;/span&gt;&lt;/strong&gt;&lt;/p&gt;\r\n&lt;p style=&quot;margin: 5px 0px; font-family: sans-serif; font-size: 16px; white-space: normal;&quot;&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;1、活动期间，通过手机微信邀请有礼活动页面邀请您的好友完成新会员注册，您可以获得30元电子代金券；&lt;/span&gt;&lt;/p&gt;\r\n&lt;p style=&quot;margin: 5px 0px; font-family: sans-serif; font-size: 16px; white-space: normal;&quot;&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;2、活动期间，您邀请注册的新会员好友在活动期间内，通过APP/官网/&lt;/span&gt;&lt;img _src=&quot;http://10.2.100.33:12001/Scripts/ueditor1/themes/default/images/spacer.gif&quot; src=&quot;http://10.2.100.33:12001/Scripts/ueditor1/themes/default/images/spacer.gif&quot; style=&quot;border: 1px solid rgb(221, 221, 221); background-image: url(http://10.2.100.33:12001/Scripts/ueditor1/lang/zh-cn/images/localimage.png); background-attachment: initial; background-size: initial; background-origin: initial; background-clip: initial; background-position: 50% 50%; background-repeat: no-repeat;&quot; word_img=&quot;file:///D:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\wangli\\\\\\\\\\\\\\\\AppData\\\\\\\\\\\\\\\\Local\\\\\\\\\\\\\\\\Temp\\\\\\\\\\\\\\\\SGTpbq\\\\\\\\\\\\\\\\5656\\\\\\\\\\\\\\\\0188B468.gif&quot; /&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;微信公众号（greentreeinn8）预订&lt;/span&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;并入住，您可获得15元现金红包：&lt;/span&gt;&lt;/p&gt;\r\n&lt;p style=&quot;margin: 5px 0px; font-family: sans-serif; font-size: 16px; white-space: normal;&quot;&gt;&lt;span style=&quot;font-family: 宋体, SimSun; font-size: 14px;&quot;&gt;3、活动期间，您邀请的新会员首次登陆APP，您可获得30元电子代金券。&lt;/span&gt;&lt;/p&gt;","bannerUrl":"http://app.greentree.cn/Public/uploadfile/content/2016/01/20160113034653370.jpg"},{"bannerId":1287,"description":"&lt;span style=&quot;font-size: 14px;&quot;&gt;&lt;span style=&quot;font-family: 宋体;&quot;&gt;&lt;strong&gt;一、【活动时间】&lt;/strong&gt;&lt;br /&gt;\r\n2016年2月1日-2017年1月31日&lt;br /&gt;\r\n&lt;br /&gt;\r\n&lt;strong&gt;二、【活动对象】&lt;/strong&gt;&lt;br /&gt;\r\n所有持银联信用卡的客人（卡号62开头）&lt;br /&gt;\r\n&lt;br /&gt;\r\n&lt;strong&gt;三、【活动范围】&lt;/strong&gt;&lt;br /&gt;\r\n格林东方、格林豪泰、格林联盟、青皮树&lt;br /&gt;\r\n&lt;br /&gt;\r\n四、【&lt;strong&gt;活动详情&lt;/strong&gt;】&lt;br /&gt;\r\n格林会员（非会员可免费注册）在2016年2月1日至2017年1月31日期间，通过格林豪泰手机APP、微信公众号或官网预订酒店，使用卡号62开头银联信用卡通过银联在线支付，并在活动期间内入住离店的订单，可尊享以下活动优惠。&lt;br /&gt;\r\n1、￥15返现优惠（限周六、周二）&lt;br /&gt;\r\n每周六、周二，首次使用银联信用卡通过银联在线支付，享15元返现。&lt;br /&gt;\r\n2、￥30专属礼券&lt;br /&gt;\r\n活动期间,每单赠送30元代金券。&lt;br /&gt;\r\n3、免费房券&lt;br /&gt;\r\n活动期间，月度入住3次或以上，即有机会获得格林免费房券1张。&lt;br /&gt;\r\n4、中高端酒店权益增值服务（限周六、周二）&lt;br /&gt;\r\n每周六、周二，会员在格林豪泰手机APP、微信公众号或官网通过银联在线支付格林东方房费，可尊享198元特价抢订（含单早），延迟退房（最晚至当天14:00），女性入住赠面膜、牛奶、饮料、特色礼品等权益增值服务。&lt;br /&gt;\r\n&lt;br /&gt;\r\n五&lt;strong&gt;、【分享有礼】&lt;/strong&gt;&lt;/span&gt;&lt;/span&gt;&lt;br /&gt;\r\n&lt;font size=&quot;2&quot;&gt;分享本活动并截图发给格林豪泰官方微信，还有机会赢得额外奖励。&lt;/font&gt;&lt;br /&gt;\r\n&lt;br /&gt;\r\n&lt;span style=&quot;font-size: 14px;&quot;&gt;&lt;span style=&quot;font-family: 宋体;&quot;&gt;六&lt;strong&gt;、【特殊说明】&lt;/strong&gt;&lt;br /&gt;\r\n1、99.8元、108元、118元等各类特惠房、休闲房不参加银联在线支付返现，若用银联信用卡在线支付99.8房、特惠房、休闲房，将自动扣除返现机会。&lt;br /&gt;\r\n2、若支付成功后取消仍会扣除返现机会。&lt;br /&gt;\r\n3、返现在结账离店后自动计入会员账户，非会员预订时先免费注册会员即可。返现资金可用于网上预订支付及购物，也可申请提现，低于100元提现收取5元手续费。&lt;br /&gt;\r\n4、专属礼券在订单入住离店后发送至会员卡内。专属礼券可使用的酒店及房型以网上房型预订界面代金券标识为准，且只有在使用银联信用卡支付的情况下方可使用，有效期6个月。&lt;br /&gt;\r\n5、免房券可在格林旗下所有品牌（格林东方、格林豪泰、格林联盟、青皮树）免费住宿1晚（房间门市价不能高于300元，有效期12个月）。&lt;br /&gt;\r\n6、每月免费房券获奖名单将于次月在格林豪泰官网和官方微信Greentreeinn8公布，敬请关注。&lt;br /&gt;\r\n7、借记卡等其他卡种不能参加。&lt;/span&gt;&lt;/span&gt;","bannerUrl":"http://app.greentree.cn/Public/uploadfile/content/2016/02/20160201115025694.jpg"}]}
     */

    private String result;
    private String message;
    private ResponseDataEntity responseData;

    public static Header objectFromData(String str) {

        return new Gson().fromJson(str, Header.class);
    }

    public static Header objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), Header.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<Header> arrayHeaderFromData(String str) {

        Type listType = new TypeToken<ArrayList<Header>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<Header> arrayHeaderFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<Header>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setResponseData(ResponseDataEntity responseData) {
        this.responseData = responseData;
    }

    public String getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public ResponseDataEntity getResponseData() {
        return responseData;
    }

    public static class ResponseDataEntity {
        /**
         * bannerId : 1278
         * description : &lt;span style=&quot;font-family: 宋体;&quot;&gt;&lt;span style=&quot;font-size: 14px;&quot;&gt;一、【活动时间】&lt;br /&gt;
         2016年1月16日－2016年2月22日&lt;br /&gt;
         &lt;br /&gt;
         二、【活动内容】&lt;br /&gt;
         1、 每日1000个红包，等您来领&lt;br /&gt;
         每位会员可领取3次＂格林红包＂，除夕、初一、元宵节三天可额外领取3次＂格林红包＂；每日领取时间12:30/15:30/19:00/21:00。 每日红包奖池：一千元现金/ 免房券红包、一万元代金券红包。 会员关注格林微信，可给好友发送电子代金券、现金券、储值红包。&lt;br /&gt;
         2、特惠豪房天天享&lt;br /&gt;
         活动期间，会员不限次数，预订入住99.8元特惠房。 更有108元/118/128元等多档限量/连住特惠房海量上线。 具体以官网/APP/H5的酒店详情界面房型房价信息为准。&lt;br /&gt;
         3、 门店礼遇惊喜多&lt;br /&gt;
         除夕、初一入住客人，可在酒店前台领取一个红包，惊喜连连；元宵节入住客人，可参与酒店猜灯谜游戏，赢取礼品。&lt;br /&gt;
         温馨提示：具体参与门店与活动详情，请咨询酒店前台。&lt;/span&gt;&lt;/span&gt;
         * bannerUrl : http://app.greentree.cn/Public/uploadfile/content/2016/02/20160216014659888.jpg
         */

        private List<BannerListEntity> bannerList;

        public static ResponseDataEntity objectFromData(String str) {

            return new Gson().fromJson(str, ResponseDataEntity.class);
        }

        public static ResponseDataEntity objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), ResponseDataEntity.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<ResponseDataEntity> arrayResponseDataEntityFromData(String str) {

            Type listType = new TypeToken<ArrayList<ResponseDataEntity>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<ResponseDataEntity> arrayResponseDataEntityFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<ResponseDataEntity>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public void setBannerList(List<BannerListEntity> bannerList) {
            this.bannerList = bannerList;
        }

        public List<BannerListEntity> getBannerList() {
            return bannerList;
        }

        public static class BannerListEntity {
            private int bannerId;
            private String description;
            private String bannerUrl;

            public static BannerListEntity objectFromData(String str) {

                return new Gson().fromJson(str, BannerListEntity.class);
            }

            public static BannerListEntity objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), BannerListEntity.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<BannerListEntity> arrayBannerListEntityFromData(String str) {

                Type listType = new TypeToken<ArrayList<BannerListEntity>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<BannerListEntity> arrayBannerListEntityFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<BannerListEntity>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public void setBannerId(int bannerId) {
                this.bannerId = bannerId;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public void setBannerUrl(String bannerUrl) {
                this.bannerUrl = bannerUrl;
            }

            public int getBannerId() {
                return bannerId;
            }

            public String getDescription() {
                return description;
            }

            public String getBannerUrl() {
                return bannerUrl;
            }
        }
    }
}
