package com.baijing.memoryclass;

// import org.openjkd.jol.Class.Layout

public class MemoryClassPointer {
    public static void main(String[] args) {
        Student s = new Student();
        
        s.name = "Sam";
        s.age = 18;
        
        s.show();

        // 打印对象在内存中的位置
//        Class.Layout layout = ClassLayOut.parseInstance(s);
//        System.out.println(layout);
        
    }
}
