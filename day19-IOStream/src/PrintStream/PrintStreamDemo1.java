package PrintStream;

import java.io.*;
import java.nio.charset.Charset;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //字节打印流

        PrintStream ps = new PrintStream(new FileOutputStream("javasrproject\\a.txt"),true, Charset.forName("GBK"));
        ps.println(97);//原样写出
        ps.close();

        //字符打印流

        PrintWriter pw = new PrintWriter(new FileWriter("javaseproject\\a.txt"),true);

        pw.println("你好");

        pw.close();



    }
}
