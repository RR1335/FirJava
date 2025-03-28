package biz.baijing.classjp;

public class FirClassPrivate {
    private String name;
    private int    age;

    public void setAge(int agen) {
        if ( 100 >= agen && agen >= 18) {
            age = agen;
        } else {
            System.out.println("Age 不符合标准");
        }
    }

    public int getAge() {
        return age;
    }
}
