package example.domain.model.rules;

import example.domain.model.specification.Destination;
import example.domain.model.specification.TicketType;

public class 往復割引計算 {
    double calc往復割引(Destination destination, TicketType ticketType){
        if(destination.is割引対象() && ticketType.is往復()){
            return 0.9;
        }
        return 1;
    }
}
