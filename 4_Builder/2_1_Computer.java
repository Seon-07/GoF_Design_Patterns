//2_1_Computer
public class Computer {
    private final String cpu;
    private final int ram;
    private final int storage;
    private final String gpu;
    private final String os;

    // 생성자 오버로딩
    public Computer(String cpu, int ram) {
        this(cpu, ram, 0, null, null);
    }
	
    //생성자 오버로딩
    public Computer(String cpu, int ram, int storage, String gpu, String os) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.os = os;
    }
}