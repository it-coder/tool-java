package com.github.lihang1991.tools.controller;

import com.github.lihang1991.tools.util.QRCodeUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 二维码生成工具测试类
 * @author lih
 * @create 2019-10-15-18:31.
 */
@RestController
@RequestMapping(value = "qrcode")
public class QrcodeController {

    @RequestMapping(value = "gen", method = RequestMethod.GET)
    public void createQrcode(@RequestParam String content, HttpServletRequest request, HttpServletResponse response) {
        try (ServletOutputStream stream = response.getOutputStream()) {
            QRCodeUtil.encode(content, stream);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "genLogo", method = RequestMethod.GET)
    public void createLogoQrcode(@RequestParam String content, HttpServletRequest request, HttpServletResponse response) {
        try (ServletOutputStream stream = response.getOutputStream()) {
            final String s = Thread.currentThread().getContextClassLoader().getResource("").getPath()
                    + "static/logo/lih_logo.png";
            QRCodeUtil.encode(content, s, stream, true);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
