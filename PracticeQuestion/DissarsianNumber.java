class DissarsianNumber {
    public static void main(String[] args) {

        for (int i = 1; i <= 500; i++) {

            int num = i;
            int sum = 0;

            // Step 1: count digits
            int count = 0;
            int temp = num;
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }

            // Step 2: calculate sum
            temp = num;
            while (temp > 0) {
                int digit = temp % 10;

                int power = 1;
                for (int p = 1; p <= count; p++) {
                    power = power * digit;
                }

                sum = sum + power;
                count--;
                temp = temp / 10;
            }

            // Step 3: compare
            if (sum == i) {
                System.out.println(i + " is a Disarium Number");
            }
        }
    }
}
