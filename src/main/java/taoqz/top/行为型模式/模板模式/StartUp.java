package taoqz.top.行为型模式.模板模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/11/9
 **/
public class StartUp {

    public static void main(String[] args) {

        PersonOneDay personOneDay = new PersonOneDay();
        personOneDay.life();

        System.out.println();

        PersonTwoDay personTwoDay = new PersonTwoDay();
        personTwoDay.life();

//        我吃面食
//        我趴着睡
//        我拳打
//
//        我吃米饭
//        我侧着睡
//        我脚踢

    }

}
