import java.util.Scanner;

public class taxpay {
  public static void main(String[] args) {
  System.out.println("hello taxpayer,please enter your income in lacs");
  Scanner sc= new Scanner(System.in);
  Float income;
  income =sc.nextFloat();
  float tax=0;

  if (income<2.5f){
    System.out.println("you dont need to pay tax");
    tax = tax + 0;

  }
  else if (income>2.5f && income <=5f){
    System.out.println("need to give 5% tax which is: ");
    tax= tax + 0.05f * (income - 2.5f);
  }
  else if (income>5f && income <=10f){
    System.out.println("need to pay 20% tax which is: ");
    tax = tax + 0.05f *(5f-2.5f);
    tax = tax + 0.2f * (income -5f);
  }

  else {
    System.out.println("ohh rich man,contribute 30% tax for our nation");
    tax = tax+0.05f*(5f-2.5f);
    tax = tax+0.2f*(10f-5f);
    tax = tax +0.3f*(income -10f);

  }
  System.out.println(+tax);


}
}

   

   

