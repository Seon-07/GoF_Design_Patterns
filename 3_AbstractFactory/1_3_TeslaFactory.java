//1_3_TeslaFactory
public class TeslaFactory implements CarFactory {
    public Sedan createSedan() {
        return new TeslaSedan();
    }
    public SUV createSUV() {
        return new TeslaSUV();
    }
}