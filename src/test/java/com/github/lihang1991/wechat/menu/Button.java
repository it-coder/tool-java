package com.github.lihang1991.wechat.menu;

/**
 * @author lih
 * @create 2017-08-02-17:16.
 */
public class Button {

    private String type;
    private String name;
    private Button[] sub_button;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Button[] getSub_button() {
        return sub_button;
    }
    public void setSub_button(Button[] sub_button) {
        this.sub_button = sub_button;
    }
}
