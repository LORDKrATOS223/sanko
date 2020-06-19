public class Exr {
    public static void main(String args[]) {
        int array[] = {1,2,3,4,5};
        System.out.println("A quotient form division: " + remainder(5,10));
        System.out.println("Area of a triangle: " + triArea(5,10));
        System.out.println("Amount o hooves: " + animals(5,10, 20));
        System.out.println("Is profitable: " + profitableGamble(0.5,10,3));
        System.out.println("Numbers need to be: " + operation(10,5,2));
        System.out.println("ascii code is: " + ctoa('B'));
        System.out.println("Sum of numbers up to a chosen one: " + addUpTo(10));
        System.out.println("Max length of a 3rd edge: " + nextEdge(5, 10));
        System.out.println("Sum of cubes of array members: " + sumOfCubes(array));
        System.out.println("Does b times a is dividable by c: " + abcmath(1,2,4));


    }
    public static int remainder(int a, int b) {
        return (a%b);
    }
    public static double triArea(double a, double b) {
        return(0.5*a*b);
    }
    public static int animals(int a, int b, int c) {
        return(a*2+b*4+c*4);
    }
    public static boolean profitableGamble(double prob, double prize, double pay) {
        if (prob*prize>pay) return true;
        else return false;
    }
    public static String operation(int N, int a, int b) {
        if (a+b==N) return "added";
        else if (a-b==N) return "subtracted";
        else if (a*b==N) return "multiplied";
        else if (a/b==N) return "divided";
        else return "none";
    }
    public static int ctoa(char a) {
        int ascii = (int) a;
        return ascii;
    }
    public static int addUpTo(int a) {
        int i=1, sum=0;
        while (i<=a) {
            sum+=i;
            i++;
        }
        return(sum);
    }
    public static int nextEdge(int a, int b) {
    return (a+b-1);
    }
    public static int sumOfCubes(int[] arr) {
        int sum = 0;
    for (int i : arr) {
        sum+=i*i*i;
    }
    return sum;
    }
    public static boolean abcmath(int a, int b, int c) {
        for (int i=0; i<=b;i++) {
            a+=a;
        }
        if (a%c==0) return true;
        else return false;
    }
}
