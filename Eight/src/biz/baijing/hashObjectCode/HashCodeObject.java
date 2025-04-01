package biz.baijing.hashObjectCode;

public class HashCodeObject {
    public static void main(String[] args) {
        Person p = new Person("Tom");

        int hashCode = p.hashCode();
        System.out.println("对象哈希码 -" + hashCode);
        String pointerAddress = Integer.toHexString(hashCode);
        System.out.println("对象「指针」地址 -" + pointerAddress);
    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}


