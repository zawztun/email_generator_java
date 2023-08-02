import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private  String email;
    private String department;
    private String password;
    private  int defaultPasswordLength = 10;
    private int mailboxCapacity = 500;
    private String alternativeEmail;

    private  String companySuffix = "abcCompany.com";


    //constructor to receive the first and last name;
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Create Email : " + this.firstName + this.lastName);

        //Call the method asking for department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //Call generate a random password;
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is :" + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your Email address is : " + email);
    }

    // ask department ;
private String setDepartment(){
    System.out.println("Department CODES:  \n1 for Sale \n2 for Development \n3 for Accounting\n0 for none\nEnter Department code:" );
    Scanner input = new Scanner(System.in);
    int depChoice = input.nextInt();
    if(depChoice == 1){
       return "Sale";
    }else if(depChoice == 2){
        return "Development";
    }else if (depChoice == 3){
        return "Accounting";
    }else{
        return null;
    }
};

    //generate a random password;

    private  String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLNMOPQRSTUVWXYZ0123456789";
        char[] password = new char[length];
    for (int i = 0; i < length; i++){
        int rand =  (int)(Math.random() * passwordSet.length());
        password[i] = passwordSet.charAt(rand);
    }
        return new String(password);
    }

    // set the mailbox capacity;

    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }
    //set the alternative Email;
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    //change the password;
    public void setPassword(){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return  "\n Display Name :" + firstName + " " + lastName + " " +
                "\n Company Email : " + email +
                " \n Mailbox Capacity : " + mailboxCapacity;

    }
};
