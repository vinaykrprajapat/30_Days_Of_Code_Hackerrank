// Day 19: Interfaces

//Write your code here
class Calculator implements AdvancedArithmetic
{
public int divisorSum(int n)
    {
    int sum = 0;

    for (int i = 1; i < n + 1; i++)
        {
        if (n%i == 0)
            {
            sum +=i;
        }
    }
    return sum;
}
}
