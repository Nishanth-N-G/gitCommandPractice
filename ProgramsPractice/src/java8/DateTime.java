package java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate yesterday = today.minusDays(1);
		LocalDate tomorrow = today.plusDays(1);
		LocalTime time = LocalTime.now();
		LocalTime time2 = time.minusHours(2);
		LocalTime time3 = time.minusMinutes(18);
		LocalTime time4 = time.plusHours(4);
		LocalTime time5 = time.plusMinutes(12);

		System.out.println(yesterday + " " + today + " " + tomorrow);
		System.out.println(time + " " + time2 + " " + time3 + " " + time4 + " " + time5);

		ZoneId zone1 = ZoneId.of("Asia/Kolkata");
		ZoneId zone2 = ZoneId.of("Asia/Tokyo");

		LocalTime timeZone1 = LocalTime.now(zone1);
		LocalTime timeZone2 = LocalTime.now(zone2);

		Long hourDiff = ChronoUnit.HOURS.between(timeZone1, timeZone2);
		Long minDiff = ChronoUnit.MINUTES.between(timeZone1, timeZone2);

		System.out.println(hourDiff + " " + minDiff);
	}

}
