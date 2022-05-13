package com.mashibing.dp.singleton.stuSingleton;
/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可以通过synchronized解决，但也带来效率下降
 */
public class StuMgr04 {

    private static StuMgr04 INSTANCE=null;

    private StuMgr04(){};

    public static synchronized StuMgr04 getInstance(){
        if (INSTANCE ==null){
            //因为cpu计算速度很快，这里让其睡1毫秒
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new StuMgr04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        //现在是单线程
//        System.out.println(StuMgr03.getInstance().hashCode());

        //多线程测试:创建100个线程
        //如果打印的hashCode是一样的，则说明创建的对象是相同的(hashCode相同也有可能不是同一个对象)
        //hashCode相同，则对象必定相同
        for (int i=0;i<=100;i++){
            new Thread(()->{
                //所以这里直接打印地址
                System.out.println(StuMgr04.getInstance());
            }).start();
        }
    }

}
