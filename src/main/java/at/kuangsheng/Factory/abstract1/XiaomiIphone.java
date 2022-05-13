package at.kuangsheng.Factory.abstract1;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class XiaomiIphone implements IphoneProduct{
    @Override
    public IphoneProduct start() {
        System.out.println("小米手机开始");
        return null;
    }

    @Override
    public void shutDown() {
        System.out.println("小米手机关闭");
    }

    @Override
    public void callUp() {
        System.out.println("小米手机接听");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米手机发送消息");
    }
}
