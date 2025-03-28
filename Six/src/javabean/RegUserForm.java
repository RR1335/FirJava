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


    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }



}
