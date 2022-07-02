package entities;

public class CoordinatesOfAPoint {

    private double pointX;
    private double pointY;
    private String quadrant;
    public CoordinatesOfAPoint(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }
    public void setQuadrant(String quadrant) {
        this.quadrant = quadrant;
    }
    public String quadrant() {
        if (getPointX() > 0 && getPointY() > 0) {
            return "The plane is Quadrant 1";
        }
        else if (getPointX() < 0 && getPointY() > 0) {
            return "The plane is Quadrant 2";
        }
        else if (getPointX() < 0 && getPointY() < 0) {
            return "The plane is Quadrant 3";
        }
        else if (getPointX() > 0 && getPointY() > 0) {
            return "The plane is Quadrant 4";
        } return "Origin";
    }
}
