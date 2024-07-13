
import java.util.Scanner;

public class TakingInputformuser {
  public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
System.out.print("enter the radius::");
double ra = sc.nextDouble();

System.out.println("the area of circle is ::" + 3.14*ra*ra);





//u have to close Scanner
sc.close();
  }
}
