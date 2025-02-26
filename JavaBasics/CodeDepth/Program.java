package JavaBasics.CodeDepth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The Code Depth of a Java source code file is defined as the highest 
 * number of nested curly braces in that file.
 * For instance, a source code file looking like below:
 * 
 *   public class SomeClass {
 *      public void main(..) {
 *         if (cond) {
 *         } else {
 *             while(cond) {
 *             }
 *         }
 *      }
 *   }
 * 
 * has a code depth of 4.
 * Write a program that determines the Code Depth of a given
 * Java source file. You can assume the braces '{' and '}' do not
 * occur in string literals or in comments.
 */
public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.printf("Current folder: %s\n", (new File(".")).getAbsolutePath());
        System.out.printf("Code file? > ");
        String codeFilename = console.nextLine();
        File codeFile = new File(codeFilename);
        
        // TODO: calculate the Code Depth of the java source codeFile
        
        System.out.println("Goodbye!");
        console.close();
    }
}
