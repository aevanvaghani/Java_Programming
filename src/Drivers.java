import java.util.Scanner;

public class Drivers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter 1: Circle & enter 2: Rectangle");
        int n = s.nextInt();

        Shapes ob;
        if (n==1){
            ob = new Circle();
            ob.draw();
        } else if (n==2) {
            ob = new Rectangle();
            ob.draw();
        } else {
            System.out.println("wrong input");
        }
    }
}
