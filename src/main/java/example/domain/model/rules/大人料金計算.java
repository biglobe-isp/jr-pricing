package example.domain.model.rules;

import example.domain.model.bill.大人料金;
import example.domain.model.bill.子供料金;
import example.domain.model.specification.Destination;
import example.domain.model.specification.TicketType;
import example.domain.model.specification.TrainType;

public class 大人料金計算 {

    public 大人料金 calc(FareTable fareTable, 特急料金 特急料金, int adult, Destination destination, TrainType trainType, TicketType ticketType){

        return new 大人料金(
                (fareTable.fare(destination,ticketType) + 特急料金.calc特急料金(destination,trainType,ticketType)) * adult
        );
    }
}
