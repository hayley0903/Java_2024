package calc;

import java.util.Scanner;

public class CalcAvgEx {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		[ 요구사항 ]
		- 숫자를 연속으로 입력받아 평균값을 구하세요.
		- 숫자 0 을 입력 받으면 반복을 멈추고 최종 결과를 보여주세요.
		--------------------------

		 */
		
	 int num = 0;
	 int result = 0;
	 
	 int average = 0;
	 int i = 0;

	 String calcAvg = "";
	 
	 boolean flag = true;
	 
	 while (flag) {
		 num = getNum();
		 
		 if (num != 0) {
		 result = result + num;
		 i ++;
		 } else 
			 break;
		 }
		 average = result / i;

		 System.out.println(average);

		 
	 }
		
		
	
	public static int getNum() {
		System.out.print("숫자를 입력하세요. : ");
		int num = sc.nextInt();
		return num;
	}
	

}