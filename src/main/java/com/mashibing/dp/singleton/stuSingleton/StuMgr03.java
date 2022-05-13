package com.mashibing.dp.singleton.stuSingleton;

/**
 * @Author Dragon
 * @Description //lazy loading,多线程访问时出现问题
 * @Date $ $
 * @Param $
 **/
public class StuMgr03 {

    private static StuMgr03 INSTANCE=null;

    private StuMgr03(){};

    public static StuMgr03 getInstance(){
        if (INSTANCE ==null){
            //因为cpu计算速度很快，这里让其睡1毫秒
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new StuMgr03();
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
                System.out.println(StuMgr03.getInstance());
            }).start();
        }
    }

}
