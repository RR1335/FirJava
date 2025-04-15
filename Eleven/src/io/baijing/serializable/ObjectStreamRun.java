package io.baijing.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectStreamRun {
    public static void main(String[] args) throws IOException {

        Person p = new Person("Tom",19,"Tianjin, in Jinmen");


        String FLODER = "/Users/ann/DJava/testfile/o1";
        FileOutputStream fos = new FileOutputStream(FLODER);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FLODER));
//        或者嵌套

        // 多个对象的写入
        Person p1 = new Person("Jack",19,"Rizhao, in Jinmen");
        Person p2 = new Person("小六子",19,"Wuhan, in Jinmen");
        Person p3 = new Person("五彩缤纷",19,"Shanghai, in Jinmen");

        ArrayList<Person> person = new ArrayList<Person>();

        person.add(p);
        person.add(p1);
        person.add(p2);
        person.add(p3);

        oos.writeObject(person); // .NotSerializableException _ 直接写出会报错


/*        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.writeObject(p3);*/

        oos.close();




    }
}
