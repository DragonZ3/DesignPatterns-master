package at.kuangsheng.Factory.adapter;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
//1.这个适配器是extends(类适配器，单继承)
//还有一个是：组合(对象适配器：常用)
public class Adapter extends Adaptee implements NetToUsb{
    @Override
    public void handlerRequest() {
        super.request();//可以上网了
    }
}
