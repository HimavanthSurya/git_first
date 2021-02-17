import java.util.Scanner;
class array2 
{
    public static void main(String args[])
    {
        int num[][]=new int[3][2];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the values ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                num[i][j]=obj.nextInt();
            }
        }
        System.out.println("You entered ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(num.length);
        System.out.println(num[0].length);
        


    }
    
}
