package ByteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
        字节输入流：FileInputStream
        实现需求：读取文件中的数据
        实现步骤:
            创建对象
                细节1：如果文件不存在，就直接报错
            读取数据
                细节1：依次读一个字节，读出来的是数据在ASCII上对应的数字
                细节2：读到文件末尾了，read方法返回-1
            释放数据
         */

        FileInputStream fis = new FileInputStream("F:\\code-java\\javaseproject\\a.txt");
        //int b1 = fis.read();
        //System.out.println(b1);
        //循环读取
        int b;
        while((b=fis.read())!=-1){
            System.out.println((char)b);
        }
        fis.close();


    }
}
