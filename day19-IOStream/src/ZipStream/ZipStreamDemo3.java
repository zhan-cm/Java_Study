package ZipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //压缩流：
        //      把D:\\aaa文件夹压缩成一个压缩包

        //1.创建File对象去表示要压缩的文件夹
        File src = new File("D:\\aaa");
        //2.创建File对象去表示要压缩包放在哪里
        File destParent = src.getParentFile();
        //3.创建File对象去表示要压缩包的路径
        File dest = new File(destParent,src.getName()+".zip");
        //4.创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //5.获取src里面的每一个文件，变成ZipEntry对象，放入到压缩包当中
        toZip(src,zos,src.getName());
        //6.释放资源
        zos.close();
    }
    public static void toZip(File src,ZipOutputStream zos,String name) throws IOException {
        //1.进入src文件夹
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            // 检查当前文件是否是一个普通文件而非目录
            if(file.isFile()){
                // 创建一个新的ZIP条目，并以其路径和文件名命名
                ZipEntry entry = new ZipEntry(name+"\\"+file.getName());
                // 将ZIP条目放入ZIP输出流中
                zos.putNextEntry(entry);
                // 创建文件输入流以读取当前文件
                FileInputStream fis = new FileInputStream(file);
                int b;
                // 读取文件内容并写入ZIP输出流中
                while((b=fis.read())!=-1){
                    zos.write(b);
                }
                // 关闭文件输入流
                fis.close();
                // 关闭当前ZIP条目，准备写入下一个条目
                zos.closeEntry();
            }else{
                // 如果当前文件是一个目录，则递归调用toZip方法，处理目录中的文件
                toZip(file,zos,name+"\\"+file.getName());
            }
        }
    }
}
