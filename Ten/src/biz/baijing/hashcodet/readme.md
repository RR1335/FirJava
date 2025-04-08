
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