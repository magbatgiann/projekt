public class Methods {

    public static void main(String[] args){
        methodZero();
        methodOne(10);
        methodTwo(10,20);
        methodTwo(10.0,20.0);
        methodTwo(10.0);
    }

    public static void methodZero(){
        System.out.println("This i method with zero parameters");
    }

    public static void methodOne(int a) {
       // System.out.println("MethodOne: " + a);
        methodOne(a, 0);
    }
    public static void methodOne(int a,int b) {
        System.out.println("MethodOneWithTwoParameters: " + a + "," + b);
    }
    public static void methodTwo(double a,double b) {
        System.out.println("MethodTwoBeta: " + a + "," + b);
    }

    public static void methodTwo(double a) {
        System.out.println("MethodTwoWithOneParameter: " + a);
    }
}
