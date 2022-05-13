package com.mashibing.dp.singleton.stuSingleton;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class TestMain {
    public static void main(String[] args) {
        StuMgr01 instance = StuMgr01.getInstance();
        StuMgr01 instance1 = StuMgr01.getInstance();
        if (instance == instance1){
            System.out.println("单例模式");
        }
    }
}
