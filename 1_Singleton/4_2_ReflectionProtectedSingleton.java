// 4_2_ReflectionProtectedSingleton
public class ReflectionProtectedSingleton {
	//플래그로 사용
    private static boolean initialized = false;
    private static final ReflectionProtectedSingleton INSTANCE = new ReflectionProtectedSingleton();

    private ReflectionProtectedSingleton() {
        if (initialized) {
        	//예외처리
            throw new RuntimeException("이미 생성된 인스턴스입니다");
        }
        initialized = true;
    }

    public static ReflectionProtectedSingleton getInstance() {
        return INSTANCE;
    }
}