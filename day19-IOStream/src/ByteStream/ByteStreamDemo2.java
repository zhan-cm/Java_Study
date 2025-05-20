package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //换行写
            //写一个换行符
            //windows \r\n  也可以写成  \n   or   \r
            //linux \n
            //mac \r
        //续写
            /*
                如果想续写，打开续写开关即可
                开关位置：创建对象的第二个参数
                默认false，表示关闭续写，此时创建对象会清空文件
                手动传递true，表示打开学些，此时创建对象不会清空文件
             */

        FileOutputStream fileOutputStream = new FileOutputStream("F:\\code-java\\javaseproject\\a.txt",true);
        //输入：wozuilihai
        String str = "wozuilihai";
        byte[] bytes = str.getBytes();
        fileOutputStream.write(bytes);
        //fileOutputStream.close();

        String wrap = "\r\n";
        byte[] bytes1 = wrap.getBytes();
        fileOutputStream.write(bytes1);

        String str2 ="666";
        byte[] bytes2 = str2.getBytes();
        fileOutputStream.write(bytes2);

        fileOutputStream.close();
    }
}
