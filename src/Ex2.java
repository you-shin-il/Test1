/**
 * 라인 7,8,9,10에 결과를 적으세요
 */
public class Ex2 {
    public static void main(String[] args) {
        String a = "a";
        System.out.println(a == "a"); // true
        System.out.println(a == new String("a")); // false
        System.out.println(a.equals("a")); // true
        System.out.println("a".equals(a)); // true
    }
}
