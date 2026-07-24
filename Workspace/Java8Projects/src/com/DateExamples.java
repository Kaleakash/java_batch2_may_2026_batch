package com;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Set;

public class DateExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LocalDate ld = LocalDate.now();
//		System.out.println(ld);
//		Set<String> zones = ZoneId.getAvailableZoneIds();
//		System.out.println(zones.size());
//		zones.stream().forEach(z->System.out.println(z));
		
		LocalDate birth = LocalDate.of(2000, 1, 1);
		Period age = Period.between(birth, LocalDate.now());

		System.out.println(age.getYears());
	

	}

}
