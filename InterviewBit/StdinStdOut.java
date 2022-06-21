/*Problem Description

Java input and output is an essential concept while working on java programming. It consists of elements such as input, output and stream. The input is the data that we give to the program. The output is the data what we receive from the program in the form of result. Stream represents flow of data or the sequence of data. To give input we use the input stream and to give output we use the output stream.

One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in. For example:

 Scanner scanner = new Scanner(System.in);
 String userString = scanner.next();
 int userInt = scanner.nextInt();
 scanner.close();
 System.out.println("myString is: " + userString);
 System.out.println("myInt is: " + userInt);
Similarly, we can use nextLong(), nextFloat(), nextDouble() methods to get long, float, double input respectively from the user.

Similarly nextLine() method advances this scanner past the current line and returns the input that was skipped. This method returns the rest of the current line, excluding any line separator at the end. The position is set to the beginning of the next line.

The code above creates a Scanner object named and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String). So, if our input is:

Rishabh 5

Our code will print:

 myString is: Rishabh
 myInt is: 5
Alternatively you can use the BufferedReader Class or Console Class.

Problem:

In this question you need to read two space separated integers and print each of them on a separate line.


Problem Constraints

Input always consist of integer.

Input Format

There is single line of input containing two space-separated integers.

Output Format

Print each of the integers taken as an input on separate lines.

Example Input

Input:

 10 11

Example Output

Output:

 10
 11 */
import java.util.*;
public class StdinStdOut {
           public static void main(String[] args) {
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output
            Scanner scanner = new Scanner(System.in);
            int usrInt1 = scanner.nextInt();
            int usrInt2 = scanner.nextInt();
            scanner.close();
            System.out.println(usrInt1);
            System.out.println(usrInt2);
            
        }
}
