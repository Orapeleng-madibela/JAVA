import java.util.Scanner;


public class Password{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Ask the user how many passwords they want so that they could choose and the length of the passwords
        System.out.println("How  many random password do you want? ");
        int total = in.nextInt();
        System.out.println("How  many characters do you want in your password? ");
        int length = in.nextInt();

        String[] randomPasswords = new String[total];//array to store rondom passwords

        //loop for total number of passwords
        for(int i = 0; i < total; i++){
            //generate one random password
            String randomPassword = "";
            for(int j = 0; j < length; j++){
                //generate one random character
                randomPassword += randomCharacter();
            }
            //add random password to the array
            randomPasswords[i] = randomPassword;
        }
        //print out array of passwords
        printPasswords(randomPasswords);
    }

    public static void printPasswords(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static char randomCharacter(){
        //generate random number represent all posible characters
        //10digits + 26 uppercase letters + 26 lowercase letters = 62 posible letters

        int rand = (int)(Math.random()*79);
        //break up rand into intervals to represent digit, uppercase and lowercase letters
        //if rand is between 0-9 it is number
        //if rand is between 10-35 it is uppercase
        //if rand is between 36 -61 it is lowercase
        if(rand <= 9){
            //number where rand is between 0-9
            int ascii = rand + 48;//rand += 48;  //48-0=48
            return (char)(ascii);
        }else if(rand <= 35){
            //uppercase letters  where rand is between 10-35
            int ascii = rand + 55;//65-10=55
            return (char)(ascii);
        }else{
            //lowercase letters where rand is between 36-61
            int ascii = rand + 61;//97-36=61
            return (char)(ascii);
        }
        
    }
}
