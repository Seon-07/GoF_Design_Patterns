//1_2_ConcreteProductAandB
//Product를 구체화
public class ConcreteProductA implements Product {
    @Override
    public void use() {
        System.out.println("ConcreteProductA 사용");
    }
}
//Product를 구체화
public class ConcreteProductB implements Product {
    @Override
    public void use() {
        System.out.println("ConcreteProductB 사용");
    }
}