/*
判断质素：100以内质数
(除1外，只能被1和自身整除的数叫做素数)
 */
public class PrimeNumberTest {

    public static void main(String[] args) {
        long currentTimeMillisStart = System.currentTimeMillis();
        int primeNumberCount = 0;

        for(int i=2; i<=100000; i++){
            if(i%2!=0){
                boolean flag = true;//是素数（不能被除了1和本身外的数除尽、有余数）；
                for(int j=2; j<=Math.sqrt(i); j++ ){
                    if(i%j==0){//证明除尽就不是素数容易
                        flag = false;//不是素数
                        break;//一旦发现不是素数，直接循环下一个数是否是素数；
                    }
                }
                if(flag) {
                    primeNumberCount++;
                    System.out.println("素数："+i);
                }

            }
        }
        long currentTimeMillisEnd = System.currentTimeMillis();
        System.out.println("total prime number count: "+ primeNumberCount +" , total cost time: "+(currentTimeMillisEnd-currentTimeMillisStart));
        /*
        方式一：
        total prime number count: 9592 , total cost time: 4539
        方式二：加break
        total prime number count: 9591 , total cost time: 445
        方式三：j<=Math.sqrt(i);
        total prime number count: 9591 , total cost time: 59

         */
    }
}
