package BufferedStream;

import java.io.*;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输入流/输出流

        BufferedReader br = new BufferedReader(new FileReader("javseproject\\a.txt"));

        String line = br.readLine();
        System.out.println(line);

        br.close();

        BufferedWriter bw =new BufferedWriter(new FileWriter("javseproject\\a.txt"));
        bw.write("只因你太美（doge）");
        bw.newLine();bw.write("baby");
        bw.close();


    }
}
