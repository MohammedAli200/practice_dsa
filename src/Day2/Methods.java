package Day2;


public class Methods {
    static void printMessage(){
        System.out.println("hello this is new message");
    }
    static void add(int a , int b){
        System.out.println(a+b);
    }
    static boolean isEven(int a){
        if(a%2==0)
            return true;
        else
            return false;
    }
    static int max(int a, int b){
       int max= a>b?a:b;
       return max;
    }
    static void display(int a){
        System.out.println(a);
    }
    static void display(String hello){
        System.out.println(hello);
    }
    static int updateValue(int x){
        return x*7;
    }
    public static void main(String[] args) {
        printMessage();
        add(4,5);
        int k=90;
        System.out.println(isEven(7));
        System.out.println(max(6,8));
        display(89);
        display("hello");
        System.out.println(updateValue(k));
        System.out.println(k);
    }
}
