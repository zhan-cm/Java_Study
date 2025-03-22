package Test6;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        //创建一个数组
        Student[] arr=new Student[3];
        //创建学生对象并且加入到数组当中
        Student stu1 = new Student(1,"zhangsan",23);
        Student stu2 = new Student(2,"lisi",24);
        Student stu3 = new Student(3,"wangwu",25);
        //把学生对象添加到数组当中
        arr[0]=stu1;
        arr[1]=stu2;
        arr[2]=stu3;

        //要求1：再次添加一个学生对象，并且添加时候进行学号的唯一性判断
        Student stu4 = new Student(4,"zhaoliu",26);

        //唯一性判断
        //已存在 --- 不用添加
        //不存在 --- 就可以把学生对象添加进数组

        boolean flag = contains(arr,stu4.getId());
        if(flag){
            //已存在
            System.out.println("id重复，重新录入");
        }else{
             //不存在
              //1.存满
            //2.没存满
            int count =GetCount(arr);
            if(count==arr.length){
                //存满
                //创建一个新数组  长度 = 老数组的长度+1
                Student[] newArr = creatNewArr(arr);
                newArr[count]=stu4;
                printArr(newArr);

            }else{
                //没有存满
                arr[count]=stu4;
                printArr(arr);
            }


        }
        //要求2：添加完毕后，遍历所有学生信息

        //要求3：通过id删除学生信息
        //如果存在，则删除，如果不存在，则提示删除失败
        int index=getIndex(arr,2);
        if(index>=0){
            arr[index]=null;
            System.out.println();

            //要求4：删除完毕后，遍历所有学生信息
            printArr(arr);
        }else{
            System.out.println("id不存在，请重新输入");
        }


        //要求5：查询数组id为"2"的学生，如果存在，则将他的年龄+1岁
        int index1 =getIndex(arr,2);
        if(index>=0){
            Student stu =arr[index1];
            int newAge =stu.getAge()+1;
            stu.setAge(newAge);
        }else{
            System.out.println("不存在此id，修改失败");
        }





    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu !=null){
                System.out.println(stu.getId()+","+stu.getName()+","+stu.getAge());
            }
        }
    }
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            //把老数组元素
            newArr[i]=arr[i];
        }
        return newArr;
    }

    public static int GetCount(Student[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                count++;
            }
        }
        return count;
    }

    public static boolean contains(Student[] arr,int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            //没存满
            if(stu!=null) {
                int sid = stu.getId();
                if (sid == id) {
                    return true;
                }
            }
        }
        return false;
    }

    //找到id在数组中的索引
    public static int getIndex(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu =arr[i];
            if(stu !=null){
                if(stu.getId()==id){
                    return i;
                }
            }
        }
        //没找到
        return -1;
    }
}
