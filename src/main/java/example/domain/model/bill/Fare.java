package example.domain.model.bill;

import java.util.Objects;

/**
 * 金額
 */
public class Fare {

    public Fare(int value) {
        this.value = value;
    }

    int value;

    public int getValue() {
        return value;
    }

    public Fare add(Fare other) {
        return new Fare(value + other.value);
    }

    @Override
    public String toString() {
        return String.format("%,d円", value);
    }

    @Override
    public boolean equals(Object other) {
        return isEqual((Fare) other);
    }

    private boolean isEqual(Fare fare) {
        return value == fare.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
