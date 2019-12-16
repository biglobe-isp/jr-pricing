package example.domain.model.bill;

import java.util.Objects;

/**
 * 金額
 */
public class AdultNum {
    public int getValue() {
        return value;
    }

    int value;

    public AdultNum(int value) {
        this.value = value;
    }

    public AdultNum add(AdultNum other) {
        return new AdultNum(value + other.value);
    }

    @Override
    public String toString() {
        return String.format("%,d円", value);
    }

    @Override
    public boolean equals(Object other) {
        return isEqual((AdultNum) other);
    }

    private boolean isEqual(AdultNum amount) {
        return value == amount.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
