package chap_06;

public class _02_Parameter {
    public static void power(int number) { // 매개변수
        int result = number * number;
        System.out.println(number + " 의 2 승은 " + result);
    }
    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent +" 승은 " + result);
    }
    public static void main(String[] args) {
        // 전달값, parameter
        // Argument, 인수
        power(2);
        for (int i = 0; i < 4; i++) {
            power(i);
        }

        // 파라미터 두 개 이상
        powerByExp(2,3);
        powerByExp(3,3);
        powerByExp(10,0);
    }
}
