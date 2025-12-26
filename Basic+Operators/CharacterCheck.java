public class CharacterCheck 
{
    public static void main(String[] args) 
    {
        char ch = 'a';

        String result =
            (ch >= 'A' && ch <= 'Z') ?
        ((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') ?
            "Uppercase Vowel" : "Uppercase Consonant") :
		(ch >= 'a' && ch <= 'z') ?
			((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ?
            "Lowercase Vowel" : "Lowercase Consonant") :
		(ch >= '0' && ch <= '9') ?
        "Number" :
        "Special Character";

        System.out.println(result);
    }
}
