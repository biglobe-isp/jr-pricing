package example.domain.model.specification;

/**
 * 座席区分
 */
public enum SeatType {
    指定席(0),
    自由席(-530);

    int 自由席割引料金;

    SeatType(int i) {
        this.自由席割引料金 = i;
    }

    public int get自由席割引料金() {
        return 自由席割引料金;
    }
}
