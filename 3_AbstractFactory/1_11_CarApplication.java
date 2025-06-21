//1_11_CarApplication
//사용 예
public class CarApplication {
    public static void main(String[] args) {
        CarFactory factory = new HyundaiFactory(); // 또는 TeslaFactory
        CarApplicationService service = new CarApplicationService(factory);

        service.executeTestDrive();
    }
}
//출력: [테스트 드라이브 시작]
//출력: 현대 세단 주행 
//출력: 현대 SUV 오프로드 주행
//출력: [테스트 드라이브 종료]