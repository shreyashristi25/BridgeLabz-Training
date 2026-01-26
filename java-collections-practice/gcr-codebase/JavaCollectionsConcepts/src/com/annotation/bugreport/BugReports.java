package com.annotation.bugreport;
import java.lang.annotation.*;
import java.lang.reflect.* ;


@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

