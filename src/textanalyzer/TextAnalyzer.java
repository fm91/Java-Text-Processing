/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textanalyzer;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author fouad
 */
public class TextAnalyzer {

    /**
     * @param args the command line arguments
     */
  

public static void main(String[] args) throws IOException {
String fileName, line, longestWord=""; 
int length=0, space=0, lengthCount=0, longestWordLength=0;
Scanner input = new Scanner(System.in);
System.out.println("What file do you want to get information about?");
fileName = input.nextLine();
File file = new File(fileName);
if(!file.exists())
{
System.out.println("The file that you want to read doesn't exist");
System.exit(0);
} 
Scanner inputFile = new Scanner(file);
while(inputFile.hasNext()){
lengthCount=0;
line = inputFile.nextLine();
length += line.length();
if(line.charAt(0)!=' ')
space+=1;
for(int i=0; i<line.length(); i++){
if(i!=line.length()-1) 
{if(line.charAt(i)==' ' && line.charAt(i+1)!=' ')
space+=1;}
}
for (int l=0; l<line.length(); l++){
if(line.charAt(l)!=' ' && l<line.length()-1)
lengthCount+=1;
else
{ if(l==line.length()-1 && line.charAt(l)!=' ')
lengthCount+=1;
if(lengthCount>longestWordLength){
longestWord="";
for (int j=l-lengthCount; j<=l; j++)
longestWord += Character.toString(line.charAt(j));
longestWordLength=lengthCount;}
lengthCount=0;}
}
}  // TODO code application logic here
    }
    
}
