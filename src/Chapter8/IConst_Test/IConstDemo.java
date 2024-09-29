package Chapter8.IConst_Test;

public class IConstDemo implements IConst {
    public static void main(String[] args) {
        int[] num = new int[MAX];
        for (int i = MIN; i < 11; i++) {
            if (i == MAX) {
                System.out.println(ERROR_MSG);
            } else {
                num[i] = i;
                System.out.print(num[i] + " ");
            }
        }
    }
}
