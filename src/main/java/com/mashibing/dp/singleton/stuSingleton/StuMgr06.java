package com.mashibing.dp.singleton.stuSingleton;
/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 双重检查也很完美，可行
 */
public class StuMgr06 {

    private static StuMgr06 INSTANCE=null;

    private StuMgr06(){};

    public static StuMgr06 getInstance(){
        if (INSTANCE ==null){//重点：这里有必要判断，防止多次上锁
            synchronized (StuMgr06.class){
            //后面可在判断一次，这就是双重判断
                if (INSTANCE ==null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new StuMgr06();
                }
            }

        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0;i<=100;i++){
            new Thread(()->{
                //所以这里直接打印地址
                System.out.println(StuMgr06.getInstance());
            }).start();
        }
    }

}
