package example.domain.model.rules;

import example.domain.model.bill.Fare;
import example.domain.model.specification.Destination;

import java.util.EnumMap;
import java.util.Map;

/**
 * 運賃テーブル
 */
public class FareTable {

    static Map<Destination, Fare> map = new EnumMap<Destination, Fare>(Destination.class);

    static {
        map.put(Destination.新大阪, new Fare(8910));
        map.put(Destination.姫路, new Fare(10010));
    }

    public static Fare fare(Destination destination) {
        return map.get(destination);
    }
}
