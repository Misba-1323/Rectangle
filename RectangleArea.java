public class ReactangleArea {
    double length;
    double breadth;

    public ReactangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void displayArea(){
        System.out.println("Area of reactangle = " + (length*breadth));
    }

    public static void main(String[] args) {
        ReactangleArea ra = new ReactangleArea(10, 20);
        ra.displayArea();
    }
}
