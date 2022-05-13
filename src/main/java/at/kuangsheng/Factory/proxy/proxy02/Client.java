package at.kuangsheng.Factory.proxy.proxy02;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色：现在没有
        ProxyHandler proxyHandler = new ProxyHandler();
        proxyHandler.setRent(host);
        Rent proxy = (Rent) proxyHandler.getProxy();
        proxy.rent();
    }
}
