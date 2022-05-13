package at.kuangsheng.Factory.prototype.shenClone;

import java.util.Date;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class Video implements Cloneable{
    public String name;
    public Date date;

    //改造父类中的clone方法，使得方法也可以进行clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        Video v=(Video)object;
        //问题：这里clone date可以，但是clone name就不行
        v.date=(Date)this.date.clone();
        return v;
    }

    public Video(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
