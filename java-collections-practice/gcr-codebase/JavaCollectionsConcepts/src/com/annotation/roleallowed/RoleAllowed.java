package com.annotation.roleallowed;
import java.lang.annotation.*;

//Annotation definition
@Retention(RetentionPolicy.RUNTIME)   
@Target(ElementType.METHOD)           
public @interface RoleAllowed {
 String value(); 
}
