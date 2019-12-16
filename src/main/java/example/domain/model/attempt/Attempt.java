package example.domain.model.attempt;

import example.domain.model.bill.AdultNum;
import example.domain.model.bill.ChildNum;
import example.domain.model.specification.*;

/**
 * 購入希望
 */
public class Attempt {
    public AdultNum getAdultNum() {
        return adult;
    }

    public ChildNum getChildNum() {
        return child;
    }

    public DepartureDate getDepartureDate() {
        return departureDate;
    }

    public Departure getDeparture() {
        return departure;
    }

    public Destination getDestination() {
        return destination;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    AdultNum adult;
    ChildNum child;

    DepartureDate departureDate;
    Departure departure;
    Destination destination;

    SeatType seatType;

    public TrainType getTrainType() {
        return trainType;
    }

    TrainType trainType;
    TicketType ticketType;

    public Attempt(AdultNum adult, ChildNum child, DepartureDate departureDate, Departure departure, Destination destination, SeatType seatType, TrainType trainType, TicketType ticketType) {
        this.adult = adult;
        this.child = child;
        this.departureDate = departureDate;
        this.departure = departure;
        this.destination = destination;
        this.seatType = seatType;
        this.trainType = trainType;
        this.ticketType = ticketType;
    }

    public Destination to() {
        return destination;
    }

    @Override
    public String toString() {
        return  "大人=" + adult + "人" +
                "\n子供=" + child + "人" +
                "\n出発日=" + departureDate +
                "\n目的地=" + destination +
                "\n座席区分=" + seatType +
                "\n列車種類=" + trainType +
                "\n片道/往復=" + ticketType
                ;
    }
}