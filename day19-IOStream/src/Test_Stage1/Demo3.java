package Test_Stage1;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) throws IOException{
        /*
            文本文件中有以下的数据：
                2-1-9-4-7-8
            将文件中的数据进行排序，变成以下的数据：
                1-2-4-7-8-9
         */
        //1.读取数据
        FileReader fr = new FileReader("F:\\code-java\\javaseproject\\a.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while((ch=fr.read())!=-1){
            sb.append((char)ch);
        }
        fr.close();
        System.out.println(sb);
        //2.排序
        String string = sb.toString();
        String[] arrStr = string.split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arrStr) {
            int i = Integer.parseInt(s);
            list.add(i);
        }
        Collections.sort(list);
        FileWriter fw = new FileWriter("F:\\code-java\\javaseproject\\a.txt");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                fw.write((int)list.get(i)+"");
            }else{
                fw.write((int)list.get(i)+"-");
            }
        }
        fw.close();

        //3.写出
    }
}
