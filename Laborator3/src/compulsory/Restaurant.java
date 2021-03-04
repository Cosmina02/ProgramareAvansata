package compulsory;

import java.time.LocalTime;

public class Restaurant extends Location implements Payable,Classifiable, Visitable{

    private double ticketPrice;
    private LocalTime openingTime, closingTime;
    private int rank;

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int getRank() {
        return this.rank;
    }

    @Override
    public LocalTime getOpeningTime() {
        return this.openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return this.closingTime;
    }
}
