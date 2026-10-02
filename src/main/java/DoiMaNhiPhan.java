import java.util.Stack;

public class DoiMaNhiPhan {
    public static void main(String[] args) {
        int n = 35;
        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            int sodu = n % 2;
            stack.push(sodu);
            n = n / 2;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
