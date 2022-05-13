package at.kuangsheng.Factory.abstract1;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class HuaWeiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("华为开启路由");
    }

    @Override
    public void shutDown() {
        System.out.println("华为关闭路由");
    }

    @Override
    public void openWife() {
        System.out.println("华为路由开启Wifi");
    }

    @Override
    public void setting() {
        System.out.println("华为路由配置");
    }
}
