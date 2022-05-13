package at.kuangsheng.Factory.builder.builder01;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
//建造者
public abstract class Builder {
    abstract void buildA();
    abstract void buildB();
    abstract void buildC();
    abstract void buildD();

    //得到产品
    abstract Product getProduct();
}
