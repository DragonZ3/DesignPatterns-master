package at.kuangsheng.Factory.bridge.stuBridge;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class Computer {
    public Brand brand;//这里把品牌组装进来

    public Computer(Brand brand){
        this.brand=brand;
    }

    public void info(){
        brand.info();
    }
}
