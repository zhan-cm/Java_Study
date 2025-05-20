package ZipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建一个File表示要解压的压缩包
        File src = new File("D:\\aaa.zip");
        //创建一个File表示要解压的目的地
        File dest = new File("D:\\");
        unzip(src,dest);

    }
    //定义一个方法来解压
    public static void unzip(File src,File dest) throws IOException {
        //解压本质：把压缩包里面每一个文件或者文件夹读取出来，按照层级拷贝到目的地中

        //创建一个压缩流用来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        //要先获取压缩吧里面的每一个zipentry对象

        ZipEntry entry;
        while((entry=zip.getNextEntry())!=null){
            System.out.println(entry);

            if(entry.isDirectory()){
                //文件夹：需要在目的地dest处创建一个同样的文件夹
                File file = new File(dest,entry.toString());
                file.mkdir();
            }else{
                //文件：需要读取到压缩包中的文件，并把他存放到目的地dest文件夹中（按照层级目录进行存放）
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while((b=zip.read())!=-1){
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
