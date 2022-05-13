package at.kuangsheng.Factory.builder.builder01;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class Worker extends Builder {
    private Product product;

    public Worker(){
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("a");
        System.out.println("A");
    }

    @Override
    void buildB() {
        product.setBuildB("b");
        System.out.println("b");
    }

    @Override
    void buildC() {
        product.setBuildC("c");
        System.out.println("c");
    }

    @Override
    void buildD() {
        product.setBuildD("d");
        System.out.println("d");
    }

    @Override
    Product getProduct() {
        return product;
    }

}
