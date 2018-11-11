
public class Main {


    int a;

    public int solution(int[] A) {


        if (A.length == 4) {
            a = 1;

        }

        if (A.length == 3) {
            a = 0;

        }
        // write your code in Java SE 8

        return a;

        }


    public int solution1(int N) {
        int work = N;
        while (work > 0 && (work & 1) == 0) {
            work >>= 1;
        }
        work >>= 1;

        int max = 0;
        int zeros = 0;

        while (work > 0) {
            if ((work & 1) == 0) {
                zeros++;
            } else {
                max = Math.max(max, zeros);
                zeros = 0;
            }
            work >>= 1;
        }
        return max;
    }



    public static void main(String[] args) {



        int A[] = { 1, 2, 3, 5};
        int B[] = { 1, 2, 3, };
        Main m = new Main();
     //  int result1 =  m.solution(A) ;

        int result1 =  m.solution1(1041) ;
     //   int result2 =  m.solution(A) ;
    //   System.out.println(result1);
        System.out.println(result1);

    }





}








