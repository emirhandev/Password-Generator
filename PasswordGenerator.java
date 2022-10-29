import java.io.*;  
import java.util.Random;
import java.util.Scanner;
// **||** Made by Emirhan **||**
    public class PasswordGenerator {
    public static void main(String[] args) throws IOException {
        System.out.println("What do you want to create a password for ?");
        Scanner scanName =new Scanner(System.in);
        String name =scanName.next();
        
        System.out.println("Enter the length of the password..");
        Scanner scanLength =new Scanner(System.in);
        int passLength =scanLength.nextInt();

        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";      
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";
       String allChar = Capital_chars + Small_chars + numbers + symbols;    // convert all characters to a string
        char[] password = new char[passLength];                             // create an array of length

         for (int i = 0; i < passLength; i++){
            Random rand= new Random(); 
            password[i] =  allChar.charAt(rand.nextInt(allChar.length()));  
        }
        
        File file = new File("C://Users//asus//Documents//NetBeansProjects//PasswordGenerator/src//password.txt");   // File Path 
        if (!file.exists()) {
            file.createNewFile();
        }
        
        FileWriter fileWriter = new FileWriter(file, true);     // Overwrite
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
       bWriter.newLine();
        bWriter.write(name);
        bWriter.write(": ");
        bWriter.write(password);  
        bWriter.close();
        
    
    }
}
    

