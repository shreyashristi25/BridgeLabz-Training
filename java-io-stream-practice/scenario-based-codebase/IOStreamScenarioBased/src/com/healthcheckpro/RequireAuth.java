package com.healthcheckpro;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@ interface RequireAuth {

	String role( ) default "USER";
}
