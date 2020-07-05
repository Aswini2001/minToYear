package JavaMin;

import java.util.Scanner;

public class MinuteToYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner  ss = new Scanner(System.in);
   System.out.println("input the number of minutes: ");
   int min = ss.nextInt();
    int year = min/525600;
    int remain = min%525600;
    int day = remain/1440;
    System.out.println(min+ " minutes is approximately  "+year+" years "+day+" days");
	}

}
