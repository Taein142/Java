package ch02_operator;
// 스샷 참고해서 작성해놓기
public class Ex02 {

	public static void main(String[] args) {
		System.out.println(10 > 5);
		System.out.println(10 < 5);
		boolean result = 77 <= 60;
		System.out.println(result);
		result = (8 == 100);
		System.out.println(result);
		result = false;
		boolean bool1 = true;
//		변수값을 다른 변수에 대입하는 것은 복사 개념
		result = bool1;
		System.out.println(result);
		System.out.println(bool1);
	}
}
