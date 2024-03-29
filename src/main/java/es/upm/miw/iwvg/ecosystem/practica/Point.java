package es.upm.miw.iwvg.ecosystem.practica;

public class Point {

    private int x;

    private int y;

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public Point(int xy) {
        this(xy, xy);
    }

    public Point() {
        this(0, 0);
    }

    public double module() {
        return Math.sqrt((double) this.x * this.x + this.y * this.y);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = this.getValidCoordinate(x);
    }

    public void setY(int y) {
        this.y = this.getValidCoordinate(y);
    }

    private int getValidCoordinate(int n) {
        return n > 100 || n < -100 ? 0 : n;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
