/**
 * Ex4 클래스를 상속받은 Ex4_1 ~ Ex4_4 클래스 중 에러가 나는 클래스 이름을 모두 적으세요
 */
public abstract class Ex4 {
    private final String name;
    private final String id;
    private int age;

    public Ex4(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Ex4(String name, String id) {
        this.name = name;
        this.id = id;
    }

}