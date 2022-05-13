package at.kuangsheng.Factory.method;

/**
 * @Author Dragon
 * @Description 缺点：每增加一个产品，都要增加一个工厂方法
 * @Date $ $
 * @Param $
 **/
public class main {
    public static void main(String[] args) {
        Car carName = new TslFactory().getCarName().name();

        Car wl = new WlFactory().getCarName().name();
    }
}
