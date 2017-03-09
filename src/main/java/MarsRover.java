import java.util.Objects;

public class MarsRover {
    @FunctionalInterface
    public interface PositionConsumer {
        void consume(final int x, final int y, final String orientation);
    }

    private int size;
    private int x;
    private int y;
    private String orientation;

    public MarsRover(int size, int initialX, int initialY, String initialOrientation) {
        this.size = size;
        x = initialX;
        y = initialY;
        orientation = initialOrientation;
    }

    public void move(final String command, final PositionConsumer positionConsumer) {
        positionConsumer.consume(facesEast() ? x : x + 1, facesEast() ? y + 1 : y, orientation);
    }

    private boolean facesEast() {
        return Objects.equals(orientation, "E");
    }
}
