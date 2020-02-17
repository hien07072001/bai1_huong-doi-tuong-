import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("nhap a:");
        double a=scanner.nextDouble();

        System.out.println("nhap b:");
        double b=scanner.nextDouble();

        System.out.println("nhap c:");
        double c= scanner.nextDouble();

        QuadraticEquation pt=new QuadraticEquation(a,b,c);

        if (pt.getDiscriminant()==0){
            System.out.println("pt 1 n:"+(-b/(2*a)));
        }else
        if (pt.getDiscriminant()<0){
            System.out.println("pt vn");

        }else
            if(pt.getDiscriminant()>0) {
                System.out.println(pt.getRoot1() + pt.getRoot2());
            }
    }
}
