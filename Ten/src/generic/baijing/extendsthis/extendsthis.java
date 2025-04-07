package generic.baijing.extendsthis;

import java.util.ArrayList;

public class extendsthis {
    public static void main(String[] args) {

        /*
        泛型不具有继承性；但是数据具有继承性。
         */

        // 创建集合的对象
        ArrayList<A> list = new ArrayList<A>();
        ArrayList<B> list2 = new ArrayList<>();
        ArrayList<C> list3 = new ArrayList<>();

        methodExtends(list);

//        methodExtends(list2);

        // 数据具备继承性

        list.add(new B());
        list.add(new C());


    }


    public  static void methodExtends(ArrayList<A> list) {

    }
}


class A {}
class B extends A {}
class C extends B {}