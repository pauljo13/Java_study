package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순래
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i]  + " 하나");
        }
        System.out.println("주세요.#1");
        System.out.println("------------------------------");

        // 배열의 길이
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i]  + " 하나");
        }
        System.out.println("주세요.#2");
        System.out.println("------------------------------");

        // enhanced for (for-each) 반복문
        for (String a : coffees) {
            System.out.println(a + " 하나");
        }
        System.out.println("주세요.#3");
    }
}
