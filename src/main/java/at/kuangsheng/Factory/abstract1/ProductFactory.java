package at.kuangsheng.Factory.abstract1;
//总工厂(抽象工厂)：把各个产品抽取出来。即：抽象工厂包含各个子工厂
public interface ProductFactory {
    //手机产品
    IphoneProduct getIphoneProduct();

    //路由器产品
    IRouterProduct getIRouterProduct();
}
