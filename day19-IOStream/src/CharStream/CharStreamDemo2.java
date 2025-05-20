package CharStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            FileReader
                1.创建对象
                2.读取数据
                    public int read(char[] buffer)
                3.释放资源
         */
        FileReader fr = new FileReader("F:\\code-java\\javaseproject\\a.txt");
        char[] ch = new char[2];
        int len;
        //read(ch)：读取数据，解码，强转三步合并在一起，把墙强转的结果放到数组当中
        while((len = fr.read(ch))!=-1){
            //把数组中的数据变成字符串
            System.out.print(new String(ch,0,len));

        }
        fr.close();
    }
}
