## 执行错误 

    错误内容
    Exception in thread "main" java.lang.ClassCastException: class treemap.baijing.example.Student cannot be cast to class java.lang.Comparable (treemap.baijing.example.Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
    at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
    at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
    at java.base/java.util.TreeMap.put(TreeMap.java:785)
    at java.base/java.util.TreeMap.put(TreeMap.java:534)
    at treemap.baijing.example.RunTreeMapStu.main(RunTreeMapStu.java:16)

    错误代码
    TreeMap<Student,String> tmstu = new TreeMap<>();

    
## 原因 

TreeMap 默认要给 keys 排序的，要给 _自定义类_ 指定一个排序规则。

## 解决

    在 类中，直接 impelments :
    public class Student implements Comparable<Student> 
    