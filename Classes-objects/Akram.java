

public class Akram{
  public static void main(String[] args) {
    bank sbi=new bank();
    sbi.amount=78690;
    sbi.name="akram";
     System.out.println(sbi.name);
    sbi.setpassword(7869);
    System.out.println(sbi.getpassword());
    bank hdfc=new bank();
    hdfc.name="sulthan";
    System.out.println(hdfc.name);
    sbi.name="mohammed";

    //calling the copy constructor
    bank axis=new bank(sbi);
   
    sbi.amount=1000;
    System.out.println(sbi.amount);
    //shallow constructor
    System.out.println(axis.name);
    System.out.println(axis.amount);

    //deep copy
    sbi.name="mohammed";
   
    System.out.println(axis.getpassword());

  }
}
 class bank{
    String name;
    int amount;
    private int password;

    //copy constructor 
    bank(bank sbi){
       System.out.println("you  are copying my each and everything in your data");
       this.name=sbi.name;
       this.amount=sbi.amount;
    }
  
    //non parametrized constructor
    bank(){
        System.out.println("welcome to the sbi bank");
    }

    //parametrized constructor
    bank(String username){
       this.name=username;
       
    }

    //setters for the password
    public void setpassword(int password){
     this.password=password;
    }

    //getter for the password
    public int getpassword(){
        return this.password;
    }

 }   
