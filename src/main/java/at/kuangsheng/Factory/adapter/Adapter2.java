package at.kuangsheng.Factory.adapter;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/

//组合(对象适配器：常用)
public class Adapter2 implements NetToUsb{
    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void handlerRequest() {
        adaptee.request();//可以上网了
    }
}
