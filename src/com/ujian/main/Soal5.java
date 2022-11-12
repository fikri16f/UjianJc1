package com.ujian.main;

public class Soal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double meter = 2500;
        double milkemeter = 1609;
        double jam = 5;
        double menit = 5;
        double detik = 23;
        
        double milperhour,mil, meterkeKM, konversijamkemenit,konversimenitkedetik1,konversimenitkedetik2, second, hour, kmperhour, meterpersecond,konversidetikkemenit,konversimenitkejam1,konversimenitkejam2;
        
        konversijamkemenit = jam * 60;
        konversimenitkedetik1 = menit * 60;
        konversimenitkedetik2 = konversijamkemenit * 60;
        konversidetikkemenit = detik / 60;
        konversimenitkejam1 = menit / 60 ;
        konversimenitkejam2 = konversidetikkemenit/60;
        mil = meter / milkemeter;
        
        second = detik + konversimenitkedetik1 + konversimenitkedetik2;
        hour = jam + konversimenitkejam1 + konversimenitkejam2;
        
        meterpersecond = meter / second;
        meterkeKM = meter/1000;
        kmperhour = meterkeKM/hour;
        milperhour  = mil/hour;
        
        ;
//        System.out.println(mil +" mil");
//        System.out.println("------------------------------------------");
//        System.out.println(konversimenitkejam1 +" jam");
//        System.out.println(konversimenitkejam2 +" jam");
//        System.out.println(second +" detik");
//        System.out.println(hour +" jam");
        System.out.println("------------------------------------------");
        System.out.println("Kecepatan dalam meters/second adalah "+ meterpersecond);
        System.out.println("Kecepatan dalam km/h adalah "+ kmperhour);
        System.out.println("Kecepatan dalam mil/h adalah "+ milperhour);

	}

}
