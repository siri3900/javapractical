package oops_p;
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip printing when i = 3
            }
            System.out.println("i = " + i);
        }
    }
}