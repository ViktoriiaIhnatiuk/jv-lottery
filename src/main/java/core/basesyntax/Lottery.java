package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        ColorSupplier randcolor = new ColorSupplier();
        Random num = new Random();
        Ball ball = new Ball(randcolor.getRandomColor(), num.nextInt(100));
        return String.valueOf(ball);

    }
}
