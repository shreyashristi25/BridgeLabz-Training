package com.healthcheckpro;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@ interface PublicAPI {

	String description() default "No description provided";

}
