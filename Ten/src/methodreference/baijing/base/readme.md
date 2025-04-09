
# 方法引用的三个方式

- 静态引用
- 成员引用
- 构造引用



# 引用成员方法

格式  **对象::成员方法**

    首先要 new 一个对象；所以代码中：

    第一：直接 new 
        ls.stream().filter(new MemberMethodRef()::StringStartAndLength).forEach(System.out::println);
    第二：先 new 对象，再方法引用
        MemberMethodRef mmf = new MemberMethodRef();
        ls.stream().filter(mmf::StringStartAndLength).forEach(System.out::println);


- 本类  **this::方法名**
- 父类  **super::方法名**
- 其他类对象  **其他类对象::方法名**

## 本类和父类

    this::方法名
    super::方法名
    
    static 静态中，是没有 this 的；在 static 中方法引用需要 new 对象再引用。
    同样适用于父类。

# 应用构造方法

格式 **类名::new**
范例 Car::new

    构造方法没有返回值，当然也就没有返回值类型。
    构造方法执行后，类本身就已经有了返回值。

**Collectors.toList()**

    public static <T>
    Collector<T, ?, List<T>> toList() {
        return new CollectorImpl<>(ArrayList::new, List::add,
                                   (left, right) -> { left.addAll(right); return left; },
                                   CH_ID);
    }

    中，ArrayList::new 也是构造引用 。

    

