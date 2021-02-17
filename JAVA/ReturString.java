class ReturnString
{
    public static void main(String arg[])
    {
        Text obj=new Text();
        System.out.println("First name: "+obj.fname());
        String lastname=obj.lname("Surya");
        System.out.println("Last name: "+lastname );
    }

    
}
class Text
{
    String fname()
    {
        String s="Himavanth";
        return s;
    }
    String lname(String st)
    {
        String str=st;
        return str;

    }

}