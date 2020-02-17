public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    double delta;
    double r1;
    double r2;

    public double  getDiscriminant(){
         delta=(b*b) - (4*a*c);
         return delta;
    }
    public  double getRoot1(){
        r1=(-b+Math.sqrt(delta) /(2*a));
        return r1;
    }
    public  double getRoot2(){
        r2=(-b-Math.sqrt(delta) /(2*a));
        return r2;


    }



}
