package biz.baijing.beanmemory;

public class BMClass {
    private String name;

    public void setName(String name){
        System.out.println("This.name : " + this.name);   // this.name : null
        int addressip = System.identityHashCode(this.name);
        System.out.println("First this.name - " +addressip);
        System.out.println("name: " + name);
        this.name = name;
        System.out.println("This.name - update: " + this.name);
        int addressip1 = System.identityHashCode(this.name);
        System.out.println("Second this.name - " + addressip1);
        System.out.println("name - update: " + name);
        name = "三月三";
        System.out.println("second name : " + name);
    }

    public String getName() {
        return name;
    }
}
