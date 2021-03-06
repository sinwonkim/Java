package DataType;

public class DataType2 {
	// 메소드 영역 
	// 메소드 영역에는 코드에서 사용되는 클래스들을 클래스 로더로 읽어 클래스별로 런타임 상수풀 
	// 힙 영역은 객체와 배열이 생성되는 영역이다. 힙 영역에 생성된 객체와 배열은 JVM 스택 영역의 변수나 다른 객체의 필드에서 참조한다.
	// JVM 스택(Stack) 영역 
   /*
    * JVM 스택 영역은 각 스레드마다 하나씩 존재하며 스레드가 시작 될떄 할당된다. 자바 프로그램에서 추가적으로 스레드를 생성하지 않았다면 MAIN 스레드만
    * 존재하므로 jvm 스택도 하나이다. 기본 타입 변수는 스택 영역에 직접 값을 가지고 있지만, 참조 타입 변수는 값이 아니라 힙 영역이나 메소드 영역의 객체 주소를 가진다.
    * 기본 타입 변수는 스택 영역에 직접 값을 가지고 있지만, 참조 타입 변수는 값이 아니라 힙 영역이나 메소드 영역의 객체 주소를 가진다. 배열 변수인 SCORES는 스택 영역에 생성되지만
    * 실제 10, 20, 30 을 갖는 
    */
	
	// 기본 타입 변수 같은 경우 int a = 3;  스택 영역에 직접 값을 갖고 있지만
	
	public static void main(String[] args) {
		// 배열이나 객체같은 참조 타입 변수는 값이 아니라 힙 영역이나 메소드 영역의 객체 주소를 가진다.
		// 자바에서는 배열을 객체로 취급한다.
		int[] scores = {10,20,30};
		System.out.println(scores[0]);
		// 기본 타입 변수의==, != 연산은 변수의 값이 같은지, 아닌지를 조사하지만 참조 타입 변수들 간의 ==, != 연산은 동일한 객체를 참조하는지, 다른 객체를 참조하는지 알아볼 떄 사용된다. 
		// 참조 타입 변수는 힙 영역의 객체를 참조하지 않는 다는 뜻으로 null값을 가질 수 있ㄷ null값도 초기값으로 사용할 수 있기 떄문에 null로 초기화된 참조 변수는 스택영역에 생성된다.
		// 자바 참조 타입 변수를 잘못 사용하면 발생한다. 참조 타입 변수가 null을 가지고 있을 경우, 참조 타입 변수는 사용할 수 ㅇ벗다. 참조 타입 변수를 사용하는 것은 곧 객체를 사용하는 것을 의미하는데
		// 참조할 객체가 없으므로 사용할 수가 없는 것이다. 
	}
	
}
