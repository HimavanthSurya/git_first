class labledcont 
{
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==3||j==1)
                {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
    
}
