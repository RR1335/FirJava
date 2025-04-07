package generic.baijing.base;

public class RunListInterface {
    public static void main(String[] args) {

        ListInterfaceE list = new ListInterfaceE();
        list.add("a");
        list.add("b");

        System.out.println(list);

        ListInterfaceEE<String> liee = new ListInterfaceEE<>();
        liee.add("a");
        liee.add("b");

        System.out.println(liee);
        System.out.println(liee.get(1));

    }
}
