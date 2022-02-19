

public class Circle {
    private int state;
    private int position;
    private static int diameter;
    private static int maxHeight;

    public Circle(int position) {
        this.position = position;
    }

    public int getHeight() {
        return (Circle.maxHeight * this.position) / 5;
    }
    public static void setMaxHeight(int max) {
        Circle.maxHeight = max;
    }
    public static void setDiameter(int diameter) {
        Circle.diameter = diameter;
    }
    public static int getDiameter() {
        return diameter;
    }
    public int getState() {
        this.state += this.position;
        return state;
    }

}
