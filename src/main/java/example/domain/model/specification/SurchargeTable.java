package example.domain.model.specification;

import example.domain.model.bill.Surcharge;
import example.domain.model.rules.HikariSurchargeTable;
import example.domain.model.rules.NozomiSurchargeTable;

/**
 * 目的地
 */
public interface SurchargeTable {

    static Surcharge surchage(TrainType trainType, Destination destination, SeatType seatType) {
        switch (trainType) {
            case ひかり:
                return HikariSurchargeTable.surcharge(destination, seatType);
            case のぞみ:
                return NozomiSurchargeTable.surcharge(destination, seatType);
            default:
                throw new RuntimeException("そんな新幹線はありません");
        }
    }
}