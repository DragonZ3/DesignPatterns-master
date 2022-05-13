package serializable;

import java.io.*;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class SerializableTest {
    public static void main(String[] args) throws Exception {
//        serializeFlyPig();
        FlyPig flyPig = deserializeFlyPig();
        System.out.println(flyPig.toString());
        String s1="1212";
        String s2="1212";

        String t1 = new String("t");
        String t2 = new String("t");

        System.out.println();


    }

    /**
     * 序列化
     **/
    private static void serializeFlyPig() throws IOException {
        FlyPig flyPig = new FlyPig();
        flyPig.setColor("black");
        flyPig.setName("naruto");
        flyPig.setCar("0000");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("d:/flyPig.txt")));
        oos.writeObject(flyPig);
        System.out.println("FlyPig 对象序列化成功！");
        oos.close();
    }

    /**
     * 反序列化
     **/
    private static FlyPig deserializeFlyPig() throws IOException, ClassNotFoundException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream(new File("d:/flyPig.txt")));
        FlyPig flyPig =(FlyPig)stream.readObject();
        System.out.println("FlyPig 对象反序列化成功！");
        return flyPig;
    }
}
