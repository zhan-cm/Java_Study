public class User {
    //属性-----需要使用private修饰
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    //空参---构造方法
    public User(){

    }

    //带全部参数---构造方法
    public User(String username,String password,String email,String gender,int age){
        this.username=username;
        this.password=password;
        this.email=email;
        this.gender=gender;
        this.age=age;
    }

    //使用get/set方法


    //username
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    //password
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }

    //email
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

    //gender
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }

    //age
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
