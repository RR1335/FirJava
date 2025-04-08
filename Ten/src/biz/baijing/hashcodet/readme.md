
## 结构

    Student(Name :Sam , Age :20) - 山东
    Student(Name :Tom , Age :19) - 云南
    Student(Name :Jack , Age :22) - 湖北  

    的输出，需要重写 toString

## Student 重写 toString 

    @Override
    public String toString() {
        return "Student(" + "Name :"+ name + " , " + "Age :" + age + ")";
    }

## 否则输出结构为

    biz.baijing.hashcodet.Student@2737f6 - 山东
    biz.baijing.hashcodet.Student@27e0e2 - 云南
    biz.baijing.hashcodet.Student@44067b8 - 湖北

## 为何会打印 哈希值

### println 源代码

    public void println(Object x) {
        String s = String.valueOf(x);
        if (getClass() == PrintStream.class) {
            // need to apply String.valueOf again since first invocation
            // might return null
            writeln(String.valueOf(s));
        } else {
            synchronized (this) {
                print(s);
                newLine();
            }
        }
    }

### valueOf 源代码

    public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }

### toString 源代码

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    toHexString(hashCode()) 输出 hashcode 

## 说明

    所以，需要输出 Object 的 Content ，需要重写 （ @Override ）  toString 的 return 结构。