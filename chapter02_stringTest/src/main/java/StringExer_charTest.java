public class StringExer_charTest {

    /**
     * b站 shk java入门：https://www.bilibili.com/video/BV1PY411e7J6/?p=26&vd_source=b6b5278300a836e624628f2d216bb728
     * P26 char
     * P30-31 String使用和练习
     * P44 随机数练习
     * @param args
     */
    public static void main(String[] args){
//        char a = 'a'+1;
//        System.out.println(a+"hello");
//        System.out.println(a);
//        System.out.println(a+1);

        //直接用unicode表示字符
//        char a = '\u0046';
//        System.out.println(a);

        //获取[5-7]的随机数 ,获取【a，b】随机数：(int)(Math.random()*(b-a+1))+a
        int randomNum = (int)(Math.random()*(7-5+1))+5;
        System.out.println(randomNum);
    }

}
