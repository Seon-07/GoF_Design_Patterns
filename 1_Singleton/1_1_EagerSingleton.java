// 1_1_EagerSingleton
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        // private 생성자는 외부에서 인스턴스를 생성할 수 없음
    }
	
    //final 필드인 INSTANCE를 반환
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}