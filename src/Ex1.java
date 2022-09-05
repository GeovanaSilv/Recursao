

public class Ex1 {
    public static void main(String[] args) {


        System.out.println("FALSE " + saoDiferentes(15, 15));
        System.out.println("TRUE " + saoDiferentes(4, 8));
        System.out.println(ehNegativo(3));


        System.out.println("\n 20 ,-10 " + menor(10, -10));
        System.out.println("-10,10 " + menor(-10, 10));

        System.out.println("\n10 < 20 " + menorPositivo(10, 20));
        System.out.println("20 < 10  " + menorPositivo(20, 10));

        System.out.println("\n-10  <  -20 " + menorNegativo(-10, -20));
        System.out.println("-20  <  -10 " + menorNegativo(-20, -10));

        System.out.println("10 <= 10 " + menorOuIgual(10, 10));
        System.out.println("20 <= 10 " + menorOuIgual(20, 10));

        System.out.println("\n 10 > 5 " + maior(10, 5));
        System.out.println(" 20  > 30 " + maior(20, 30));


        System.out.println("Somar " + soma(-55, -5));
        System.out.println("Subtração "+subtracao(-5,2));

    }

    public static boolean saoDiferentes(int A, int B) {
        if (A == B) return false;
        return true;
    }

    public static boolean ehNegativo(int N) {
        if (N == 0) return false;
        return neg(N, N);
    }

    private static boolean neg(int A, int B) {
        if (A == 0) return true;
        if (B == 0) return false;
        return neg(++A, --B);

    }


    public static boolean menor(int a, int b) {
        if (ehNegativo(a)) {
            if (ehNegativo(b)) {
                return menorNegativo(++a, ++b);
            }
            return true;
        }
        if (ehNegativo(b)) {
            return false;
        }
        return menorPositivo(--a, --b);
    }


    private static boolean menorPositivo(int a, int b) {
        if (b == 0) return false;
        if (a == 0) return true;
        return menorPositivo(--a, --b);
    }

    private static boolean menorNegativo(int a, int b) {
        if (a == 0) return false;
        if (b == 0) return true;
        return menorNegativo(++a, ++b);
    }

    public static boolean menorOuIgual(int A, int B) {
        if (A == B) return true;

        return menor(A, B);
    }

    public static boolean maior(int A, int B) {
        if (ehNegativo(A))
            if (ehNegativo(B))
                return maiorNegativo(A, B);
        if (menor(A, B)) return false;
        return true;
    }

    private static boolean maiorNegativo(int a, int b) {
        if (a == 0) return true;
        if (b == 0) return false;
        return maiorNegativo(++a, ++b);
    }

    public static boolean MaiorOuIgual(int A, int B) {
        if (A == B) return true;

        return maior(A, B);
    }

    public static int soma(int a, int b) {

        if (a == 0) return b;
        if (b == 0) return a;

        return somaPositvo(a,b);

    }


    public static int somaPositvo(int a, int b) {

        if (b == 0) return a;
       if(ehNegativo(b))
           return somaPositvo(--a,++b);

       return somaPositvo(++a,--b);
    }

 
    public static int subNum(int a , int b){
        if(b==0)return a;

        if(ehNegativo(b))
            return  subNum(++a,++b);

        return   subNum(--a,--b);
    }

    public static int subtracao (int a , int b){
        if( b==0)return a;

       return subNum(a,b);
    }
    
      public static int multiplica(int a , int b){
      if(b==0)return b;
     return soma(a,multiplica(a,--b));
  }
  



}
