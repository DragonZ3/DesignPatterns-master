package at.kuangsheng.Factory.method;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class TslFactory implements CarFactory{

    @Override
    public Car getCarName() {
        return new Tsl();
    }
}
