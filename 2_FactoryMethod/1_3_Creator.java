//1_3_Creator
//추상클래스
public abstract class Creator {
	//추상 메소드
    public abstract Product factoryMethod();

    public void operation() {
        Product product = factoryMethod();
        product.use();
    }
}