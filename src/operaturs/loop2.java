package operaturs;

public class loop2 {

	public static void main(String[] args) {
		int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }

	}

}
}