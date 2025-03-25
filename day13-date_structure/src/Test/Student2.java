package Test;

public class Student2 implements Comparable<Student2>{
    private String name;
    private int age;
    private int chinese;
    private int mathematics;
    private int english;

    public Student2() {
    }

    public Student2(String name, int age, int chinese, int mathematics, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.mathematics = mathematics;
        this.english = english;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return mathematics
     */
    public int getMathematics() {
        return mathematics;
    }

    /**
     * 设置
     * @param mathematics
     */
    public void setMathematics(int mathematics) {
        this.mathematics = mathematics;
    }

    /**
     * 获取
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", chinese = " + chinese + ", mathematics = " + mathematics + ", english = " + english + "}";
    }

    @Override
    public int compareTo(Student2 o) {
        int sum1 = this.getChinese()+this.getMathematics()+this.getEnglish();
        int sum2 = o.getChinese()+o.getMathematics()+o.getEnglish();
        int i= sum1-sum2;
        i=i==0?this.getChinese()-o.getChinese():i;
        i=i==0?this.getMathematics()-o.getMathematics():i;
        i=i==0?this.getEnglish()-o.getEnglish():i;
        i=i==0?this.getAge()-o.getAge():i;
        i=i==0?this.getName().compareTo(o.getName()):i;

        return i;

    }
}
