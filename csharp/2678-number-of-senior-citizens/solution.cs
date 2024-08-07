public class Solution
{
    public int CountSeniors(string[] details)
    {
        var result = 0;
        foreach(var info in details)
        {
            var age = int.Parse(info.Substring(11, 2));
            if (age > 60)
            {
                result++;
            }
        }

        return result;
    }
}
