package com.ujian.main;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 double suhu;
	 int hasil,celcius;
	 double bagi = 5.9/9.0 ;
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Masukkan Nilai Fahrenheit : ");
		suhu = data.nextInt();
		
		celcius = (int) (bagi * (suhu - 32));
		System.out.println("--------------------");
		System.out.println(suhu + " F" + " sama dengan " + celcius +" C" );
		
	}

}
