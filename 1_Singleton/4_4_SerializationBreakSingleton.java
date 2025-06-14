// 4_4_SerializationBreakSingleton
import java.io.*;

public class SerializationBreakSingleton {
    public static void main(String[] args) throws Exception {
        SerializableSingleton instance1 = SerializableSingleton.getInstance();

        // 객체 직렬화
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("obj.ser"));
        out.writeObject(instance1);
        out.close();

        // 객체 역직렬화
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj.ser"));
        SerializableSingleton instance2 = (SerializableSingleton) in.readObject();
        in.close();

        System.out.println(instance1 == instance2); // false → 싱글턴 붕괴
    }
}

class SerializableSingleton implements Serializable {
    private static final SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton() {}

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }
}