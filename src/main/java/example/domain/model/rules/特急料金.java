package example.domain.model.rules;

import example.domain.model.specification.Destination;
import example.domain.model.specification.SeatType;
import example.domain.model.specification.TicketType;
import example.domain.model.specification.TrainType;

public class 特急料金 {
    SurchargeTable surchargeTable;
    SeatType seatType;
    割増料金 割増料金;

    public int calc特急料金(Destination destination, TrainType trainType, TicketType ticketType) {
        return (surchargeTable.surcharge(destination)
                + 割増料金.calc割増料金(destination, trainType)
                + seatType.get自由席割引料金())
                * ticketType.get回数();
    }

    public int calc子供特急料金(Destination destination, TrainType trainType, TicketType ticketType) {
        return surchargeTable.chaildSurcharge(destination)
                + 割増料金.calc割増料金(destination, trainType)
                + seatType.get自由席割引料金()
                * ticketType.get回数();
    }

}
