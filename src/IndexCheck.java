

public class IndexCheck
{


    public static void main (String []args)
    {
        char [] chars ={'a', 'b', 'c', 'd', 'e', 'f'};
        System.out.println(stringChecker(chars, 'c'));
    }

    public static int stringChecker(char[] array, char c)
    {
        for (int i = 0; i < array.length;i++)
        {
         if (array[i] == c)
         {
             return i;
         }
        }
        return -1;
    }
}
