package dynamicAgency;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object target; // 目标对象
    public MyInvocationHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
    	System.out.println(proxy.getClass().getName());
    	System.out.println(method.getName());
        System.out.println("代码执行前");
        Object result = method.invoke(target, args);//代码执行结果
        System.out.println("代码执行后");
        return result; 
    }
}