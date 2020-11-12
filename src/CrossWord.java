import java.util.Scanner;

/* This drove me insane but it is somewhat working */
public class CrossWord
{
    public static void main(String[] args)
    {
        /* The main method takes in two words from the user, it then calls the method */
        Scanner myObj = new Scanner (System.in);

        //input first word
        System.out.println("Input First Word:");
        String firstWord = myObj.nextLine();
        //input second word
        System.out.println("Enter Second Word: ");
        String secondWord = myObj.nextLine();


        /* calling method */
        converter(firstWord, secondWord);

    }


    private static void converter(String f, String s)
    {
        /* This is where things get weird.
        The start of this method takes the strings and converts them into characters in my array */

        //creating the array
        char[][] cross = new char[2][10];

        //convert first word to chars
        for (int i = 0; i < f.length();i++)
        {
            cross[0][i] = f.charAt(i);
        }
        
        //convert second word to chars
        for (int j = 0; j < s.length();j++)
        {
            cross[1][j] = s.charAt(j);
        }
            /* This part of the code then launches the array through a mess of for loops that hurt my brain
            but get the job done */

            //find match
            for(int i = 0; i < cross[1].length; i++)
            {
            for(int o = 0; o < cross[1].length;o++)
                {
            if (cross[0][i] == cross[1][o])
                {
            //stepper
            for(int l = 0; l < s.length();l++)
                {

            //blank stepper
            for (int q = 0; q < o; q++)
                {
            if(l != o && q < i)
                    System.out.print("*");
            else
            break;
                }

            //print across letter
            if (l == o)
                {
            for(int n = 0; n < cross[1].length;n++)
                    System.out.print(cross[0][n]);

                }
            //print downward letter
            else
                    System.out.print(cross[1][l]);

            //print remaining blanks
            for(int q = 0; q < (s.length() -i);q++)
                {
            if(l == o)
                {
                    continue;
                }
                    System.out.print("*");
                }

            //Skip a line
                    System.out.println();
            if (l == s.length() -1)
                {
                    return;
                }

            }


                }

                }

            }



    }

}

