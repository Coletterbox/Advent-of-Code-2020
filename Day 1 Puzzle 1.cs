using System;

namespace Day1
{
    class Program
    {
        static void Main(string[] args)
        {
            // okay, what are the C# naming conventions (specifically re: Pascal or camel case) again...?
            int[] input = { 1721, 979, 366, 299, 675, 1456 };

            MultiplyNumbers(ChooseNumbers(input));
        }

        public static int[] ChooseNumbers(int[] InputArray)
        {
            int[] ResultArray = { 0, 0 };

            for (int i = 0; i < InputArray.Length; i++)
            {
                for (int j = 0; j < InputArray.Length; j++)
                {
                    if (i != j) // this is only necessary in the event that the input contains one instance of 1010
                    {
                        if (InputArray[i] + InputArray[j] == 2020)
                        {
                            ResultArray[0] = InputArray[i];
                            ResultArray[1] = InputArray[j];
                        }
                    }
                }
            }

            Console.WriteLine(ResultArray[0]);
            Console.WriteLine(ResultArray[1]);
            return ResultArray;
        }

        public static int MultiplyNumbers(int[] ChosenNumbers)
        {
            Console.WriteLine(ChosenNumbers[0] * ChosenNumbers[1]);
            return ChosenNumbers[0] * ChosenNumbers[1];
        }
    }
}
