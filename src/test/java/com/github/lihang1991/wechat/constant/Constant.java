package com.github.lihang1991.wechat.constant;

/**
 *  微信常量
 * @author lih
 * @create 2017-08-08-16:21.
 */
public class Constant {

    /** 获取用户信息类型 */
    public final static String SNSAPI_USERINFO = "snsapi_userinfo";
    public final static String SNSAPI_BASE = "snsapi_base";



    // 1. 获取code url (redirect_uri urlencode)
    public static String CODE_URI = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect";

    // 2. 换取access_token url
    public static String ACCESS_TOKEN_URI = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";

    // 3. 通过2获取的refresh_token刷新换取access_token url
    public static String REFRESH_TOKEN_URI = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=APPID&grant_type=refresh_token&refresh_token=REFRESH_TOKEN";

    // 4. 拉去用户信息
    public static String USER_INFO_URI  = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";

    // 5. 校验凭证是否有效
    public static String ACCESS_TOKEN_VALIDATE_URI = "https://api.weixin.qq.com/sns/auth?access_token=ACCESS_TOKEN&openid=OPENID";
}
