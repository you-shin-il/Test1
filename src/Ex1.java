/**
 * 라인 25,26,27에 결과를 적으세요
 */
public class Ex1 {
    public static int count;
    private int a;
    private int b;

    public Ex1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int allSum() {
        ++count;
        return count + a + b;
    }

    public static void main(String[] args) {
        Ex1 ex1_1 = new Ex1(1, 2);
        Ex1 ex1_2 = new Ex1(2, 1);
        Ex1 ex1_3 = new Ex1(0, 0);

        System.out.println("ex1_1 sum = " + ex1_1.allSum()); // 4
        System.out.println("ex1_2 sum = " + ex1_2.allSum()); // 5
        System.out.println("ex1_3 sum = " + ex1_3.allSum()); // 3
    }
}
