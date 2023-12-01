package ch03_scanner;

// java.util 패키지에 소속된 Scanner 클래스를 가져옴.
import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scanner 라는 이름의 Scanner 클래스 객체 선언
		Scanner scanner = new Scanner(System.in);
		// Scanner에 빨간 밑줄이 뜨면 마우스를 대고 import를 눌러주면 된다.
		System.out.print("숫자를 입력하세요: ");
		// 'ln'옵션은 줄을 바꿔버리는 옵션이다.
		int num1 = scanner.nextInt();
		System.out.println(num1);
	}

}
