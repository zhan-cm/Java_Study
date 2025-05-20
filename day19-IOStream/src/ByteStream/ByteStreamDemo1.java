package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //FileOutputStream---字节输出流
        /*
        1.创建对象
            细节1：参数是字符串表示的路径或者是FIle对象都是可以的
            细节2：如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的
            细节3：如果文件已存在，则会清空文件
        2.写出数据
            细节：write方法的参数是整数，但是实际上写到本地文件中的是整数在ASCII上对应的字符
        3.释放资源
            每次使用流之后都要释放资源
         */

        //1.创建对象
        //写出---输出流 OutputStream
        //本地文件---File
        FileOutputStream fos = new FileOutputStream("F:\\code-java\\javaseproject\\a.txt");
        //2.写出数据
        fos.write(97);
        //释放资源
        fos.close();

    }
}
