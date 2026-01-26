package com.annotation.bugreport;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}

