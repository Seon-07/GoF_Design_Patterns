//4_3_LambdaProductFactory
public class LambdaProductFactory {
    private static final Map<String, Supplier<Product>> registry = new HashMap<>();
	
    //확장하게되면 수정할 부분임.
    static {
        registry.put("A", ProductA::new);
        registry.put("B", ProductB::new);
    }

    public static Product create(String type) {
        Supplier<Product> supplier = registry.get(type);
        if (supplier != null) {
            return supplier.get();
        }
        throw new IllegalArgumentException("key가 존재하지 않음");
    }
}