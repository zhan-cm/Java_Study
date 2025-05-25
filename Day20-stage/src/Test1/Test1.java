package Test1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
    获取姓氏:https://hanyy,baidu.com/shici/detai1?pid=0b2f26d4ceddb3ee693fdb1137ee1bed&from=kg0
    获取男生名字:http://www.haoming8.cn/baobao/10881.htm1
    获取女生名字:http://www.haoming8.cn/baobao/7641.htm1
     */
        //1.定义变量记录网址
        String familyNameNet = "https://www.diyifanwen.com/tool/baijiaxing/";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2.爬取数据，把网址上所有的数据拼接成一个字符串
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);
        //System.out.println(familyNameStr);
        System.out.println(boyNameStr);
        //System.out.println(girlNameStr);

        //3.通过正则表达式，把其中的数据获取出来
        ArrayList<String> finalNameTempList = getData(familyNameStr, "(.{4})(，|。)",1);
        System.out.println(finalNameTempList);
    }


    private static ArrayList<String> getData(String str, String regex,int index) {
        //1.创建集合存储数据
        ArrayList<String> list = new ArrayList<>();
        //2.按照正则表达式的规则，去获取数据
        Pattern pattern = Pattern.compile(regex);
        //按照Pattern的规则，到str当中获取数据
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            list.add(matcher.group(index));
        }
        return list;
    }

    /*
    作用：从网络爬取数据，把数据拼接
    形参：
        网址
     返回值：
        爬取到的所有数据
     */
    public static String webCrawler(String net) throws IOException {
        //1.定义StringBuilder拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        //2.创建一个URL对象
        URL url = new URL(net);
        //3.链接网址
        //细节：保证网络畅通，网址可以链接
        URLConnection conn = url.openConnection();
        //4.读取数据
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        //5.释放资源
        isr.close();
        //6.返回数据
        return sb.toString();
    }

}
