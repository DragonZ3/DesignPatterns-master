package at.kuangsheng.Factory.simple;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class TestMain {
    public static void main(String[] args) {
        Car wl = CarFactory.getCar("五菱宏光");
        wl.name();
        Car tl = CarFactory.getCar("特斯拉");
        tl.name();
    }
}
