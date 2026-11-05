public class Main {
    static int maxOf(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Larger: " + maxOf(14, 9));
    }
}