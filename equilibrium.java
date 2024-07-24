public class equilibrium {
    public static void main(String args[])
    {
        int arr[]={1,2,3,5,2,3,0,2};
        int lsum=0,sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        for(int j=0;j<arr.length;j++)
        {
            sum=sum-arr[j];
            if(lsum==sum){
                System.out.println(j);
                break;
            }
            lsum=lsum+arr[j];
        }
        if(lsum!=sum){
            System.out.println("not found");
        }
    }
}