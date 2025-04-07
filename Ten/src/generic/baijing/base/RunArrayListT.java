package generic.baijing.base;

public class RunArrayListT {
    public static void main(String[] args) {

        ArrayListT<String> at =   new ArrayListT<>();

        at.add("a");
        at.add("b");
        at.add("c");

        System.out.println(at);

        ArrayListT<Integer> ai =   new ArrayListT<>();
        ai.add(1);
        ai.add(2);
        ai.add(3);
        ai.add(4);
        ai.add(5);


        int i = ai.get(2);
        System.out.println(i);

        System.out.println(ai);

    }
}
