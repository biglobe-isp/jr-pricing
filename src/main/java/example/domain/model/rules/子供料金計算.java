package example.domain.model.rules;

import example.domain.model.bill.子供料金;
import example.domain.model.specification.Destination;
import example.domain.model.specification.TicketType;
import example.domain.model.specification.TrainType;

public class 子供料金計算 {

    public 子供料金 calc(FareTable fareTable, 特急料金 特急料金, int child, Destination destination, TrainType trainType, TicketType ticketType){
        return new 子供料金(
                (fareTable.childFare(destination,ticketType) + 特急料金.calc子供特急料金(destination,trainType,ticketType)) * child
        );
    }
}
