package Test_Stage1;
import java.io.*;
public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
            需求：
                文件加密


            ^：异或
                两边相同：false
                两边不同：true
         */
        //创建对象关联原始文件
        FileInputStream fis = new FileInputStream("要关联的文件");
        //创建对象关联加密文件
        FileOutputStream fos = new FileOutputStream("文件目的地");
        int b;
        while((b=fis.read())!=-1){
            fos.write(b^2);
        }
        fos.close();
        fis.close();
        //解密时把程序正确关联的文件改成之前的文件目的地，然后在把之前的文件目的地改成一个新的文件目的地
        //新的文件目的地就是解密后的结果了
    }
}
