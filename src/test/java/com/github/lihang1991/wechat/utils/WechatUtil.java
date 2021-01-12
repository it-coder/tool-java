package com.github.lihang1991.wechat.utils;

import cn.hutool.http.HttpUtil;
import com.github.lihang1991.tools.util.JacksonUtil;

import java.util.Map;

/**
 * @author lih
 * @create 2017-08-02-17:33.
 */
public class WechatUtil {

    // 获取全部ACCESS_TOKEN url{ grant_type=lient_credential}
    private static String ACCESS_TOKEN_URI = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";

    public static String getAccessToken(String appid, String secret) {
        String url = ACCESS_TOKEN_URI.replace("APPID", appid).replace("APPSECRET", secret);
        String result = HttpUtil.get(url);
        Map map = JacksonUtil.toObject(result, Map.class);
        String access_token = null;
        if (map.get("access_token") != null) {
            access_token = map.get("access_token").toString();
        }

        return access_token;
    }
}
