package ObjectStream;

import java.io.*;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //需求：利用序列化流/对象操作输出流，把一个对象写到本地文件中
        Student stu = new Student("zhangsan",23);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("javaseproject\\a.txt"));

        oos.writeObject(stu);

        oos.close();

        //反序列化/对象操作输出流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("javaseproject\\a.txt"));

        System.out.println(ois.readObject());

        ois.close();
    }
}
