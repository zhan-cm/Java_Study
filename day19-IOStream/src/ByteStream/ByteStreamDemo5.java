package ByteStream;

import java.io.*;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
        //public int read(byte[] buffer)   一次读一个字节数组数据
        FileInputStream fis = new FileInputStream("F:\\code-java\\javaseproject\\a.txt");
        FileOutputStream fos = new FileOutputStream("F:\\code-java\\javaseproject\\b.txt");

        //拷贝
        int len;//表示当前读取到的字节个数
        byte[] bytes = new byte[2];
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();



    }
}
