import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Test4类用于统计指定目录下各种文件类型的数量
 */
public class Test4 {
    /**
     * 程序入口点
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 创建File对象，指向指定目录
        File file = new File("javaseproject\\aaa");
        // 调用getCount方法统计文件类型数量
        HashMap<String,Integer> hm = getCount(file);
        // 打印统计结果
        System.out.println(hm);
    }

    /**
     * 递归统计指定目录下各种文件类型的数量
     * @param src 要统计的源文件或目录
     * @return 包含文件类型及其对应数量的HashMap
     */
    public static HashMap<String,Integer> getCount(File src){
        // 创建HashMap用于存储文件类型及其数量
        HashMap<String,Integer> hm = new HashMap<>();
        // 获取目录下的所有文件和子目录
        File[] files = src.listFiles();
        // 判断目录是否为空
        if(files!=null){
            // 遍历目录下的每个文件或子目录
            for (File file : files) {
                // 判断是否为文件
                if(file.isFile()){
                    // 获取文件名
                    String name = file.getName();
                    // 分割文件名获取文件扩展名
                    String[] arr = name.split("\\.");
                    // 判断文件名是否包含扩展名
                    if(arr.length>=2){
                        // 获取文件扩展名
                        String endName = arr[arr.length-1];
                        // 判断HashMap中是否已存在该文件类型
                        if(hm.containsKey(endName)){
                            // 存在则数量加1
                            int count = hm.get(endName);
                            count++;
                            hm.put(endName,count);
                        }else {
                            // 不存在则添加到HashMap中，数量为1
                            hm.put(endName,1);
                        }
                    }
                }else{
                    // 如果是子目录，则递归调用getCount方法统计子目录中的文件类型数量
                    HashMap<String,Integer> sonMap = getCount(file);
                    // 获取子目录中每一种文件类型的数量
                    Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                    // 遍历子目录中的文件类型数量
                    for (Map.Entry<String, Integer> entry : entries) {
                        String key = entry.getKey();
                        int value = entry.getValue();
                        // 判断HashMap中是否已存在该文件类型
                        if(hm.containsKey(key)){
                            // 存在则将数量相加
                            int count = hm.get(key);
                            count=count+value;
                            hm.put(key,count);
                        }else{
                            // 不存在则添加到HashMap中
                            hm.put(key,value);
                        }
                    }
                }
            }
        }
        // 返回统计结果
        return hm;
    }
}
