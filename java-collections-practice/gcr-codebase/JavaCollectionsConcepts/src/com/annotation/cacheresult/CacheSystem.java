package com.annotation.cacheresult;
import java.lang.reflect.*;
import java.util.* ;

public class CacheSystem {

	private static final Map<String, Object> cache = new HashMap<>();

	//method to run method
    private static Object runMethod(Object obj, Class<?> clazz, String methodName, Object... args) throws Exception {
        Method method = clazz.getDeclaredMethod(methodName, int.class);

        if (method.isAnnotationPresent(CacheResult.class)) {
            String key = methodName + "_" + args[0]; // unique cache key
            if (cache.containsKey(key)) {
                System.out.println("Returning cached result for input: " + args[0]);
                return cache.get(key);
            } else {
                Object result = method.invoke(obj, args);
                cache.put(key, result);
                return result;
            }
        } else {
            return method.invoke(obj, args);
        }
    }


	public static void main(String[] args) {
		ExpensiveService service = new ExpensiveService();
        Class<?> clazz = service.getClass();
        Scanner sc = new Scanner(System.in);

        //taking user input and displaying result accordingly
        while (true) {
            System.out.print("\nEnter a number to compute square (or -1 to exit): ");
            int num = sc.nextInt();
            if (num == -1) {
                System.out.println("Exiting...");
                break;
            }

            try {
                Object result = runMethod(service, clazz, "computeSquare", num);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        sc.close();


	}

}
