package backend.model;
import java.util.ArrayList;
import java.util.List;

public class BossManager {

    ArrayList<Boss> bosses;

    public BossManager (){
        bosses = new ArrayList<>();

        Boss math1 = new Boss(
                "Halimeow", 100, 100, Category.MATHEMATICS, false
        );

        bosses.add(math1);
    }

}
