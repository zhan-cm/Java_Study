package ObjectStream;

import java.io.Serial;
import java.io.Serializable;
/*
    Serializable接口里面没有抽象方法---标记型接口
    一旦实现这个接口，你们就表示当前的Student类可以被序列化

 */

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 6901015053234780122L;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
