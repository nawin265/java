import java.util.Scanner;
    class Exam4
  {
 public static void main(String args[])
   {
     Scanner s=new Scanner(System.in);
        int v1=s.nextInt();
        int  v2=s.nextInt();
        int v3=s.nextInt();
 System.out.println((v1>v2 && v1>v3)?v1+"v1 is grater":(v2>v3)?v2+" v2 is grater":v3+"v3 is grater ");
}
}
