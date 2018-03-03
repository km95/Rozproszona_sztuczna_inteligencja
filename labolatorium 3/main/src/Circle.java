public class Circle extends Figure implements Print {

    int r;

    Circle(int r) {
        if (r < 0)
            throw new ArithmeticException("Ujemna liczba");
        this.r = r;

    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * r;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * r * r;
    }

    @Override
    public void print() {
        System.out.println("r = " + r);
        System.out.println("Pole kola = " + calculateArea());
        System.out.println("Obwud kola = " + calculatePerimeter());
    }
}
