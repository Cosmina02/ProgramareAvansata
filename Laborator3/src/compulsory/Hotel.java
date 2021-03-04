package compulsory;

import java.time.LocalTime;

public class Hotel extends Location implements Visitable, Payable, Classifiable{

    private double ticketPrice;
    private LocalTime openingTime, closingTime;
    private int rank;

    public Hotel() {
    }

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public int getRank() {
        return rank;
    }
}
