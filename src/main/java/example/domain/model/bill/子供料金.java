package example.domain.model.bill;

import example.domain.model.rules.FareTable;
import example.domain.model.rules.特急料金;
import example.domain.model.specification.Destination;
import example.domain.model.specification.TrainType;

public class 子供料金 {

    int value;

    public 子供料金(int i) {
        this.value = i;
    }


    public int getValue() {
        return value;
    }

}