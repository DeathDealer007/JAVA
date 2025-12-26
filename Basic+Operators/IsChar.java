class IsChar{
    public static void main(String[] args) {
        char ch = 'A';
        if (Character.isLetter(ch)) {
            System.out.println(ch + " is a letter.");
        } else {
            System.out.println(ch + " is not a letter.");
        }
    }
    
    
}