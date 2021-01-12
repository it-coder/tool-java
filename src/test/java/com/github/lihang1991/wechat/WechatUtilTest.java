package com.github.lihang1991.wechat;

import com.github.lihang1991.tools.util.JacksonUtil;
import com.github.lihang1991.wechat.menu.MenuUtil;
import com.github.lihang1991.wechat.utils.WechatUtil;
import org.junit.Test;

/**
 * @author lih
 * @create 2017-08-02-17:19.
 */
public class WechatUtilTest {

    // appid
    public static String APP_ID = "wxc0e75ec4980093b0";

    // app_secret
    public static String APP_SECRET = "e0d11dc35723fdf2696a1183f76b6c77";

    @Test
    public void delete(){
        String accessToken = WechatUtil.getAccessToken(APP_ID, APP_SECRET);
        String s = MenuUtil.deleteMenu(accessToken);
        System.out.println("delete menu success:" + s);
        System.out.println("delete menu success");

    }
    @Test
    public void create() {
        String accessToken = WechatUtil.getAccessToken(APP_ID, APP_SECRET);
        MenuUtil.deleteMenu(accessToken);
        System.out.println(JacksonUtil.toJSON(MenuUtil.initMenu()));
        int result = MenuUtil.createMenu(JacksonUtil.toJSON(MenuUtil.initMenu()), accessToken);
        if (result == 0) {
            System.out.println("create menu success");
        } else {
            System.out.println("error code : " + result);
        }
    }
}
