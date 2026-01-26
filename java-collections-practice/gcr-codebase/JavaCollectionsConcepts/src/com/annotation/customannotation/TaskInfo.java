package com.annotation.customannotation;
import java.lang.annotation.*;

//defining custom annotation
@Retention(RetentionPolicy.RUNTIME)
@ interface TaskInfo {

	String priority() ;
	String assignedTo() ;
}
