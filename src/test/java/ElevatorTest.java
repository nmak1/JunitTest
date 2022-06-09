import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class ElevatorTest extends Main {

//    private final InputStream systemIn = in;
//    private final PrintStream systemOut = out;
//
//    private ByteArrayInputStream testIn;
//    private ByteArrayOutputStream testOut;
//
//    @Before
//    public void setUpOutput() {
//        testOut = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(testOut));
//    }
//
//    private void provideInput(String data) {
//        testIn = new ByteArrayInputStream(data.getBytes());
//        setIn(testIn);
//    }
//
//    private String getOutput() {
//        return testOut.toString();
//    }
//
//    @After
//    public void restoreSystemInputOutput() {
//        setIn(systemIn);
//        setOut(systemOut);
//    }


    @Test

    public void ArrayDeque() {
        final Queue<Integer> floorTest = new ArrayDeque<>();
        floorTest.add(2);
        floorTest.add(8);
        floorTest.add(12);
        floorTest.add(10);
        floorTest.add(0);
        Main.printElevator(floorTest);


        assertThat(floorTest, is(floorTest));
        MatcherAssert.<Queue<Integer>>assertThat(floorTest, hasItems(8));
        assertThat(floorTest, containsInAnyOrder(2, 8, 12));

    }
//    @Test
//    public void testCase1() {
//        final String testString = "0";
//        provideInput(testString);
//
//        Main.main(new String[0]);
//
//        assertEquals(testString, getOutput());
//    }



}




