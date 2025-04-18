package org.csu.petstore.annotation;

import java.lang.annotation.*;


@Target(ElementType.METHOD)//注解放置的目标位置即方法级别
@Retention(RetentionPolicy.RUNTIME)//注解在哪个阶段执行
@Documented
public @interface LogAdmin {
    String value() default "";

}
