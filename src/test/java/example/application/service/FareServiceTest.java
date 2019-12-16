package example.application.service;

import example.domain.model.attempt.Attempt;
import example.domain.model.bill.Amount;
import example.domain.model.rules.DistanceTable;
import example.domain.model.rules.FareTable;
import example.domain.model.rules.HikariSurchargeTable;
import example.domain.model.specification.Destination;
import example.domain.model.specification.SeatType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FareServiceTest {

    static private FareService fareService;

    static private FareTable fareTable;
    static private HikariSurchargeTable surchargeTable;
    static private DistanceTable distanceTable;

    @BeforeAll
    static void setUp() {
        fareTable = new FareTable();
        surchargeTable = new HikariSurchargeTable();
        distanceTable = new DistanceTable();

        fareService = new FareService();
    }

    @Test
    void 基本() {
        Attempt attempt = AttemptFactory.大人1_通常期_新大阪_指定席_ひかり_片道();
        Amount result = fareService.amountFor(attempt);
        Destination destination = Destination.新大阪;
        SeatType seatType = SeatType.指定席;
        Amount expected = new Amount(fareTable.fare(destination), surchargeTable.surcharge(destination, seatType));
        assertEquals(expected, result);
    }
}