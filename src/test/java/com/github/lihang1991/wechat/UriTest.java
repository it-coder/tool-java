package com.github.lihang1991.wechat;

import com.zjrcinfo.cpark.wechat.constant.Constant;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author lih
 * @create 2017-08-08-16:41.
 */
public class UriTest {

    public static void main(String[] args) {
        try {
            getCodeUri();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private static void getCodeUri() throws UnsupportedEncodingException {
        //String redirect_uri = "http://dysgpt.dongyang.gov.cn/sscWechat/wechat/index";
    	String redirect_uri = "http://2vq86j.natappfree.cc/sscWechat/wechat/index";
        String uri  = Constant.CODE_URI;
        uri = uri.replace("APPID", Constant.APP_ID)
                .replace("REDIRECT_URI", URLEncoder.encode(redirect_uri, "UTF-8"))
                .replace("SCOPE", Constant.SNSAPI_USERINFO)
                .replace("STATE", "/interaction/edit");
        String uri2  = Constant.CODE_URI;
        //多个参数用到&时  使用 %26
        uri2 = uri2.replace("APPID", Constant.APP_ID)
        		.replace("REDIRECT_URI", URLEncoder.encode(redirect_uri, "UTF-8"))
                .replace("SCOPE", Constant.SNSAPI_USERINFO)
                .replace("STATE", "/interaction/edit?type=1%26number=2"); 
//        JedisPoolConfig config = new JedisPoolConfig();
//        config.setMaxTotal(1024);
//        config.setMaxIdle(200);
//        config.setMaxWaitMillis(10000);
//        config.setTestOnBorrow(true);
//        JedisPool jedisPool = new JedisPool(config, "127.0.0.1", 6379, 10000);
//        Jedis j = jedisPool.getResource();
//        j.set("name", "ztb");
        System.out.println(uri2);
//        jedisPool.close();
    }
}
