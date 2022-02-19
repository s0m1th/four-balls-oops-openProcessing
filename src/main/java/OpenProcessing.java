import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class OpenProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;
    private List<Circle> list = new ArrayList<>();


    public static void main(String[] args) {
        PApplet.main("OpenProcessing",args);

    }

    @Override
    public void setup() {
        super.setup();
        Circle.setDiameter(DIAMETER);
        Circle.setMaxHeight(HEIGHT);

        for (int i=1; i<=4; i++)
            list.add(new Circle(i));

    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (Circle circle: list) {
            ellipse(circle.getState(),circle.getHeight(),Circle.getDiameter(),Circle.getDiameter());
        }

    }

}
