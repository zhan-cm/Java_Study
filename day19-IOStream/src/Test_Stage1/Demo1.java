package Test_Stage1;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
            需求：拷贝一个文件夹，考虑子文件夹
         */
        //创建数据源
        File src = new File("D:\\aaa\\src");
        File dest = new File("D:\\aaa\\dest");
        CopyDir(src,dest);

    }
    public static void CopyDir(File src,File dest) throws IOException {
        //递归
        //1.进入数据源
        File[] files = src.listFiles();
        //2.遍历数组
        if (files!=null) {
            for (File file : files) {
                if(file.isFile()){
                    //如果是文件--拷贝
                    FileInputStream fis = new FileInputStream(src);
                    FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                    byte[] bytes = new byte[1024];
                    int len;
                    while((len= fis.read(bytes))!=-1){
                        fos.write(bytes,0,len);
                    }
                    fos.close();
                    fis.close();
                }else{
                    //如果是是文件夹--打开子文件--递归
                    CopyDir(file,new File(dest,file.getName()));
                }
            }
        }
    }
}
