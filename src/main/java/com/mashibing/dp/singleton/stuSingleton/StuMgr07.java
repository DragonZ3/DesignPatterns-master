package com.mashibing.dp.singleton.stuSingleton;



/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用！
 * StuMgr07完美版：因为在加载外部类的时候，内部类不会被加载，只有调用了getInstance()才会别初始化
 * 为什么完美，因为JVM帮我们保证的
 * Class.forName("")
 * （话说你不用的，你装载它干啥）
 */
public class StuMgr07 {
    //创建一个内部类，把对象的实例化放在内部类中
    private static class  StuMgr07Handler{
        private static final StuMgr07 INSTANCE = new StuMgr07();
    }

    //对其进行私有，防止在其他地方new它
    private StuMgr07() {
    }

    //其实就是一个get方法
    public static StuMgr07 getInstance(){
        return StuMgr07Handler.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            new Thread(()->{
                System.out.println(StuMgr07.getInstance());
            }).start();
        }
    }
}
