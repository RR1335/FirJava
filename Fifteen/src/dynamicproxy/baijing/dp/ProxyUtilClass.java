package dynamicproxy.baijing.dp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
给 SingerClass
创建一个代理
 */
public class ProxyUtilClass {


        public static SingerProxyInterface createProxy(SingerClass sc) {

            SingerProxyInterface sco  = (SingerClass)Proxy.newProxyInstance(
                        ProxyUtilClass.class.getClassLoader(),        // 指定类加载器，加载生成的类加载器
                        new Class[]{SingerClass.class},               // 指定接口，接口约束了代理的范畴，即：那些方法可用
                        new InvocationHandler() {                     // 生成的代理要做的动作
                            @Override
                            public Object invoke(Object proxy, Method mothod, Object[] args) throws Throwable {
//
                                 /*
                                 Object proxy ： 代理的对象；
                                 Method  ： 运行的方法 sing and dance
                                 args : sing 的参数
                                  */

                                if (mothod.getName().equals("sing")) {
                                        System.out.println("准备话筒和调试音响。");
                                }else if (mothod.getName().equals("dance")) {
                                        System.out.println("准备舞台和背景板。");
                                }

                                // 调用

                                return mothod.invoke(sc, args);
                            }
                        }
                 );
            return sco;
        }


}
