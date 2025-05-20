package BufferedStream;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //需求：   利用字节缓冲流拷贝文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("javaseproject\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("javaseproject\\a_copy.txt"));

        int b;
        while((b=bis.read())!=-1){
            bos.write(b);
        }
        bos.close();
        bis.close();
    }
}
