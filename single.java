public class single {
    public static int findsingle(int arr[]){
        int res=0;
        for(int num:arr){
            res^=num;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,3,1,5,4,5};
        int nodup=findsingle(arr);
        System.out.println(nodup);
    }
}
