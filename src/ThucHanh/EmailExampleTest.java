package ThucHanh;

public class EmailExampleTest {
    private static EmailExample emailExample ;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isvaid = emailExample.validate(email);
            System.out.println("Email is " + email + "is valid :"+ isvaid);

        }
        for (String email :invalidEmail) {
            boolean isvaid = emailExample.validate(email);
            System.out.println("Email is " + email + "is valid : "+ isvaid);

        }
    }
}


