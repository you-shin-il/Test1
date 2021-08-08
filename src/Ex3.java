/**
 * 라인 14,15,16,17 에러가 아닌 라인을 모두 고르세요
 */
public class Ex3 {
    private String name;
    private int age;

    public Ex3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Ex3 ex3_1 = new Ex3("B", 1);
        Ex3 ex3_3 = new Ex3("A", -1);
        //Ex3 ex3_2 = new Ex3();  // error
        Ex3 ex3_4 = new Ex3("C", 0);
    }
}
