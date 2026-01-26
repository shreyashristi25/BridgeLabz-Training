package com.reflection.customloggingproxy;
import java.lang.reflect.*;

public class LoggingHandler implements InvocationHandler{

	private final Object target;

	//constructor
    public LoggingHandler(Object target) {
        this.target = target;
    }
   
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("[LOG] Method called: " + method.getName());
        return method.invoke(target, args);
    }

}
