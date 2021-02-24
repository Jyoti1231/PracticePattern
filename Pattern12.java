public class Pattern14 {

    public static void main(String[] args) {
        
        int n=5;

        for(int i=0;i<n;i++)
    {
        int x=1;
        for(int j=0;j<i;j++)
        {
            System.out.print("");;
        }
        
        for(int j=i;j<2*n-1-i;j++)
        {
            System.out.print(x++);
        }
            
        System.out.println();
    }

    }

}
