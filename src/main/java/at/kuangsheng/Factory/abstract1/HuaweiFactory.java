package at.kuangsheng.Factory.abstract1;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class HuaweiFactory implements ProductFactory{
    @Override
    public IphoneProduct getIphoneProduct() {
        return new HuaWeiIphone();
    }

    @Override
    public IRouterProduct getIRouterProduct() {
        return new HuaWeiRouter();
    }
}
