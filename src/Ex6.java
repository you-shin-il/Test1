/**
 * 다음중 에러가 나는 라인을 모두 적으세요(자바 1.8 이상을 기준으로)
 */
public interface Ex6 {
    default void defaultMethod();
    private void method1();
    public void method2();
    void method3();
    protected void method4();
    abstract void method5();
    protected void method6(String ... strs);
    default void show1() { System.out.println("show1"); }
    default void show2() { System.out.println("show1"); }
    public void show2() { System.out.println("show2"); }
}