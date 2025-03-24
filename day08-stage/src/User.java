/**
 * User类代表一个用户对象，包含了用户的必要信息，如姓名、密码、身份证号和电话号码
 */
public class User {
    // 用户姓名
    private String name;
    // 用户密码
    private String password;
    // 用户身份证号
    private String idnumber;
    // 用户电话号码
    private String phonenumber;
    /**
     * 默认构造函数，用于创建一个空的User对象
     */
    public User() {
    }
    /**
     * 构造函数，用于创建一个带有指定信息的User对象
     *
     * @param name        用户姓名
     * @param password    用户密码
     * @param idnumber    用户身份证号
     * @param phonenumber 用户电话号码
     */
    public User(String name, String password, String idnumber, String phonenumber) {
        this.name = name;
        this.password = password;
        this.idnumber = idnumber;
        this.phonenumber = phonenumber;
    }
    /**
     * 获取用户姓名
     *
     * @return 用户姓名
     */
    public String getName() {
        return name;
    }
    /**
     * 设置用户姓名
     *
     * @param name 用户姓名
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取用户密码
     *
     * @return 用户密码
     */
    public String getPassword() {
        return password;
    }
    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 获取用户身份证号
     *
     * @return 用户身份证号
     */
    public String getIdnumber() {
        return idnumber;
    }
    /**
     * 设置用户身份证号
     *
     * @param idnumber 用户身份证号
     */
    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }
    /**
     * 获取用户电话号码
     *
     * @return 用户电话号码
     */
    public String getPhonenumber() {
        return phonenumber;
    }
    /**
     * 设置用户电话号码
     *
     * @param phonenumber 用户电话号码
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}

