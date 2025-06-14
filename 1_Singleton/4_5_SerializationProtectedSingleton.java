// 4_5_SerializationProtectedSingleton
class SerializationProtectedSingleton implements Serializable {
    private static final SerializationProtectedSingleton INSTANCE = new SerializationProtectedSingleton();

    private SerializationProtectedSingleton() {}

    public static SerializationProtectedSingleton getInstance() {
        return INSTANCE;
    }

    // 역직렬화 시 호출되는 메소드
    private Object readResolve() {
        return INSTANCE; // 항상 기존 인스턴스를 반환
    }
}
