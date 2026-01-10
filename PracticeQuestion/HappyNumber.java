class HappyNumber {
    public static void main(String[] args) {

        for (int i = 1; i <= 500; i++) {
            int num = i;
            int count = 0;

            while (count < 20) {   
                int sum = 0;

                while (num > 0) {
                    int digit = num % 10;
                    sum = sum + digit * digit;
                    num = num / 10;
                }

                if (sum == 1) {
                    System.out.println(i + " is a Happy Number");
                    break;
                }

                num = sum;
                count++;
            }
        }
    }
}
