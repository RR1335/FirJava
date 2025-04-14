package io.baijing.serializable;

import java.io.*;

public class ObjectStreamRun {
    public static void main(String[] args) throws IOException {

        Person p = new Person("Tom",19);

        String FLODER = "/Users/ann/DJava/testfile/O1";
        FileOutputStream fos = new FileOutputStream(FLODER);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FLODER));
//        或者嵌套

        oos.writeObject(p); // .NotSerializableException _ 直接写出会报错

        oos.close();




    }
}
