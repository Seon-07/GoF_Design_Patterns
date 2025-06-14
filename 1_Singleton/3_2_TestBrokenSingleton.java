// 3_2_TestBrokenSingleton
// 잘못된 지연 초기화 예시 테스트
public class TestBrokenSingleton {
    public static void main(String[] args) {
        Runnable r = () -> {
            ThreadUnsafeSingleton instance = ThreadUnsafeSingleton.getInstance();
            System.out.println(instance.hashCode());
        };

        for (int i = 0; i < 10; i++) {
            new Thread(r).start();
        }
    }
}