package at.kuangsheng.Factory.builder.builder01;

/**
 * @Author Dragon
 * @Description 指挥者，负者构建一个工程，工程如何构建，由它决定
 * @Date $ $
 * @Param $
 **/
public class Director {
    //指挥工人按照顺序建造房子
    public Product build(Builder builder){
        builder.buildA();
        builder.buildD();
        builder.buildC();
        builder.buildB();
        return builder.getProduct();
    }
}
