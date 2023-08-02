public class EmailApp {
    public static void main(String[] args) {
       Email em1 = new Email("Tony", "Jack");
        em1.setAlternativeEmail("hello@gmail.com");
        System.out.println(em1.showInfo());
    }
}