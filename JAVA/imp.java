public class imp
 {
     public static void main(String args[])
     {
         Son obj=new Son();
         obj.disp();
     }
    
}
interface Father
{
    public static final int mark=100;
    int roll=121;
    void disp();
}
class Son implements Father
{
    int mark1=200;
    int sum=mark+mark1;
    public void disp()
    {
        System.out.println("Roll= "+roll);
        System.out.println("Total mark= "+sum);

    }
}