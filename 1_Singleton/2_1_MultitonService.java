// 2_1_MultitonService
import java.util.concurrent.ConcurrentHashMap;

public class MultitonService {
    private static final ConcurrentHashMap<String, MultitonService> instances = new ConcurrentHashMap<>();
    private final String type;

    private MultitonService(String type) {
        this.type = type;
    }

    public static MultitonService getInstance(String type) {
        return instances.computeIfAbsent(type, MultitonService::new);
    }

    public String getType() {
        return type;
    }
}