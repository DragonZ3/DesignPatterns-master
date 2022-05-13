package at.kuangsheng.Factory.bridge.stuBridge02;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/

public abstract class Computer2 {
    public Brand brand;
    public Computer2 (Brand brand){
        this.brand=brand;
    }

    public void comInfo(){
        brand.info();
    }
}

class Desktop extends Computer2{

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void comInfo() {
        super.comInfo();
        System.out.println("台式机");
    }
}
class Laptop extends Computer2{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void comInfo() {
        super.comInfo();
        System.out.println("笔记本");
    }
}
