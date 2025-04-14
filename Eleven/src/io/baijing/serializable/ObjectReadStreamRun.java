package io.baijing.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadStreamRun {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String FLODER = "/Users/ann/DJava/testfile/o1";
        FileInputStream fis = new FileInputStream(FLODER);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object oo = ois.readObject();

//        Person p = (Person) ois.readObject();

        System.out.println(oo);

        ois.close();

    }
}
