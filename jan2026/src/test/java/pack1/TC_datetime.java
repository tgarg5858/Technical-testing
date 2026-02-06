package pack1;
import java.time.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TC_datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Instant currenttime=Instant.now();
		System.out.println("Current Time:"+currenttime);
		
		LocalDate now=LocalDate.now();
		LocalDate Independence=LocalDate.of(1947, Month.AUGUST,15);
		System.out.println("Now: "+now);
		System.out.println("Independence: "+ Independence);
		System.out.println("Tommorrow: "+now.minusMonths(1));
		System.out.println("LastMonth: " + now.isLeapYear());
		System.out.println("move to 30th day of month:"+now.withDayOfMonth(30));
		
// 		Period period=Independence.until(now);
// 		Instant currenttime1=Instant.now();
//		System.out.println("Period:"+period);
//		//System.out.println("Days:"+period.get(ChronoUnit.DAYS));
//		//System.out.println("Months:"+period.get(ChronoUnit.MONTHS));
		
		ZonedDateTime ct=ZonedDateTime.now();
		ZonedDateTime ctinparis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("India Time:"+ct);
		System.out.println("Paris Time:"+ctinparis);
	}

}
