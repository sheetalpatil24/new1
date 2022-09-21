import java.util.Scanner;
public class result {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int phy;
        System.out.println("enter physics marks");
        phy = sc.nextInt();

        int chem;
        System.out.println("enter chemistry marks");
        chem = sc.nextInt();

        int math;
        System.out.println("enter maths marks");
        math = sc.nextInt();

        float percentage = (math+chem+phy)/3.0f;

        if (phy>=33 && chem >=33 && math >=33 && percentage>=40f ){
            System.out.println("wohh congo you pass");
        }
        else {
            System.out.println("oops!! better luck next time");
        }
        System.out.println(percentage)  ;
    }
    
}
