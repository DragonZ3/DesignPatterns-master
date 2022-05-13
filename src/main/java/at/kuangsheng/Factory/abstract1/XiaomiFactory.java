package at.kuangsheng.Factory.abstract1;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class XiaomiFactory implements ProductFactory{
    @Override
    public IphoneProduct getIphoneProduct() {
        return new XiaomiIphone();
    }

    @Override
    public IRouterProduct getIRouterProduct() {
        return new XiaomiRouter();
    }
}
