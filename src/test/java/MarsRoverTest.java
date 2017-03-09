import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
    @Test
    public void shouldMoveTo0_1WhenStartingAt0_0EAndMoveF() {
        new MarsRover(4, 0, 0, "E")
                .move("f", (x, y, o) -> {
                    Assert.assertEquals(x, 0);
                    Assert.assertEquals(y, 1);
                    Assert.assertEquals(o, "E");
                });
    }

    @Test
    public void shouldMoveTo1_0WhenStartingAt0_0SAndMoveF() {
        new MarsRover(4, 0, 0, "S")
                .move("f", (x, y, o) -> {
                    Assert.assertEquals(x, 1);
                    Assert.assertEquals(y, 0);
                    Assert.assertEquals(o, "S");
                });
    }

    @Test
    public void shouldMoveTo2_0WhenStartingAt1_0EAndMoveF() {
        new MarsRover(4, 0, 1, "E")
                .move("f", (x, y, o) -> {
                    Assert.assertEquals(x, 0);
                    Assert.assertEquals(y, 2);
                    Assert.assertEquals(o, "E");
                });
    }

    @Test
    public void shouldMoveTo2_1WhenStartingAt1_1EAndMoveF() {
        new MarsRover(4, 1, 1, "S")
                .move("f", (x, y, o) -> {
                    Assert.assertEquals(x, 2);
                    Assert.assertEquals(y, 1);
                    Assert.assertEquals(o, "S");
                });
    }


}
