package javabean;

public class RunRegUserForm {
    public static void main(String[] args) {
        RegUserForm rf = new RegUserForm(
                "大高个人",
                "123123",
                "user@form.com",
                "男人",
                27
        );

        System.out.println(rf.getUsername());
    }
}
