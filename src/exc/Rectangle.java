package exc;

public class Rectangle {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void setA(int a){
        this.a=a;
    }

    public int getArea() {
        return a * b;
    }

    public int getPerimeter(){
        return (2*a)+(2*b);
    }

}
