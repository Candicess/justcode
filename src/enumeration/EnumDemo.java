package enumeration;

/**
 * Created by huan on 2017/10/5.
 */
public class EnumDemo {

    public static void main(String[] args) {
        Week day = Week.Monday;

        for (Week item : Week.values()) {
            System.out.println(item);
            System.out.println(item.getName());
        }
    }
}

enum Week {

    Monday("周1"), Tuesday("周2"), Wednesday("周3"), Thusday("周4"), Friday("周5"), Saterday("周6"), Sunday("周7");

    private String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}