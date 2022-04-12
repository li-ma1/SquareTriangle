package triangle;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;
import static org.junit.Assert.assertEquals;

public class SquareTriangleTest {

    @Test
    public void checkAnswer() {
        Assertions.assertAll("Should return answer",
                (Executable) () -> assertEquals(SquareTriangle.squareTriangle(3, 4, 5), "6.0"),
                (Executable) () -> assertEquals(SquareTriangle.squareTriangle(0, 0, 0), "Calculation with such data is not possible"),
                (Executable) () -> assertEquals(SquareTriangle.squareTriangle(0, 4, 5), "Calculation with such data is not possible"),
                (Executable) () -> assertEquals(SquareTriangle.squareTriangle(3, 0, 5), "Calculation with such data is not possible"),
                (Executable) () -> assertEquals(SquareTriangle.squareTriangle(3, 4, 0), "Calculation with such data is not possible"),
                (Executable) () -> assertEquals(SquareTriangle.squareTriangle(-3, -4, -5), "Calculation with such data is not possible"),
                (Executable) () -> assertEquals(SquareTriangle.squareTriangle(-3, 4, 5), "Calculation with such data is not possible"),
                (Executable) () -> assertEquals(SquareTriangle.squareTriangle(3, -4, 5), "Calculation with such data is not possible"),
                (Executable) () -> assertEquals(SquareTriangle.squareTriangle(1, 1, 3), "It's not a triangle"),
                (Executable) () -> assertEquals(SquareTriangle.squareTriangle(1, 3, 1), "It's not a triangle"),
                (Executable) () -> assertEquals(SquareTriangle.squareTriangle(3, 1, 1), "It's not a triangle")
        );
    }
}

