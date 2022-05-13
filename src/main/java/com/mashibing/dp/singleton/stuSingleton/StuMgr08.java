package com.mashibing.dp.singleton.stuSingleton;



/**
 * Java创始人写的单例：完美中的完美
 * 叫枚举：不仅可以解决线程同步，还可以防止反序列化。
 */
public enum  StuMgr08 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            new Thread(()->{
                System.out.println(StuMgr08.INSTANCE.hashCode());
            }).start();
        }
    }
}
