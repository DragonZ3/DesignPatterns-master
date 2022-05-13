package at.kuangsheng.Factory.prototype;

import java.util.Date;

/**
 * @Author Dragon
 * @Description 原型模式就是克隆一个对象
 * @Date $ $
 * @Param $
 **/
public class BiLiTest{
    public static void main(String[] args) throws CloneNotSupportedException {
        //原型对象1
        Date date = new Date();
        Video video1 = new Video("喜羊羊",date);
        System.out.println("v1=>"+video1);
        System.out.println("hash:"+video1.hashCode());
        System.out.println("=============================");
        //对video1进行克隆
        Video cloneVideo = (Video) video1.clone();//拷贝的新对象的值和原来的一模一样;区别：又在内存中开辟了一个空间
        System.out.println("V2=>"+cloneVideo);
        System.out.println("hash:"+cloneVideo.hashCode());

        System.out.println("=============================");

        cloneVideo.setName("村长");
        System.out.println(cloneVideo);
        System.out.println("hash:"+cloneVideo.hashCode());

    }
}
