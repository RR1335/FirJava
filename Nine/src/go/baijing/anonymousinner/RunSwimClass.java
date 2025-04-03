package go.baijing.anonymousinner;

public class RunSwimClass {
    public static void main(String[] args) {

        Swim s = new Swim() {

            @Override
            public void swim() {
                System.out.println("swim");
            }
        };

        s.swim();


        new Swim() {

            @Override
            public void swim() {
                System.out.println("swim 12");
            }
        }.swim();

        new Swim() {

            @Override
            public void swim() {
                System.out.println("swim");
            }
        }.toString();

    }
}
