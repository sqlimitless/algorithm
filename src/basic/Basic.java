package basic;


public class Basic {

    public static void main(String[] args) {
        max4(randomInt(),randomInt(),randomInt(),randomInt());
    }


    private static int randomInt(){
        return (int)(Math.random()*10000);
    }
    /**
     * 최대값 구하기
     */
    private static void max4(int a, int b, int c, int d) {
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        int maxA = Math.max(a, b);
        int maxB = Math.max(c, d);
        int max = Math.max(maxA, maxB);
        System.out.println("max = " + max);
    }
}
