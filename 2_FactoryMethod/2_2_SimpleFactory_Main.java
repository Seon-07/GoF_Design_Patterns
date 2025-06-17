//2_2_SimpleFactory_Main
public class Main {
    public static void main(String[] args) {
        Product product1 = SimpleProductFactory.create("A");
        product1.use();  // 출력: Product A 사용

        Product product2 = SimpleProductFactory.create("B");
        product2.use();  // 출력: Product B 사용
    }
}