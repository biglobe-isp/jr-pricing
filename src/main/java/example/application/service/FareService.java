package example.application.service;

import example.domain.model.attempt.Attempt;
import example.domain.model.bill.Amount;
import example.domain.model.bill.Fare;
import example.domain.model.bill.Surcharge;
import example.domain.model.rules.FareTable;
import example.domain.model.specification.SurchargeTable;
import org.springframework.stereotype.Service;

/**
 * 料金計算サービス
 */
@Service
public class FareService {

    public Amount amountFor(Attempt attempt) {
        Fare fare = FareTable.fare(attempt.getDestination());
        // FIXME 時間切れ、バリューオブジェクトにしよう
        int fareAdultTotal = Double.valueOf(Math.floor(fare.getValue() * attempt.getAdultNum().getValue())).intValue();
        int fareChildTotal =  Double.valueOf(Math.floor(fare.getValue() * attempt.getChildNum().getValue() * 0.5)).intValue();

        Surcharge surcharge = SurchargeTable.surchage(attempt.getTrainType(), attempt.getDestination(), attempt.getSeatType());
        // FIXME 時間切れ、バリューオブジェクトにしよう
        int surchargeAdultTotal = Double.valueOf(Math.floor(surcharge.getValue() * attempt.getAdultNum().getValue())).intValue();
        int surchargeChildTotal = Double.valueOf(Math.floor(surcharge.getValue() * attempt.getChildNum().getValue() * 0.5)).intValue();

        return new Amount(new Fare(fareAdultTotal + fareChildTotal), new Surcharge(surchargeAdultTotal + surchargeChildTotal));
    }

}
