package com.annotation.jasonfield;
import java.lang.annotation.*;

//Annotation definition
@Retention(RetentionPolicy.RUNTIME)   
@Target(ElementType.FIELD)            
public @interface JsonField {
 String name(); 
}

