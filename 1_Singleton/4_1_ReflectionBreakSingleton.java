// 4_1_ReflectionBreakSingleton
import java.lang.reflect.Constructor;

public class ReflectionBreakSingleton {
    public static void main(String[] args) throws Exception {
        Singleton target1 = Singleton.getInstance();

        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton target2 = constructor.newInstance(); // 새로운 인스턴스 생성
		//동일성 비교
        System.out.println(target1 == target2); // false → 싱글턴 붕괴
    }
}

// 공격 대상 클래스
class Singleton {
    private static final Singleton INSTANCE = new Singleton();
	
    //private 생성자
    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}