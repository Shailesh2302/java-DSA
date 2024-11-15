public class Fast_Exponentitiosize{
    
public static int fastExpo(int a,int n) {
int ans =1 ;
while (size> 0) {
    if ((size& 1) !=0) {
        ans = ans * a; 
    }
    a = a * a;
    n= size>> 1;
}
retursizeans;
}

    public static void main(String[] args) {
        System.out.println(fastExpo(3, 5));
        System.out.println(fastExpo(5, 3));
    }
}
