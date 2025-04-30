import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        //需求：删除一个多级文件夹
        File file = new File("javaseproject\\aaa");
        delete(file);
    }
    public static void delete(File src){
        File[] files =src.listFiles();
        if(files!=null){
            for (File file : files) {
                if(file.isFile()){
                    file.delete();
                }else{
                    delete(file);
                }
            }
        }

    }
}
