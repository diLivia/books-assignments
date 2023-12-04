public class CallStack {

    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    private static int fatorial(int x){
        if (x <= 1) return x;
        return x * fatorial(x - 1);
    }
}
