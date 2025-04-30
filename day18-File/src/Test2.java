import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        //需求：定义一个方法找某个文件夹，是否有以avi结尾的电影
        File file = new File("javaseproject\\aaa");
        boolean b = haveAVI(file);
        System.out.println(b);

    }
    public static boolean haveAVI(File file){
        File[] files = file.listFiles();
        if(files!=null){
            for (File file1 : files) {
                if(file1.isFile()&&file1.getName().endsWith(".avi"))
                    return true;
            }
        }
        return false;
    }
}
