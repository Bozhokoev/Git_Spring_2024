package codingbat.string1;

public class HelloName {
    public static void main(String[] args) {

        HelloName akim = new HelloName();
        System.out.println(akim.helloName("Akim"));
    }


    public String helloName(String name) {
        String str = "Hello, ";
        char sym = '!';
        return str + name + sym;
        //return "Hello " + name + '!';
    }
}
