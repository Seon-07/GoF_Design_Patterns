//3_3_ProductService
@Service
public class ProductService {
    private final Map<String, Product> productMap;

    public ProductService(Map<String, Product> productMap) {
        this.productMap = productMap;
    }

    public void process(String type) {
        Product product = productMap.get(type);
        if (product == null) {
            throw new IllegalArgumentException("key가 존재하지 않음");
        }
        product.use();
    }
}