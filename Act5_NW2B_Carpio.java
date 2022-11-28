import java.util.Scanner;
import java.util.LinkedList;

public class Main
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        LinkedList fname = new LinkedList();
        LinkedList mname = new LinkedList();
        LinkedList lname = new LinkedList();
        LinkedList acode = new LinkedList();
        LinkedList tn = new LinkedList();
        LinkedList g = new LinkedList();
        LinkedList a = new LinkedList();
        
        
        System.out.print("How many members information will be entered? ");
        int mem = sc.nextInt();
        sc.nextLine();
        
        for(int z = 0; z<mem; z++)
        
        {
            
            int x = z+1;
            
        System.out.println("Kindly give the information of member " + x);
       
       
        System.out.print("Enter first name: ");
        String fn = sc.nextLine();
        fname.add(fn);
        
        System.out.print("Enter middle name: ");
        String mn = sc.nextLine();
        mname.add(mn);
        
        System.out.print("Enter last name: ");
        String ln = sc.nextLine();
        lname.add(ln);
        
        System.out.print("Enter area code: ");
        int ac = sc.nextInt();
        sc.nextLine();
        acode.add(ac);
        
        
        
        System.out.print("Enter telephone number: ");
        String tnum = sc.nextLine();
        tn.add(tnum);
        
        
        System.out.print("Enter gender: ");
        String gn = sc.nextLine();
        g.add(gn);
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        a.add(age);
        sc.nextLine();
        
        System.out.println();   
    
        }
        
        
        for(int z = 0; z<mem; z++){
              System.out.println("Welcome to the Club " + fname.get(z) + " " + mname.get(z) + " " + lname.get(z) );
              System.out.println("Your area code and telephone number is " + "(" + acode.get(z) + ")" + tn.get(z) );
              System.out.println("Your a " + g.get(z) + " member and your age " + a.get(z) );
        }
         
         
       
        
       
        
  
    }
}
