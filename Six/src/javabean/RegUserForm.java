package javabean;

public class RegUserForm {
    // 属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int    age;

    // macOS idea 快捷键
    // command+n / ctrl + enter

    // 插件 PTG —— 自动生成标准的 javabean

    // constrator 空
     public RegUserForm() {}

    // 全部 参数的 constrator
    public RegUserForm(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 设置用户名
     * @param username  用户名
     */
    public void setUsername(String username){
         this.username = username;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password){
         this.password = password;
    }

    public String getPassword() {
         return password;
    }

    public void setEmail(String email){
         this.email = email;
    }

    public String getEmail() {
         return email;
    }

    public void setGender(String gender){
         this.gender = gender;
    }

    public String getGender() {
         return gender;
    }

    public void setAge(int age){
         this.age = age;
    }

    public int getAge() {
         return age;
    }


}
