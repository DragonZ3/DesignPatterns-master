package at.kuangsheng.Factory.prototype.shenClone;

import java.util.Date;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class BiLi {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video video1 = new Video("喜羊羊", date);
        Video video2 = (Video)video1.clone();
        System.out.println("video1=>"+video1+";hash:"+video1.hashCode());
        System.out.println("video2=>"+video2+";hash:"+video2.hashCode());

        System.out.println("===========修改属性后=============");
        //v1和v2的值都发生了改变，说明两个对象指向的是同一个属性name;不是我们想要的。这是浅拷贝
        //我们想要的是v1修改后，不要改变v2的值。这是深拷贝。方式：修改该类中的clone()

//        video1.setName("村长");
        date.setTime(213213423);
        System.out.println("video1=>"+video1+";hash:"+video1.hashCode());
        System.out.println("video2=>"+video2+";hash:"+video2.hashCode());

    }
}
