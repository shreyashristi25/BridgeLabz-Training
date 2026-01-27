package com.annotation.cacheresult;
import java.lang.annotation.*;

//Annotation definition
@Retention(RetentionPolicy.RUNTIME)   
@Target(ElementType.METHOD)           
public @interface CacheResult {
}

