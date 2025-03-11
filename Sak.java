class Sak {
    public static int count(int n){
        int sum=0;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        
        return count(n-1)+count(n-2);
    }
    public static void main(String[] args) {
        System.out.println(count(10));
    }
}