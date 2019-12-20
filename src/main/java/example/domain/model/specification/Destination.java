package example.domain.model.specification;

/**
 * 目的地
 */
public enum Destination {
    新大阪(533),
    姫路(644);

    int 営業キロ;

    Destination(int i) {
        this.営業キロ = i;
    }

    public boolean is割引対象(){
        return 601 <= this.営業キロ;
    }
}
