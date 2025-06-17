//3_2_ConcreteProductAandB
@Component
public class ConcreteProductA implements Product {
    @Override
    public void use() {
        System.out.println("ConcreteProductA 동작");
    }

    @Override
    public String getName() {
        return "A";
    }
}

@Component
public class ConcreteProductB implements Product {
    @Override
    public void use() {
        System.out.println("ConcreteProductB 동작");
    }

    @Override
    public String getName() {
        return "B";
    }
}