package Tasks.task2;

public class Circle implements Figure{
    private String name;
    private int x;
    private int y;
    private int r;


    public Circle(){
    }
    @Override
    public String toString() {
        return   " (" + this.x + ", " + this.y +  "), " +this.r + ": " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Circle(String name, int x, int y, int r) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.r = r;
    }
}
