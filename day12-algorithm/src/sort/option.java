package sort;

public class option {
    public static void main(String[] args) {
        //选择排序
        int[] arr = {2,4,5,3,1};

        for(int j =0;j<arr.length-1;j++){
            for (int i = j+1; i < arr.length; i++) {
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
