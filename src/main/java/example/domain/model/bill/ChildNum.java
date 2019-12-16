package example.domain.model.bill;

import java.util.Objects;

/**
 * 金額
 */
public class ChildNum {
    public int getValue() {
        return value;
    }

    int value;

    public ChildNum(int value) {
        this.value = value;
    }

    public ChildNum add(ChildNum other) {
        return new ChildNum(value + other.value);
    }

    @Override
    public String toString() {
        return String.format("%,d円", value);
    }

    @Override
    public boolean equals(Object other) {
        return isEqual((ChildNum) other);
    }

    private boolean isEqual(ChildNum amount) {
        return value == amount.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
