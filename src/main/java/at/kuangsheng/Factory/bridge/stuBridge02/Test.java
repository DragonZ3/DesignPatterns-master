package at.kuangsheng.Factory.bridge.stuBridge02;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class Test {
    public static void main(String[] args) {
        Computer2 computer2=new Desktop(new Apple());
        computer2.comInfo();
    }
}
