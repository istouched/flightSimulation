package UIRS.flightSimulation.program1;

import javafx.scene.layout.Pane;

public class CenterPane {

    private double x0i = 450;             //центр по X
    private double y0i = 228;             //центр по Y
    private double mX = 2.7;        //массштаб по X
    private double mY = 2.7;        //массштаб по Y

    public CenterPane(double x0i, double y0i, double mX, double mY) {
        this.x0i = x0i;
        this.y0i = y0i;
        this.mX = mX;
        this.mY = mY;
    }

    public CenterPane(Pane pane, double mX, double mY) {
        this.x0i = pane.getLayoutX() / 2;
        this.y0i = pane.getLayoutY() / 2;
        this.mX = mX;
        this.mY = mY;
    }

    public CenterPane(Pane pane) {
        this.x0i = pane.getLayoutX() / 2;
        this.y0i = pane.getLayoutY() / 2;

    }

    public double getX0i() {
        return x0i;
    }

    public double getY0i() {
        return y0i;
    }

    public double getmX() {
        return mX;
    }

    public double getmY() {
        return mY;
    }
}
