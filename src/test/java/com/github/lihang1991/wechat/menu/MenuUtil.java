package com.github.lihang1991.wechat.menu;

import cn.hutool.http.HttpUtil;

import java.nio.charset.Charset;

/**
 * @author lih
 * @create 2017-08-02-17:18.
 */
public class MenuUtil {
    // 创建菜单url
    private static String CREATE_MENU_URL = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
    // 查询菜单url
    private static String QUERY_MENU_URL = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";
    // 删除菜单url
    private static String DELETE_MENU_URI = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";

    private final static String CHARSET_UTF8 = "UTF-8";

    public static Menu initMenu(){
        Menu menu = new Menu();
//        ClickButton clickButton = new ClickButton();
//        clickButton.setKey("clickButton");
//        clickButton.setType("click");
//        clickButton.setName("clickMenu");
//
//        ViewButton viewButton = new ViewButton();
//        viewButton.setName("viewButton");
//        viewButton.setType("view");
//        viewButton.setUrl("http://www.baidu.com");
//
//        ClickButton clickButton1 = new ClickButton();
//        clickButton1.setKey("scanButton");
//        clickButton1.setType("scancode_push");
//        clickButton1.setName("scanButton");
//
//        ClickButton clickButton2 = new ClickButton();
//        clickButton2.setKey("locationButton");
//        clickButton2.setType("location_select");
//        clickButton2.setName("locationButton");
//
//        Button button = new Button();
//        button.setName("Menu");
//        button.setSub_button(new Button[]{clickButton1, clickButton2});
        
//        ViewButton viewButton1 = new ViewButton();
//        viewButton1.setName("企业自查");
//        viewButton1.setType("view");
//        viewButton1.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx2eb21c7f8e159054&redirect_uri=http%3A%2F%2F888.nat300.top%2FsscWechat%2Fwechat%2Findex&response_type=code&scope=snsapi_userinfo&state=/cp/index#wechat_redirect");
        
        ViewButton viewButton1 = new ViewButton();
        viewButton1.setName("baidu");
        viewButton1.setType("view");
        viewButton1.setUrl("https://baidu.com");
        
        ViewButton viewButton2 = new ViewButton();
        viewButton2.setName("投诉记录");
        viewButton2.setType("view");
        viewButton2.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx2eb21c7f8e159054&redirect_uri=http%3A%2F%2F2vq86j.natappfree.cc%2FsscWechat%2Fwechat%2Findex&response_type=code&scope=snsapi_userinfo&state=/interaction/list?type=1%26number=2#wechat_redirect");
                
        Button button1 = new Button();
        button1.setName("投诉举报");
        button1.setSub_button(new Button[]{viewButton1, viewButton2});
        
        
        ViewButton viewButton3 = new ViewButton();
        viewButton3.setName("我要咨询");
        viewButton3.setType("view");
        viewButton3.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx2eb21c7f8e159054&redirect_uri=http%3A%2F%2F2vq86j.natappfree.cc%2FsscWechat%2Fwechat%2Findex&response_type=code&scope=snsapi_userinfo&state=/interaction/edit?type=2%26number=2#wechat_redirect");
        
        ViewButton viewButton4 = new ViewButton();
        viewButton4.setName("咨询记录");
        viewButton4.setType("view");
        viewButton4.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx2eb21c7f8e159054&redirect_uri=http%3A%2F%2F2vq86j.natappfree.cc%2FsscWechat%2Fwechat%2Findex&response_type=code&scope=snsapi_userinfo&state=/interaction/list?type=2%26number=2#wechat_redirect");
                
        Button button2 = new Button();
        button2.setName("办事咨询");
        button2.setSub_button(new Button[]{viewButton3, viewButton4});
        
        ViewButton viewButton5 = new ViewButton();
        viewButton5.setName("我要服务");
        viewButton5.setType("view");
        viewButton5.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx2eb21c7f8e159054&redirect_uri=http%3A%2F%2F2vq86j.natappfree.cc%2FsscWechat%2Fwechat%2Findex&response_type=code&scope=snsapi_userinfo&state=/interaction/edit?type=3%26number=2#wechat_redirect");
        
        ViewButton viewButton6 = new ViewButton();
        viewButton6.setName("服务记录");
        viewButton6.setType("view");
        viewButton6.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx2eb21c7f8e159054&redirect_uri=http%3A%2F%2F2vq86j.natappfree.cc%2FsscWechat%2Fwechat%2Findex&response_type=code&scope=snsapi_userinfo&state=/interaction/list?type=3%26number=2#wechat_redirect");
                
        Button button3 = new Button();
        button3.setName("便民服务");
        button3.setSub_button(new Button[]{viewButton5, viewButton6});
        
        
        
        

        menu.setButton(new Button[]{button1,button2,button3});
        return menu;
    }


    //创建菜单的url拼接
    public static int createMenu(String menu, String token){
        String url = CREATE_MENU_URL.replace("ACCESS_TOKEN", token);
        int result = 0;
        String jsonObject = null;
        try {
            jsonObject = HttpUtil.post(url, menu);
            System.out.println(jsonObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    //查询菜单的url的拼接
    public static String queryMenu(String token){
        String url = QUERY_MENU_URL.replace("ACCESS_TOKEN", token);
        String jsonObject = HttpUtil.get(url, Charset.forName(CHARSET_UTF8));
        return jsonObject;
    }

    // 删除菜单
    public static String deleteMenu(String token) {
        String url = DELETE_MENU_URI.replace("ACCESS_TOKEN", token);
        String result = HttpUtil.get(url, Charset.forName(CHARSET_UTF8));
        return result;
    }

}
