public class RectanglePerimeter {
    double length;
    double breadth;

    public RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void displayPerimeter(){
        System.out.println("Perimeter of reactangle = " + 2 *( length + breadth));
    }

    public static void main(String[] args) {
        RectanglePerimeter rp = new RectanglePerimeter(10, 20);
        rp.displayPerimeter();
    }
}
