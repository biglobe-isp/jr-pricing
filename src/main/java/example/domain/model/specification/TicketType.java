package example.domain.model.specification;

/**
 * 片道/往復
 */
public enum TicketType {
    片道(1),
    往復(2);

    int 回数;

    TicketType(int i) {
        this.回数 = i;
    }

    public int get回数(){
        return 回数;
    }

    public boolean is往復(){
        return 往復.equals(this);
    }
}