package com.annotation.markimportantmethod;
import java.lang.annotation.*;
import java.lang.reflect.* ;
import java.util.* ;

public class AnnotationMain {

	public static void main(String[] args) throws Exception {
        // Loading TaskManager class directly
        Class<?> clazz = TaskManager.class;

        System.out.println("Important Methods in TaskManager:");
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod ann = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() +" | Level: " + ann.level());
            }
        }
    }

}