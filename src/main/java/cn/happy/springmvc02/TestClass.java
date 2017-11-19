package cn.happy.springmvc02;

/**
 * Created by linlin on 2017/8/14.
 */
public class TestClass {
    public static void main(String[] args) {
        IFly fly=new ParestClass();
        Class<?>[] inter=fly.getClass().getInterfaces();
        System.out.println(inter.length);
    }
}
