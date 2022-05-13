package at.kuangsheng.Factory.builder;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class TestMain {
    public static void main(String[] args) {
        Workers workers = new Workers();
        Product play = workers.builderA("荣耀play").product();
        System.out.println(play.toString());
        Class<Workers>  aClass= Workers.class;

        System.out.println(aClass.toString());
    }
}
