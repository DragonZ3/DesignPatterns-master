package at.kuangsheng.Factory.bridge.stuBridge;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class Test {
    public static void main(String[] args) {
        //苹果笔记本
        Computer cu=new Laptop(new Apple());
        cu.info();
        //联想台式机
        cu=new Desktop(new Lenovo());
        cu.info();
    }
}
