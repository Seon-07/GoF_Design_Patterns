//1_2_HyundaiFactory
public class HyundaiFactory implements CarFactory {
    public Sedan createSedan() {
        return new HyundaiSedan();
    }
    public SUV createSUV() {
        return new HyundaiSUV();
    }
}