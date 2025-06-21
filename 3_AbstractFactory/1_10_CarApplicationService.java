// 1_10_CarApplicationService
public class CarApplicationService {
    private final CarFactory factory;

    public CarApplicationService(CarFactory factory) {
        this.factory = factory;
    }

    public void executeTestDrive() {
        Sedan sedan = factory.createSedan();
        SUV suv = factory.createSUV();

        System.out.println("[테스트 드라이브 시작]");
        sedan.drive();
        suv.driveOffRoad();
        System.out.println("[테스트 드라이브 종료]");
    }
}