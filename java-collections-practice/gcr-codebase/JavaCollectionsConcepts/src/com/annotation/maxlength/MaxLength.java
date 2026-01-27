package com.annotation.maxlength;
import java.lang.annotation.*;


//Annotation definition
@Retention(RetentionPolicy.RUNTIME)   
@Target(ElementType.FIELD)            
public @interface MaxLength {
 int value(); 
}
