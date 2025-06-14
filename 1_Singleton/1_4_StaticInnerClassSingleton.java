// 1_4_StaticInnerClassSingleton
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
        // private 생성자
    }
    
    //내부에 클래스
    private static class Holder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
    
    public static StaticInnerClassSingleton getInstance() {
        return Holder.INSTANCE;
    }
}