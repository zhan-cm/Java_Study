package Block_search;

public class Demo {
    public static void main(String[] args) {
        //分块查找
        /*
            核心思想：
                块内无序，块间有序
         */
        int[] arr = {16,5,9,12,21,18,
                     32,23,37,26,45,34,
                     50,48,61,52,73,66};
        //创建三个块的对象
        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45,6,11);
        Block b3 = new Block(73,12,17);

        //定义数组用来管理三个块的对象（索引表）
        Block[] blockArr = {b1,b2,b3};

        //定义变量用来记录要查找的元素
        int number = 32;

        //调用方法，传递索引表，数组，要查找的元素
        int index = getIndex(blockArr,arr,number);

        System.out.println(index);

    }

    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        int index = findIndexBlock(blockArr,number);
        if(index==-1){
            return -1;
        }
        int startIndex = blockArr[index].getStartIndex();
        int endIndex = blockArr[index].getEndIndex();
        for (int i = startIndex; i <= endIndex; i++) {
            if(arr[i]==number){
                return i;
            }
        }

        return -1;
    }
    //定义一个方法，用来确定number在哪个块当中
    public static int findIndexBlock(Block[] blockArr,int number){
        for(int i=0;i<blockArr.length;i++){
            if(number<blockArr[i].getMax()){
                return i;
            }
        }
        return -1;
    }
}
class Block{
    private int max;//最大值
    private int startIndex;//起始索引
    private int endIndex;//结束索引

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}
