public class ModuloOperator{
  public static void main(String[] args) {
    //Modulo operstor

    int a = 23;
    int b = 3;
    System.out.println(a%b);//return reminder

    //note::(a%-b) == (a%b)
    a = 10;
    b = -3;
    int c = 3;
    System.out.println(a%b);
    System.out.println(a%c);

    //note:a%b == a if(b>a)
    a = 10;
    b = 100;
    System.out.println(a%b);

    //note:(-a%b == -(a%b))
a = -10;
b = 3;

    System.out.println(a%b);
  }
  
}