package variablet;

public class JavaVarT {
    public static void main(String[] args) {
        Ye y = new Ye();
        y.yeShow();

        Fu f = new Fu();
        f.fuShow();

        Zi z = new Zi();
        z.ziShow();
    }
}

class Ye {
    String name = "Ye Class";

    public void yeShow() {
        System.out.println("Ye name -" + this.name);    // 此处 this.name 能写 name
        System.out.println("Ye name - -" + System.identityHashCode(this.name) );
    }
}

class Fu extends Ye {
    String name = "Fu Class";

    public void fuShow() {
        System.out.println("Fu name -" + this.name);   // 此处 this.name 能写 name
        System.out.println("Fu name - -" + System.identityHashCode(this.name) );
    }
}

class Zi extends Fu {
    String name = "Zi Class";

    public void ziShow(){
        String name = "Zi Show --  Class";
        System.out.println("def -" + System.identityHashCode(name) );
        System.out.println(name);
        System.out.println("name -" + System.identityHashCode(name) );
        System.out.println(this.name);
        System.out.println("this -" + System.identityHashCode(this.name) );
        System.out.println(super.name);
        System.out.println("super -" + System.identityHashCode(super.name) );
    }
}