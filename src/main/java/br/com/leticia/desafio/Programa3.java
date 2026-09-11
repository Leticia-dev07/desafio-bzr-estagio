package br.com.leticia.desafio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Programa3 {

	public static void main(String[] args) {
		
		LocalDate inicio2000 = LocalDate.of(2000, 2, 15);
		LocalDate fim2000 = LocalDate.of(2000, 10, 15);
		long dias2000 = ChronoUnit.DAYS.between(inicio2000, fim2000);
		
		LocalDate inicio2001 = LocalDate.of(2001, 2, 15);
		LocalDate fim2001 = LocalDate.of(2001, 10, 15);
		long dias2001 = ChronoUnit.DAYS.between(inicio2001, fim2001);
		
		LocalDate inicio1900 = LocalDate.of(1900, 2, 15);
		LocalDate fim1900 = LocalDate.of(1900, 10, 15);
		long dias1900 = ChronoUnit.DAYS.between(inicio1900, fim1900);
		
		LocalDate inicio1582 = LocalDate.of(1582, 2, 15);
		LocalDate fim1582 = LocalDate.of(1582, 10, 15);
		long dias1582 = ChronoUnit.DAYS.between(inicio1582, fim1582) - 10;
		

		System.out.println("Dias entre as datas de 1582: " + dias1582);
		
		System.out.println("Dias entre as datas de 1900: " + dias1900);

		System.out.println("Dias entre as datas de 2001: " + dias2001);
		
        System.out.println("Dias entre as datas de 2000: " + dias2000);

        
	}

}
