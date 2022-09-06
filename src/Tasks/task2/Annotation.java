package Tasks.task2;

public class Annotation {

    private String data;
    private Figure figure;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public Annotation(String data, Figure figure) {
        this.data = data;
        this.figure = figure;
    }

    @Override
    public String toString(){
      return data + figure.toString();
    }
}
