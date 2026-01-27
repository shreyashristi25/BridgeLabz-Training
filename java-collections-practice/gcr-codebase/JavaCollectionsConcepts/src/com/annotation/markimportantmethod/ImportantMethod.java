package com.annotation.markimportantmethod;
import java.lang.annotation.*;
import java.lang.reflect.* ;

//Custom annotation definition
@Retention(RetentionPolicy.RUNTIME)   
@Target(ElementType.METHOD) 

public @interface ImportantMethod {
 String level() default "HIGH";  
}


