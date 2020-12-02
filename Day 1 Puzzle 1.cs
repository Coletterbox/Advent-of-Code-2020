using System;

namespace Day1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
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

            return ResultArray;
        }
    }
}
