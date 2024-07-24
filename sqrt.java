class sqrt{

    public static int kd(double []num,int s){
        int count=0;
        for(int i=0;i<s;i++){
            double res=(double)Math.sqrt(num[i]);
            if((double)Math.ceil(res)==(double)Math.floor(res)){
                count++;
            }
        }
    return count;
    }

public static void main(String[] args) {
    double[] num={5,8,16,35,46};
    int s=num.length;
    int res=kd(num,s);
    System.out.println(res);
}
}