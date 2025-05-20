package ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //练习：文件拷贝

        FileInputStream fis = new FileInputStream("F:\\code-java\\javaseproject\\a.txt");
        FileOutputStream fos = new FileOutputStream("F:\\code-java\\javaseproject\\b.txt");
        int b;
        while((b=fis.read())!=-1){
            fos.write(b);
        }
        fos.close();
        fis.close();

    }
}
