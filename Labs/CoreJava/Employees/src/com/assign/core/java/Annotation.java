package com.assign.core.java;
import java.lang.annotation.Documented;
//scope::1)@RetentionPolicy --source(within source)/class(within class)/runtime(within runtime)
//2)@Target::parameter,method,class,package,constructor,field
//3)@Documented::
//4)@inherited::
//5)Repeatable ::repeat this annotation ,multiple time or not...if Repeatable  is true ,it can be repeated
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//7import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented  
public @interface Annotation {
 
}
