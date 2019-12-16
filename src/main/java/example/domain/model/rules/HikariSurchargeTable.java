package example.domain.model.rules;

import example.domain.model.bill.Surcharge;
import example.domain.model.specification.Destination;
import example.domain.model.specification.SeatType;
import example.domain.model.specification.SurchargeTable;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;

/**
 * ひかり　指定席特急券テーブル
 */
@Component
public class HikariSurchargeTable implements SurchargeTable {

    private final static Surcharge unreservedSeatDiscount = new Surcharge(530);

    static Map<Destination, Surcharge> map = new EnumMap<Destination, Surcharge>(Destination.class);

    static {
        map.put(Destination.新大阪, new Surcharge(5490));
        map.put(Destination.姫路, new Surcharge(5920));
    }

    public static Surcharge surcharge(Destination destination, SeatType seatType) {
        switch (seatType) {
            case 自由席:
                return discount(map.get(destination));
            case 指定席:
                return map.get(destination);
            default:
                throw new RuntimeException();
        }

    }

    public static Surcharge discount(Surcharge surcharge) {
        return new Surcharge(surcharge.getValue() - unreservedSeatDiscount.getValue());
    }
}