package com.github.lihang1991.util;

import com.github.lihang1991.enums.FileTypeEnum;
import org.junit.Test;

import java.io.IOException;

/**
 * 获取附件真实的类型格式
 *
 * @author lih
 * @create 2019-09-10-10:27.
 */
public class FileTypeTest {

    @Test
    public void testType() throws IOException {
        FileTypeEnum type = FileTypeUtil.getType("C:\\Users\\lih\\Pictures\\images.JPEG");
        System.out.println(type.getValue());
        System.out.println(type.getSuffix());
    }
}
