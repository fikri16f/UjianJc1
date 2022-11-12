package com.ujian.main;

import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int berat;
        double tinggi, bmi, tinggibagi;
        
        Scanner data = new Scanner(System.in);
        
        System.out.println("Masukan Berat :");
        berat = data.nextInt();
        
        System.out.println("masukkan Tinggi");
        tinggi = data.nextDouble();
        
        tinggibagi = tinggi/100;
        bmi = berat / (tinggibagi*tinggibagi);

        System.out.println("Body Mass Index adalah "+ bmi);
        if (bmi < 18.4) {
        System.out.println("anda Kurus, banyakin makan makanan yang bergizi ya");
        } else if(bmi > 18.4 && bmi < 27){
        System.out.println("Pass Lah ya");
        } else if (bmi > 27){
        System.out.println("Anda Gendut, Olahraga lah jangan males, jgn lupa diet");
        }
	}

}
