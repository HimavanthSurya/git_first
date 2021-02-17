class example
{
    int a,b,total;
    public String add;
    void add()
    {
       total = a + b;
    }
}
class Program
{
    public static void main(String args[])
    {
        example obj=new example();
        example obj1=new example();
        obj.a=10;
        obj.b=20;
        obj.add();
        obj1.a=15;
        obj1.b=25;
        obj1.add();
        System.out.println("addition = "+obj.total);
        System.out.println("addition = "+obj1.total);
    }
    
    
}