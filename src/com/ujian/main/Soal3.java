package com.ujian.main;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int tahun, sisahari, bulan, sisabulan, sisajam, jam, menit, sisamenit;
		int hari;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan menit: ");
		menit = input.nextInt();
	
	jam= menit/60;
	sisamenit = menit % 60;
		
	hari = jam/24;
	sisajam = jam % 365;
		
	tahun = hari /365;
	sisahari = hari % 365;

	System.out.println(tahun +" tahun "+ sisahari+ " hari");
		
	}

}
