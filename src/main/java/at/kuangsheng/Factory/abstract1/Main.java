package at.kuangsheng.Factory.abstract1;

/**
 * @Author Dragon
 * @Description 抽象工厂：是创建工厂的工厂
 * 特点：新增产品较困难，需要修改大量源代码，破坏了开闭原则。如果产品较稳定时，可以使用抽象工厂
 * @Date $ $
 * @Param $
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("================小米产品==============");

        XiaomiFactory factory = new XiaomiFactory();

        IphoneProduct xMPhone = factory.getIphoneProduct();
        xMPhone.start();
        xMPhone.sendSMS();

        IRouterProduct routerProduct = factory.getIRouterProduct();
        routerProduct.start();
        routerProduct.setting();

        System.out.println("=============华为产品==============");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        IphoneProduct iphoneProduct = huaweiFactory.getIphoneProduct();
        iphoneProduct.start();
        iphoneProduct.sendSMS();

        IRouterProduct huaRouter = huaweiFactory.getIRouterProduct();
        huaRouter.start();
        huaRouter.setting();
    }
}
