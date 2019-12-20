package example.application.service;

import example.domain.model.attempt.Attempt;
import example.domain.model.bill.Amount;
import example.domain.model.bill.大人料金;
import example.domain.model.bill.子供料金;
import example.domain.model.rules.*;
import example.domain.model.specification.Destination;
import example.domain.model.specification.TicketType;
import example.domain.model.specification.TrainType;
import org.springframework.stereotype.Service;

/**
 * 料金計算サービス
 */
@Service
public class FareService {

    FareTable fareTable;
    SurchargeTable surchargeTable;
    DistanceTable distanceTable;
    割増料金 割増料金;
    特急料金 特急料金;

    public FareService(FareTable fareTable, SurchargeTable surchargeTable, DistanceTable distanceTable) {
        this.fareTable = fareTable;
        this.surchargeTable = surchargeTable;
        this.distanceTable = distanceTable;
    }

    public Amount amountFor(Attempt attempt) {
        Destination to = attempt.to();
        TrainType trainType = attempt.getTrainType();
        TicketType ticketType = attempt.getTicketType()
        大人料金 大人料金 = new 大人料金計算().calc(fareTable, 特急料金,attempt.getAdult(),to,trainType,ticketType);
        子供料金 子供料金 = new 子供料金計算().calc(fareTable, 特急料金,attempt.getchild(),to,trainType,ticketType);

        return new Amount(大人料金,子供料金);
    }
}
