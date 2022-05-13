package at.kuangsheng.Factory.method;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class WlFactory implements CarFactory{
    @Override
    public Car getCarName() {
        return new Wl();
    }
}
