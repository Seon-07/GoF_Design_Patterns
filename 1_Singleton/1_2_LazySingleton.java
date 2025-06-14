// 1_2_LazySingleton
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        // private 생성자
    }
	
    //정적 메소드
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}