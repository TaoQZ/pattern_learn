package taoqz.top.创建型模式.建造者模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/11/8
 **/
public class StartUp {

    public static void main(String[] args) {

        // accountBookNo should be not null
//        PopulationRegist.Builder builder = new PopulationRegist
//                .Builder()
//                .age(18)
//                .name("ttt");

        PopulationRegist build = new PopulationRegist
                .Builder()
                .accountBookNo("no1")
                .age(18)
                .name("ttt")
                .build();

        System.out.println(build.getGender());

    }

}
