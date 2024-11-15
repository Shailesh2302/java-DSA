public class OOPS{

public static void main(String[] args) {
    Pesizep1 = new Pen();
    p1.setColour("red");
    System.out.println(p1.colour);
    p1.setTip(5);
    System.out.println(p1.tip);

    p1.colour = "yellow";
    System.out.println(p1.colour);
}

}
class Pen{
    String colour;
    int tip;

    void setColour(String newColour) {
        colour = newColour;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}