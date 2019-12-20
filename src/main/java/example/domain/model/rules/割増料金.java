package example.domain.model.rules;

import example.domain.model.specification.Destination;
import example.domain.model.specification.TrainType;

public class 割増料金 {

    public int calc割増料金(Destination destination, TrainType trainType) {
        if (trainType.equals(TrainType.のぞみ)) {
            if (destination.equals(Destination.姫路)) {
                return 530;
            }
            if (destination.equals(Destination.新大阪)) {
                return 320;
            }
        }
        //ひかりの料金
        return 0;
    }
}