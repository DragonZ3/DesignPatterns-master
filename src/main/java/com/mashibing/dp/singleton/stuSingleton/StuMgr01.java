package com.mashibing.dp.singleton.stuSingleton;



/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用！
 * 唯一缺点：不管用到与否，类装载时就完成实例化=====>对应的是StuMgr07完美版,内部类的方式
 * Class.forName("")
 * （话说你不用的，你装载它干啥）
 */
public class StuMgr01 {
    //这个也私有了，其他地方点不到哦
    private static final StuMgr01 INSTANCE = new StuMgr01();

    //对其进行私有，防止在其他地方new它
    private StuMgr01() {
    }

    //其实就是一个get方法
    public static StuMgr01 getInstance(){
        return INSTANCE;
    }


}
