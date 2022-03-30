package school;

public class Hello {
    String username;
    public void sayHi(){
        Greet user = new Greet();
        String username = user.greeting();

        Greet person = new Greet();
        user.message(person.greetUser(username));
    }
}
