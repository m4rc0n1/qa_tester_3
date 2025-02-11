public class IntegerMethods {
    public static void main(String[] args) {
        int a= 5;
        String ab = "123";
//        Wrapper class
        Integer b =Integer.valueOf(5);
//        System.out.println(Integer.compare(20,20));
        int c = Integer.parseInt(ab);
//        System.out.println(c);
            Integer num1 = 123;
            num1.equals(123);
//            int MAX_VALUE = Integer.MAX_VALUE;
//        int MIN_VALUE = Integer.MIN_VALUE;

//        System.out.println(MIN_VALUE);

//        MATH
        int absoluteValue = Math.abs(-123);
//        System.out.println(absoluteValue);
        int max = Math.max(10,20);
        int min = Math.min(10,20);
        double power = Math.pow(2,3); //8
        double sqrt = Math.sqrt(36); //6
        double rounded = Math.round(10.3);
        double ceil = Math.ceil(10.2);
        double floor = Math.floor(10.8);
        double randomValue = Math.random(); // 0 ve 1
//        System.out.println(randomValue);
//        System.out.println(Math.floor(randomValue*100));
        double logValue = Math.log(10);
        String parsedNum = Integer.toString(123); // "123"



    }
}
