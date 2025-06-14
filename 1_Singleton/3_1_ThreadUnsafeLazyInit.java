// 3_1_ThreadUnsafeLazyInit
public class ThreadUnsafeSingleton {
    private static ThreadUnsafeSingleton instance;

    private ThreadUnsafeSingleton() {}

    public static ThreadUnsafeSingleton getInstance() {
    	//멀티스레드 환경에서 같이 null을 볼 수도 있음
        if (instance == null) {
            instance = new ThreadUnsafeSingleton(); // 위험한 구간
        }
        return instance;
    }
}