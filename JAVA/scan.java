import java.util.Scanner;
class Scan 
{
    public static void main(String args[])
    {
        int a;
        float b;
        String str;
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the string");
        str=obj.nextLine();
        System.out.println("String = "+str);
        System.out.println("Enter the Integer");
        a=obj.nextInt();
        System.out.println("Integer = "+a);
        System.out.println("Enter the Float");
        b=obj.nextFloat();
        System.out.println("Float = "+b);


    }
}
