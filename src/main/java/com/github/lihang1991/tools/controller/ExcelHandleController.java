package com.github.lihang1991.tools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * excel处理
 *
 * @author lih
 * @create 2019-10-27-11:21.
 */
@Controller
@RequestMapping("import")
public class ExcelHandleController {

    @RequestMapping("excel")
    public void importExcel(MultipartFile file) {

    }


}
