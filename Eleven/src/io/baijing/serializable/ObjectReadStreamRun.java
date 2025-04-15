package io.baijing.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectReadStreamRun {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String FLODER = "/Users/ann/DJava/testfile/o1";
        FileInputStream fis = new FileInputStream(FLODER);
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<Person> person = (ArrayList<Person>) ois.readObject();
        for (Person p1 : person) {
            System.out.println(p1);
        }

//        Object oo = ois.readObject();

//        Person p = (Person) ois.readObject();

//        System.out.println(oo);

        ois.close();

    }
}
