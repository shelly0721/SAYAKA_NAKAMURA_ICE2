package midtermreviewcodeforpartc;

import java.util.Scanner;
/**
 *
 * @author nakamurasayaka
 */
public class PasswordValidator {
    private String password="";
    private boolean validPassword=false;

public String validate() {
    Scanner sc = new Scanner(System.in);
        while(!validPassword)
        {
            System.out.println("Passwords must have at least 8 characters");
            System.out.println("Passwords must have at least one special character");
            System.out.println("Please enter your desired password:"); 
            
            password = sc.nextLine();
            int specialCharCount=0;
            //iterate over each character to see if it is a special character
            for(int i=0;i<password.length(); i++)
            {
                if(!(Character.isLetterOrDigit(password.charAt(i))))
                {
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
            if(specialCharCount>0 &&password.length()>7)
            {
                validPassword=true;
            }
        }//loop only ends when password is valid so now we create the User
        return password;
        
}
}
