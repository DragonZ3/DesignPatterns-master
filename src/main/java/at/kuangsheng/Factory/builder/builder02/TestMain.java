package at.kuangsheng.Factory.builder.builder02;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class TestMain {
    public static void main(String[] args) {
        //直接写工作者了，客户可以随心创建自己想要的产品
        Worker worker = new Worker();
        Product product = worker.builderA("鸡肉卷").builderB("快乐水")
                .product();
        System.out.println(product.toString());

    }
}
