package serializable;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class FlyPig implements Serializable {
    private static final long serialVersionUID = 1L;
    private static String AGE = "269";
    private String name;
    private String color="white";
    transient private String car;

    private String addTip;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    //public String getAddTip() {
    //    return addTip;
    //}
    //
    //public void setAddTip(String addTip) {
    //    this.addTip = addTip;
    //}

    @Override
    public String toString() {
        return "FlyPig{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", car='" + car + '\'' +
                ", AGE='" + AGE + '\'' +
                //", addTip='" + addTip + '\'' +
                '}';
    }

    public boolean equals(Object object){
        if (object ==null || !(object instanceof FlyPig)) return false;
        if (this == object) return true;
        String un =this.name;
        FlyPig f=(FlyPig)object;
        return this.name.equals(f.name);
    }


}
