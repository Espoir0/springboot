package team.arryn.aa.chapter3.test;

import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 测试java国际化
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //取得系统默认的国家语言环境
        Locale l = Locale.getDefault();
        // 根据国家语言环境加载资源文件
        ResourceBundle rb = ResourceBundle.getBundle("messageResource", l);
        String msg = new String(rb.getString("welcome").getBytes("ISO-8859-1"), "gbk");
        // 打印出从资源文件中取得的信息
        String format = MessageFormat.format(msg, "我", "一");
        System.out.println(format);
    }
}
