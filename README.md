# RR1335

## 阿里巴巴Java开发规范：

    https://developer.aliyun.com/ebook/386 （下载） 
    https://alibaba.github.io/p3c/

## 插件 Plugins

    PTG Quick Generation JavaBean  Quick Generation SQL Quick Generation JVM arguemnts Quick Generation Spring Configuration

## 内存位置和类型

    内存： System.identityHashCode() 哈希值
    类型： getClass()

## 面向对象的三个特点啊

     面向对象（OOP）的三个特征：. 封装（Encapsulation）; 继承（Inheritance）; 多态（Polymorphism）
     抽象（Abstraction）

## 内存查看工具

    jhsdb hsdb
    jps

    System.out.println(Long.toHexString(VM.current().addressOf(z)));
    z 是声明的对象 —— Class z = new Class();

# 命名逻辑

    java 技术栈 . baijing. 技术点
    便于阅读和理解
    map.baijing.traverse 

    Class  命名遵照规则
    main 方法，通过 Run + 命名   || 更新  方法 + Run 更容易读取

