//2_4_Computer
public class Computer {
    private String cpu;
    private int ram;
    private int storage;
    private String gpu;
    private String os;

    // 기본 생성자
    public Computer() {}

    public void setCpu(String cpu) { this.cpu = cpu; }
    public void setRam(int ram) { this.ram = ram; }
    public void setStorage(int storage) { this.storage = storage; }
    public void setGpu(String gpu) { this.gpu = gpu; }
    public void setOs(String os) { this.os = os; }
}