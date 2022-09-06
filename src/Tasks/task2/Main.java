package Tasks.task2;

public class Main {
    public static void main(String[] args) {

        Figure circle = new Circle("Tree",1,1,1);
        Figure rectangle = new Rectangle("Car",1,1,1,1);

        Annotation firstAnnotation = new Annotation("C",circle);
        Annotation secondAnnotation = new Annotation("R",rectangle);
        Annotation[] annotations = new Annotation[] {firstAnnotation,secondAnnotation};

        for(Annotation annotation : annotations){
            System.out.println(annotation.toString());
        }
    }
}
