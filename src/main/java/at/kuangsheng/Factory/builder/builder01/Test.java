package at.kuangsheng.Factory.builder.builder01;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
//建造者步骤：1.建立Builder  2.创建Product  3.创建Worker
public class Test {
    public static void main(String[] args) {
        //指挥
        Director director = new Director();
        //指挥 具体的工人完成产品
        Product product = director.build(new Worker());
        System.out.println(product.toString());
    }
}
