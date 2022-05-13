package at.kuangsheng.Factory.proxy.proxy01;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class Proxy implements Rent{
    private Rent rent;

    public Proxy(Rent rent){
        this.rent=rent;
    }

    @Override
    public void rent() {
        seeHouse();
        rent.rent();//房东出租的方法
        fare();
    }
    //中介自己的业务方法
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    public void fare(){
        System.out.println("收取中介费");
    }
}
