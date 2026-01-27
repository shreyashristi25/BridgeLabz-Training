package com.annotation.logexecutiontime;
import java.lang.annotation.*;

//Annotation definition
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)         
public @interface LogExecutionTime {
}
