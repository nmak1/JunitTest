import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class ElevatorTest extends Elevator {



    @Test

    public void arayDeque() {
        final Queue<Integer> floorTest = new ArrayDeque<>();
        floorTest.add(2);
        floorTest.add(8);
        floorTest.add(12);
        floorTest.add(10);
        floorTest.add(0);

        Elevator.printElevator((Queue<Integer>) floorTest);


        assertThat(floorTest, is(floorTest));
        MatcherAssert.<Queue<Integer>>assertThat(floorTest, hasItems(8));
        assertThat(floorTest, containsInAnyOrder(2, 8, 12,10,0));

    }


}




