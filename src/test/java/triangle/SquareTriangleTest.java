package triangle;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.assertEquals;

public class SquareTriangleTest {
    @Test
    public void checkAnswer() {
        Assertions.assertAll("Should return answer",
                () -> assertEquals(SquareTriangle.squareTriangle(3, 4, 5), "6.0"),
                () -> assertEquals(SquareTriangle.squareTriangle(0, 0, 0), "Calculation with such data is not possible"),
                () -> assertEquals(SquareTriangle.squareTriangle(0, 4, 5), "Calculation with such data is not possible"),
                () -> assertEquals(SquareTriangle.squareTriangle(3, 0, 5), "Calculation with such data is not possible"),
                () -> assertEquals(SquareTriangle.squareTriangle(3, 4, 0), "Calculation with such data is not possible"),
                () -> assertEquals(SquareTriangle.squareTriangle(-3, -4, -5), "Calculation with such data is not possible"),
                () -> assertEquals(SquareTriangle.squareTriangle(-3, 4, 5), "Calculation with such data is not possible"),
                () -> assertEquals(SquareTriangle.squareTriangle(3, -4, 5), "Calculation with such data is not possible"),
                () -> assertEquals(SquareTriangle.squareTriangle(1, 1, 3), "It's not a triangle"),
                () -> assertEquals(SquareTriangle.squareTriangle(1, 3, 1), "It's not a triangle"),
                () -> assertEquals(SquareTriangle.squareTriangle(3, 1, 1), "It's not a triangle")
        );
    }
}

