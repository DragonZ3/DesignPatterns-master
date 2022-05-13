package at.kuangsheng.Factory.proxy.proxy01;

/**
 * @Author Dragon
 * @Description 这个是静态代理
 * 特点：使真实角色更加存粹，不比关心其他业务方法。缺点：一个房东会产生一个代理;如果房东过多，代理类会翻倍(使用动态代理解决)
 *
 * @Date $ $
 * @Param $
 **/
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Host());
        proxy.rent();
    }
}
