package generic.baijing.extendsthis;

import java.util.ArrayList;

public class ExtendsT {
    public static void main(String[] args) {


        ArrayList<A> list = new ArrayList<>();
        ArrayList<B> list2 = new ArrayList<>();
        ArrayList<C> list3 = new ArrayList<>();

//        ArrayList<Stu> stuList = new ArrayList<>();

        methodExtends(list);
//        methodExtends(list2);
//        methodExtends(list3);

        // 并不会报错
//        methodExtends(stuList);


    }



    public static void methodExtends(ArrayList<A> list) {

    }

    // 此时，任何类型都可以传递
    public static<E> void methodExtends(ArrayList<E> list2) {}

    // 仅传递 A B C 这个类型的数据 ， 解决： 泛型通配符 ？
    // ？ 能进行类型的限定  ： extends E (E ，和所有 E 子类) and super E  （ E 和 所有 E的父类）
    public static void methodExtends(ArrayList<? extends A> list) {

    }

    public static void methodExtends(ArrayList<? super C > list) {}
}

class A {}
class B extends A {}
class C extends B {}

//class Stu { }
