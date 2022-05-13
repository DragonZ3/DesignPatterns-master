package at.kuangsheng.Factory.simple;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class CarFactory {
    public static Car getCar(String carName){
        if (carName.equals("特斯拉")){
            return new TesLa();
        }else if (carName.equals("五菱宏光")){
            return new WuLing();
        }else return null;
    }
}
