package sort;

public class BubbleDemo1 {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {2,4,5,3,1};

        for(int j=0;j<arr.length-1;j++){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
