package com.ujian.main;

import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int meter;
		double inch =  0.0254;
		double hasil;
		
		Scanner data = new Scanner(System.in);		
		System.out.print("Masukan nilai dalam inch: ");
		meter = data.nextInt();
		 hasil = meter * inch ;
		 
		 System.out.println( meter +" inch adalah "+ hasil +" meter");
		
	}

}
