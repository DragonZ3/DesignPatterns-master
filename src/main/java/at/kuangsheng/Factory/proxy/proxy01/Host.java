package at.kuangsheng.Factory.proxy.proxy01;

/**
 * @Author Dragon
 * @Description 房东
 * @Date $ $
 * @Param $
 **/
public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
