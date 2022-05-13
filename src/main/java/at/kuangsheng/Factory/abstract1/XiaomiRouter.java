package at.kuangsheng.Factory.abstract1;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class XiaomiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("小米开启路由");
    }

    @Override
    public void shutDown() {
        System.out.println("小米关闭路由");
    }

    @Override
    public void openWife() {
        System.out.println("小米路由开启Wifi");
    }

    @Override
    public void setting() {
        System.out.println("小米路由配置");
    }
}
