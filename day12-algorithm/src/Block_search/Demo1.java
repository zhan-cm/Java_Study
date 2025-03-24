package Block_search;

public class Demo1 {
    public static void main(String[] args) {
        //分块查找
        //无规律
        int[] arr ={27,22,30,40,36,
                    13,19,16,20,
                    7,10,
                    43,50,48};

        //创建对象来存每一块
        Block_de b1 = new Block_de(22,40,0,4);
        Block_de b2 = new Block_de(13,20,5,8);
        Block_de b3 = new Block_de(7,10,9,10);
        Block_de b4 = new Block_de(43,50,11,13);

        int number = 7;

        //定义数组来创建索引表
        Block_de[] b = {b1,b2,b3,b4};
        int index = findIndex(b,arr,number);

        System.out.println(index);
    }

    private static int  findIndex(Block_de[] b,int[] arr,int number) {
        int index = findIndexInBlock(b,number);
        if(index==-1){
            return -1;
        }
        int start = b[index].getStartIndex();
        int end = b[index].getEndIndex();
        for(int i=start;i<=end;i++){
            if(arr[i]==number)
                return i;
        }
        return -1;
    }
    public static int findIndexInBlock(Block_de[] b,int number){
        for(int i=0;i<b.length;i++){
            if(number>=b[i].getMin()&&number<=b[i].getMax()){
                return i;
            }
        }
        return -1;
    }
}
class Block_de{
    private int min;
    private int max;
    private int startIndex;
    private int endIndex;

    public Block_de() {
    }

    public Block_de(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
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
