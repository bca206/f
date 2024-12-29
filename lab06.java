public class lab06 {
    public static void main(String[] args) {
        overload o1=new overload();
        System.out.println(o1.sum(10,20,30));
        System.out.println(o1.sum(10,20));
        System.out.println(o1.sum(10.5,20.5));
    }
}
class overload{
    public int sum(int a,int b,int c){
        return(a+b+c);
    }
    public int sum(int a,int b){
        return(a+b);
    }
    public double sum(double a,double b){
        return(a+b);
    }
}
