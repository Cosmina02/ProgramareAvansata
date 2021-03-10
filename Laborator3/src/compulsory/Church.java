package compulsory;

import java.time.Duration;
import java.time.LocalTime;

public class Church extends Location implements Visitable{
    private LocalTime openingTime, closingTime;

    public Church() {
    }
    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }


}
