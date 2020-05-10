
public class ExampleClass {
	// Instance
	private static ExampleClass instance;
	
	// private construct
	private ExampleClass() {}
	
	// static 블럭을 사용할 경우 클래스가 로딩될 때 한번만 실행하게 되는 특성 사용
	// 하지만 인스턴스가 사용되는 시적ㅁ이 아닌 클래스 로딩 시점에 실행 된다.
	static {
		try { instance = new ExampleClass();}
		catch(Exception e) { throw new RuntimeException("instance 만들기 실패. 에러  = " +e.getMessage());}
	}
	
	public static ExampleClass getInstance() {
		return instance;
	}
}
