public class Test2 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] CopeArr=copyOfRange(arr,4,8);
        for (int i = 0; i < CopeArr.length; i++) {
            System.out.print(CopeArr[i]+" ");
        }
        
    }
    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] NewArr=new int[to-from];
        
        int index=0;
        for (int i = from; i < to; i++) {
            NewArr[index]=arr[i];
            index++;
        }
        return NewArr;
    }
}
