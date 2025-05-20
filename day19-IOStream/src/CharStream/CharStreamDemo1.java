package CharStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            FileReader
                1.创建对象
                2.读取数据
                    public int read()

                3.释放资源
         */
        FileReader fr = new FileReader("F:\\code-java\\javaseproject\\a.txt");

        int ch;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();

    }
}
