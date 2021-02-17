import java.util.Scanner;
class jagged 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no.rows");
        int m=obj.nextInt();
        int num[][]=new int[m][];
        for(int i=0;i<m;i++)
        {
            System.out.println("Enter the no.of elements in row "+(i+1));
            int n=obj.nextInt();
            num[i]=new int[n];
        }
        System.out.println("Enter the values");
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                num[i][j]=obj.nextInt();
            }
        }
        System.out.println("You entered ");
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(num.length);
        System.out.println(num[0].length);
    }
}   