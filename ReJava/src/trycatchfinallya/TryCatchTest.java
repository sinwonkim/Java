package trycatchfinallya;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest {
	public static void main(String[] args) {
		IntTypeClass intTypeClass= new IntTypeClass();
		 Scanner scanner = new Scanner(System.in);
		 TestScanner testScanner = new TestScanner();
		 System.out.println("오늘의 사용 금액은?");
		intTypeClass.multiply(testScanner.input());
	}
}

class IntTypeClass {
	int sum = 0;
	public void multiply(int a) {
		sum+=a;
		System.out.println("오늘의 사용금액은 "+a+" 입니다. 지금까지 총 사용금액은 "+sum +"입니다.");
	}
}

class TestScanner{
	Scanner scanner = new Scanner(System.in);
	int a = 0;
	
	public int input() {
		
		try {
			a = scanner.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자로 입력해주세요");
			scanner.next();
			input();
		}
		return a;
	}
	

}
