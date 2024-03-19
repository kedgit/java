import java.util.Scanner;
public class arrayException {
    void checkindex(int index)
    {
        int [] array={1,4,5,2,7};
        int value=array[index];
        System.out.println("the value at index "+index+" is "+value);
    }
    public static void main(String [] args)
    {
        arrayException  d = new arrayException();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index to access value: ");
        int a=sc.nextInt();
        
        try{
            System.out.println("msdhoni");
            d.checkindex(a);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("enter the valid index-----");
        }
    }
    
}
