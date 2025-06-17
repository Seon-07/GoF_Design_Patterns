//2_1_SimpleFactory
//인터페이스
public interface Product {
    void use();
}
//구현하는 클래스A
public class ProductA implements Product {
    public void use() {
        System.out.println("Product A 사용");
    }
}
//구현하는 클래스B
public class ProductB implements Product {
    public void use() {
        System.out.println("Product B 사용");
    }
}

// Simple Factory
public class SimpleProductFactory {
	//분기처리...
    public static Product create(String type) {
        if ("A".equals(type)) return new ProductA();
        else if ("B".equals(type)) return new ProductB();
        else throw new IllegalArgumentException("Unknown type");
    }
}