package taoqz.top.创建型模式.原型模式;

import lombok.Data;

import java.io.*;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/11/8
 **/
public class CloneDemo {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Cat cat = new Cat();
        cat.setColor("黑色");

        User user = new User();
        user.setName("黑猫警长");
        user.setCat(cat);

//        Cat cat1 = new Cat();
//        cat1.setColor("黑色");
//
//        User user1 = new User();
//        user1.setName("黑猫警长");
//        user1.setCat(cat1);

        try {
            User clone = (User) user.clone();
            clone.getCat().setColor("白猫警长");

            // 变化 浅拷贝
            System.out.println(user.getCat().getColor());

            // 变化 浅拷贝
            user.getCat().setColor("黑猫警长");
            System.out.println(clone.getCat().getColor());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        User user1 = new User();
        User user2 = user.deepCopy(user1);

        System.out.println(user2.getCat().getColor());

        user.getCat().setColor("白猫警长");
        System.out.println(user2.getCat().getColor());
    }

}

@Data
class User implements Cloneable ,Serializable{

    private static final long serialVersionUID = 1L;

    private String name;
    private Cat cat;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public <T> T deepCopy(T dest) throws IOException, ClassNotFoundException {
        // 使用序列化的方式深拷贝，返回的对象是全新的对象，而不是复制引用对象的地址值，同时被引用对象也需要实现序列化接口
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);

        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (T) oi.readObject();
    }
}

@Data
class Cat implements Serializable{

    private static final long serialVersionUID = 1L;

    private String color;
}