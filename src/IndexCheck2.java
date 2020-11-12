public class IndexCheck2
{
    public static void main(String[] args)
    {
        char [][] chars = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
        checkIndex(chars, 'i');
    }

    private static void checkIndex(char[][] array, char c)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if (array[i][j] == c)
                {
                    System.out.print(i);
                    System.out.println("-"+j);
                    return;
                }
            }
        }
        return;
    }
}