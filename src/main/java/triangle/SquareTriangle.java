package triangle;

public class SquareTriangle {
    public static void main(String[] args) {
        System.out.println(squareTriangle(1, 1, 7));
    }

    public static String squareTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Calculation with such data is not possible";
        } else if (a + b < c || a + c < b || b + c < a) {
            return "It's not a triangle";
        } else {
            int p = (a + b + c) / 2;
            double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return String.valueOf(square);
        }
    }
}

