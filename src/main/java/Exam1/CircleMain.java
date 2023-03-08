package Exam1;

public class CircleMain {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(-3.0);
            System.out.println(c1);
            Circle c2 = new Circle(2.0);
            System.out.println(c2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
