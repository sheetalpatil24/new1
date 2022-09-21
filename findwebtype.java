import java.util.Scanner;

public class findwebtype {
    public static void main(String[] args) {
        System.out.println("enter your URL");
        Scanner sc = new Scanner (System.in);
        String site = sc.next();

        if (site.endsWith(".org")) {
            System.out.println("organizational website it is");
        }

        else if (site.endsWith (".com")) {
            System.out.println("commercial website it is");
        }

        else if (site.endsWith(".ind")){
            System.out.println("indian website it is");
        }
        else {
            System.out.println("no such website");
        }

    }
}

    

        

          
            
           
                
        