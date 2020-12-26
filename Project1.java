//Project 1
//Anooshka Pendyal
//This program encodes and decodes messages.
//First, it prompts the user whether a message is to be encoded or decoded and then prompts the user to enter the message.
//Finally, it converts the message and displays the encoded/decoded verison.


import java.util.Scanner;
public class Project1
{
    public static void main(String [] args)
    {
        System.out.println(); //whitespace
        System.out.println();

        Scanner input = new Scanner ( System.in ); //creates scanner object

        System.out.println("Would you like to encode or decode a message? "); //prompt for if user wants to encode or decode a message
        System.out.print("1 = encode, 2 = decode: ");
        int userDecision = input.nextInt(); //user input for encoding or decoding
        input.nextLine();

        System.out.print("Enter your message: ");  //user prompt
        String userMessage = input.nextLine(); //user enters message
        userMessage = userMessage.toUpperCase();
 
        if (userDecision == 1) //if user selects 1 (to encode)
        {
            encode(userMessage); //invokes encoding method
        }
        else if (userDecision == 2) //if user selects 2 (to decode)
        {
            decode(userMessage); //invokes decoding method
        }
        else //tells user to select either one or two
        {
            System.out.println("Please enter either one or two.");
        }    

        System.out.println(); //whitespace
        System.out.println(); 
    }

    public static void encode (String userMessage)
    {
        char alphabet [][] = { {'A', 'Z'}, {'B','Y'}, {'C','X'}, {'D','W'}, {'E','V'}, {'F','U'}, {'G','T'}, {'H','S'}, {'I','R'}, {'J','Q'}, {'K','P'}, {'L','O'}, {'M','N'}, {'N','M'}, {'O','L'}, {'P','K'}, {'Q','J'}, {'R','I'}, {'S','H'}, {'T','G'}, {'U','F'}, {'V','E'}, {'W','D'}, {'X','C'},{'Y','B'}, {'Z','A'} };
        System.out.print("Encoded message: ");
        String encodedMessage = new String(); //creates string to store output
        int messageLength = userMessage.length(); //varible stores length of message because message is converted to an array
        char messageArray [] = userMessage.toCharArray(); //converts message to an array to loop through each letter


        for (int i = 0; i < messageLength; i++) //loops through each letter
        {

            if (messageArray[i] == ' ') //if there is a space in the message, nothing will change
            {
                encodedMessage = encodedMessage + " ";
            }
            else if (messageArray[i] == '.') //if there is a period in the message, nothing will change
            {
                encodedMessage = encodedMessage + ".";
            }
            else
            {
                int j = 0;
                while (j < 26) //loops through each letter in the alphabet array and compares for equality
                {
                    if (messageArray[i] == (alphabet[j][0])) //finds the letter it's equal to
                    {
                        encodedMessage = encodedMessage + alphabet[j][1]; //finds the opposite letter
                    }
                    j++;
                }
            }
        } 
        System.out.println(encodedMessage);
    }

    public static void decode (String userMessage)
    {
        char alphabet [][] = { {'A', 'Z'}, {'B','Y'}, {'C','X'}, {'D','W'}, {'E','V'}, {'F','U'}, {'G','T'}, {'H','S'}, {'I','R'}, {'J','Q'}, {'K','P'}, {'L','O'}, {'M','N'}, {'N','M'}, {'O','L'}, {'P','K'}, {'Q','J'}, {'R','I'}, {'S','H'}, {'T','G'}, {'U','F'}, {'V','E'}, {'W','D'}, {'X','C'},{'Y','B'}, {'Z','A'} };
        System.out.print("Decoded message: ");
        String decodedMessage = new String(); //creates string to store output
        int messageLength = userMessage.length(); //varible stores length of message because message is converted to an array
        char messageArray [] = userMessage.toCharArray(); //converts message to an array to loop through each letter


        for (int i = 0; i < messageLength; i++) //loops through each letter
        {
            if (messageArray[i] == ' ')
            {
                decodedMessage = decodedMessage + " "; //if there is a space in the message, nothing will change
            }
            else if (messageArray[i] == '.')
            {
                decodedMessage = decodedMessage + "."; //if there is a period in the message, nothing will change
            }
            else
            {
                int j = 25;
                while (j > -1) //loops through each letter in the alphabet array and compares for equality
                {
                    if (messageArray[i] == (alphabet[j][0])) //finds the letter it's equal to
                    {
                        decodedMessage = decodedMessage + alphabet[j][1]; //finds the opposite letter
                    }
                    j--;
                }
            }
        } 
        System.out.println(decodedMessage);
    }
}

