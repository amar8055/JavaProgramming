

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//Period - days,weeks,months,years(We can not chain period and duration methods)
//Duration - days, minutes,seconds, hours, millis and nanos(datetime and time)
public class DateModificationMain {

	public static void main(String[] args) {

		
		LocalDateTime ldt = LocalDateTime.now();
		ldt = ldt.plus(Duration.ofMinutes(20));
		ldt = ldt.plus(Duration.of(2, ChronoUnit.HOURS));
		ldt = ldt.plus(Duration.ofSeconds(15));
		ldt = ldt.plus(Duration.ofNanos(10));
		System.out.println(ldt);
		//date.plus(Duration.ofDays(1));//run time exception
		
		//printing period and duration
	
		System.out.println(Duration.ofMinutes(20));
		System.out.println(Duration.ofSeconds(10));
		System.out.println(Duration.ofMillis(100));
		System.out.println(Duration.ofNanos(100));
		System.out.println(Duration.between(LocalDateTime.now(),ldt).toHours());
		
	}

}
