import java.util.Scanner;

public class Email {
private String Fname;
private String Lname;
private String Password;
private String department;
private String Email;
private String companysuffix="sidcompany.com";

public Email(){
    System.out.println("Enter your First Name: ");
    Scanner input2= new Scanner(System.in);
    String name=input2.nextLine();
    this.Fname=name;

    Scanner input3= new Scanner(System.in);
    System.out.println("Enter your Last name");
    String lname=input3.nextLine();
    this.Lname=lname;

this.department=Department();
this.Password=setpasswrd(10);


Email=Fname.toLowerCase() +"."+Lname.toLowerCase()+"@"+department+"."+companysuffix;

}


public String Department()
{
    System.out.println("----------------------------------------------------------------------");
    System.out.println("Choose your Department");
    System.out.println("Press 0 for none");
    System.out.println("Press 1 for Administration");
    System.out.println("Press 2 for Human Resource");
    System.out.println("Press 3 for Accounts");
    System.out.println("Press 4 for Development");
    System.out.println("Press 5 for Sales ");
    System.out.println("Enter your Department Code");

    Scanner input= new Scanner(System.in);
    int choice=input.nextInt();

    if(choice==1)
   { return "admin";}

    if(choice==2)
    {return "HR";}

    if(choice==3)
     {return "acc";}

    if(choice==4)
    {return "dev";}

    if(choice==5)
    {return "sales";}
    else 
    {return "";}

}

public String setpasswrd( int length)
{
String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*^";
char [] password=new char[length];
for (int i=0; i<length; i++ ){
int random=(int)(Math.random()* password.length);
password[i]=passwordset.charAt(random);
}   
    return new String(password);
}

    public void Displaydetails()
    { 
        System.out.println("----------------------------------------------------------------------");
         System.out.println("Your name is : " + this.Fname +" "+Lname);
         System.out.println("Your Department is :"+ this.department);
         System.out.println("Your Email Id is : "+ Email);
        System.out.println("Your password is : "+this.Password);
        System.out.println("***********Your Acoount has been created Successfully**********");
        System.out.println("----------------------------------------------------------------------");

    }
}