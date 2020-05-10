
public class ExampleClass {
	// Instance
	// instance 라는 전역변수 선언하는데 static으로 인스턴스화 하지 않고 사용 가능
	// 하지만 접근 제한자가 private로 되어 있어 직접적인 접근 불가능	
	private static ExampleClass instance = new ExampleClass();
	
	// private construct
	// 생성자도 private로 되어 있어 new를 통한 객체 생성도 불가능
	private ExampleClass() {}
	
	// 결국 getInstance메서드로 해당 인스턴스 얻을 수 있게 된다
	public static ExampleClass getInstance() {
		return instance;
	}
}
