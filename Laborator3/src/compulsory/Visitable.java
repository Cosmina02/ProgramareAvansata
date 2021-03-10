package compulsory;
import java.time.Duration;
import java.time.LocalTime;

public interface Visitable {
//optional
    default LocalTime getOpeningTime(){
        return LocalTime.parse("09:30");
    }
    default LocalTime getClosingTime(){
        return LocalTime.parse("20:00");
    }

    static Duration getVisitingDuration(LocalTime openingTime, LocalTime closingTime)
    {
        return Duration.between(openingTime,closingTime);
    }
}
