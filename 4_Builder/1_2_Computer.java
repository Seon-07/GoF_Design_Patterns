//1_2_Computer
public class Computer {
    private final String cpu;
    private final int ram;
    private final int storage;
    private final String gpu;
    private final String os;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.os = builder.os;
    }

    // 내부 클래스
    public static class Builder {
        // 필수값
        private final String cpu;
        private final int ram;

        // 선택값
        private int storage;
        private String gpu;
        private String os;

        // 필수값은 생성자로만 설정 가능
        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder os(String os) {
            this.os = os;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}