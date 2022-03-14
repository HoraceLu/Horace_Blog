package com.danli.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * /**
 * 源注解：加在注解上的注解，如Target，Retention
 * @Target --用于定义在注解的上边，表明该注解可以使用的范围。
 *
 *  @Retention作用是定义被它所注解的注解保留多久，一共有三种策略，定义在RetentionPolicy枚举中.
 *  从注释上看：
 *  source：注解只保留在源文件，当Java文件编译成class文件的时候，注解被遗弃；被编译器忽略
 *  class：注解被保留到class文件，但jvm加载class文件时候被遗弃，这是默认的生命周期
 *  runtime：注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在
 *  RetentionPolicy.SOURCE: 在编译期间丢弃。编译完成后，这些注解没有任何意义，因此它们不会写入字节码。示例：@Override，@ SuppressWarnings
 * RetentionPolicy.CLASS: 在类加载期间丢弃。在进行字节码级后处理时很有用。这是默认值。
 * RetentionPolicy.RUNTIME: 不会丢弃。注解应该可以在运行时进行反射。这是我们通常用于自定义注解的内容。
 *  这3个生命周期分别对应于：Java源文件(.java文件) ---> .class文件 ---> 内存中的字节码。
 *  注解定义中的内容是什么？注解仅支持基本数据类型，字符串和枚举。注解的所有属性都定义为方法，也可以提供默认值。
 *  https://blog.csdn.net/u012934325/article/details/100877044
 *  https://www.zhihu.com/question/24401191
 *  需要定义一个消费者，反射提供了Class，Method和Field对象，这些都有一个getAnnotation()方法，它返回注解对象
 *

 * @author luzhiwei
 * @date 2021/12/12
 */
//注解用于方法
@Target(ElementType.METHOD)
//运行时使用
@Retention(RetentionPolicy.RUNTIME)
public @interface VisitLogger {
    String behavior() default "" ;
    String content() default "";

}

