package at.kuangsheng.Factory.adapter;

/**
 * @Author Dragon
 * @Description 客户端：想上网，插不上网线
 * @Date $ $
 * @Param $
 **/
public class Computer {
    //我们的电脑需要连接上转接器才可以上网
    public void net(NetToUsb adapter){
        adapter.handlerRequest();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();//电脑
        Adaptee adaptee = new Adaptee();//网线
        //1.类适配器的方式实现
//        Adapter adapter = new Adapter();//转接器
//        computer.net(adapter);
        //1.对象适配器的方式实现
        Adapter2 adapter2 = new Adapter2(adaptee);
        computer.net(adapter2);
    }
}
