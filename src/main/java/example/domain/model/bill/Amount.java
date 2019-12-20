package example.domain.model.bill;

import java.util.Objects;

/**
 * 金額
 */
public class Amount {
    int value;

    public Amount(int value) {
        this.value = value;
    }

    public Amount(大人料金 大人料金, 子供料金 子供料金) {
        this.value = 大人料金.getValue() + 子供料金.getValue();
    }

    public Amount add(Amount other) {
        return new Amount(value + other.value);
    }

    public int calc() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%,d円", value);
    }

    @Override
    public boolean equals(Object other) {
        return isEqual((Amount) other);
    }

    private boolean isEqual(Amount amount) {
        return value == amount.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
