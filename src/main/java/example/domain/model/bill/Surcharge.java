package example.domain.model.bill;

import java.util.Objects;

/**
 * 金額
 */
public class Surcharge {

    public Surcharge(int value) {
        this.value = value;
    }

    int value;

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%,d円", value);
    }

    @Override
    public boolean equals(Object other) {
        return isEqual((Surcharge) other);
    }

    private boolean isEqual(Surcharge surcharge) {
        return value == surcharge.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
