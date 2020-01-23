import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class RouteCalculatorTest extends TestCase {

    List<Station> rout;

    @Override
    protected void setUp() throws Exception {
        rout = new ArrayList<>();

        Line line1 = new Line(1,"Первая");
        Line line2 = new Line(2, "Вторая");

        rout.add(new Station("Петровская", line1));
        rout.add(new Station("Арбузная", line1));
        rout.add(new Station("Морковная", line2));
        rout.add(new Station("Яблочная", line2));
    }

    public void testCalculateDuration(){
        double actual = RouteCalculator.calculateDuration(rout);
        double expected = 8.5;
        assertEquals(expected, actual);
    }

}
