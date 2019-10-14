package com.github.lihang1991.enums;

import java.util.Objects;

/**
 * 附件类型格式
 *
 * @author lih
 * @create 2019-09-10-10:28.
 */
public enum FileTypeEnum {

    /** JPEG (jpg) **/
    JPG("ffd8ffe000104a464946", ".jpg"),
    /** PNG (png) */
    PNG("89504e470d0a1a0a0000", ".png"),
    GIF("47494638396126026f01", ".gif"), //GIF (gif)
    TIFF("49492a00227105008037", ".tif"), //TIFF (tif)
    BMP16("424d228c010000000000", ".bmp"), //16色位图(bmp)
    BMP24("424d8240090000000000", ".bmp"), //24位位图(bmp)
    BMP256("424d8e1b030000000000", ".bmp"), //256色位图(bmp)
    CAD("41433130313500000000", ".dwg"), //CAD (dwg)
    HTML("3c21444f435459504520", ".html"), //HTML (html)
    HTM("3c21646f637479706520", ".htm"), //HTM (htm)
    CSS("48544d4c207b0d0a0942", ".css"), //css
    JS("696b2e71623d696b2e71", ".js"), //js
    RTF("7b5c727466315c616e73", ".rtf"), //Rich Text Format (rtf)
    PSD("38425053000100000000", ".psd"), //Photoshop (psd)
    EML("46726f6d3a203d3f6762", ".eml"), //Email [Outlook Express 6] (eml)
    DOC("d0cf11e0a1b11ae10000", ".doc"), //MS Excel 注意：word、msi 和 excel的文件头一样
    VSD("d0cf11e0a1b11ae10000", ".vsd"), //Visio 绘图
    MDB("5374616E64617264204A", ".mdb"), //MS Access (mdb)
    PS("252150532D41646F6265", ".ps"),
    PDF("255044462d312e350d0a", ".pdf"), //Adobe Acrobat (pdf)
    RMVB("2e524d46000000120001", ".rmvb"), //rmvb/rm相同
    FLV("464c5601050000000900", ".flv"), //flv与f4v相同
    MP4("00000020667479706d70", ".mp4"),
    MP3("49443303000000002176", ".mp3"),
    MPG("000001ba210001000180", ".mpg"), //
    WMV("3026b2758e66cf11a6d9", ".wmv"), //wmv与asf相同
    WAV("52494646e27807005741", ".wav"), //Wave (wav)
    AVI("52494646d07d60074156", ".avi"),
    MID("4d546864000000060001", ".mid"), //MIDI (mid)
    ZIP("504b0304140000000800", ".zip"),
    RAR("526172211a0700cf9073", ".rar"),
    INI("235468697320636f6e66", ".ini"),
    JAR("504b03040a0000000000", ".jar"),
    EXE("4d5a9000030000000400", ".exe"),//可执行文件
    JSP("3c25402070616765206c", ".jsp"),//jsp文件
    MF("4d616e69666573742d56", ".mf"),//MF文件
    XML("3c3f786d6c2076657273", ".xml"),//xml文件
    SQL("494e5345525420494e54", ".sql"),//xml文件
    JAVA("7061636b616765207765", ".java"),//java文件
    BAT("406563686f206f66660d", ".bat"),//bat文件
    GZ("1f8b0800000000000000", ".gz"),//gz文件
    PROPERTIES("6c6f67346a2e726f6f74", ".properties"),//bat文件
    CLASS("cafebabe0000002e0041", ".class"),//bat文件
    CHM("49545346030000006000", ".chm"),//bat文件
    MXP("04000000010000001300", ".mxp"),//bat文件
    DOCX("504b0304140006000800", ".docx"),//docx文件
    WPS("d0cf11e0a1b11ae10000", ".wps"),//WPS文字wps、表格et、演示dps都是一样的
    TORRENT("6431303a637265617465", ".torrent"),
    MOV("6D6F6F76", ".mov"), //Quicktime (mov)
    WPD("FF575043", ".wpd"), //WordPerfect (wpd)
    DBX("CFAD12FEC5FD746F", ".dbx"), //Outlook Express (dbx)
    PST("2142444E", ".pst"), //Outlook (pst)
    QDF("AC9EBD8F", ".qdf"), //Quicken (qdf)
    PWL("E3828596", ".pwl"), //Windows Password (pwl)
    RAM("2E7261FD", ".ram"); //Real Audio (ram)

    private String value;
    private String suffix;


    FileTypeEnum(String value, String suffix) {
        this.value = value;
        this.suffix = suffix;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public static FileTypeEnum valueToEnum(String value) {
        for (FileTypeEnum fileTypeEnum : FileTypeEnum.values()) {
            if (Objects.equals(value, fileTypeEnum.getValue())) {
                return fileTypeEnum;
            }
        }
        return null;
    }

}
