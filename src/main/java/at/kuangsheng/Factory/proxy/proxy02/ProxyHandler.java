package at.kuangsheng.Factory.proxy.proxy02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author Dragon
 * @Description 这个中介是动态生成的
 * @Date $ $
 * @Param $
 **/
public class ProxyHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent){
        this.rent=rent;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是使用反射机制实现
        seeHouse();
        Object invoke = method.invoke(rent, args);
        fare();
        return invoke;
    }

    //中介自己的业务方法
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    public void fare(){
        System.out.println("收取中介费");
    }
}
