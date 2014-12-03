public class CreditCard
{
  public boolean verify(String num)
  {
    int sum1 = 0; //initializes int to be sum of all even placed numbers
    int sum2 = 0; //sum of all odd
    if (num.length() % 2 != 0) //for if the number has an odd amount of digits
    {
      for (int i = num.length() - 1; i >= 0; i-=2)
      {
        int length = num.length(); //keeps track of string length
        int evenNum = (Integer.parseInt(num.substring(i, i + 1))) * 2; //converts substring to int, then doubles
        if (evenNum >= 10) // in case the result is greater than 10, adds the digits together
        {
          String evenTenPlus = Integer.toString(evenNum);
          for (int j = 0; j < evenTenPlus.length(); j++)
          {
            sum1 += Integer.parseInt(evenTenPlus.substring(j, j + 1));
          }
        }
        else sum1 += evenNum; //default response, adds digit to sum
      }
      for (int h = num.length() - 2; h >= 0; h -= 2)
      {
        int oddNum = Integer.parseInt(num.substring(h, h + 1)); //converts substring to int, doubles
        System.out.println("oddNum is " + oddNum + ".");
        sum2 += oddNum; //adds oddly placed digits to second sum 
      }
    }
    else //if the length is even
    {
      for (int i = num.length() - 2; i >= 0; i-=2)
      {
        int length = num.length(); //keeps track of string length
        int evenNum = (Integer.parseInt(num.substring(i, i + 1))) * 2; //converts substring to int, then doubles
        if (evenNum >= 10) // in case the result is greater than 10, adds the digits together
        {
          String evenTenPlus = Integer.toString(evenNum);
          for (int j = 0; j < evenTenPlus.length(); j++)
          {
            sum1 += Integer.parseInt(evenTenPlus.substring(j, j + 1));
          }
        }
        else sum1 += evenNum; //default response, adds digit to sum
      }
      for (int h = num.length() - 1; h >= 0; h -= 2)
      {
        int oddNum = Integer.parseInt(num.substring(h, h + 1)); //converts substring to int, doubles
        System.out.println("oddNum is " + oddNum + ".");
        sum2 += oddNum; //adds oddly placed digits to second sum 
      }
    }
    System.out.println("sum1 is " + sum1 + ".");
    System.out.println("sum2 is " + sum2 + ".");
    int sum3 = sum1 + sum2;
    System.out.println("sum3 is " + sum3 + ".");
    return (sum3 % 10 == 0);
  }
  public int findType(String num)//method to find type of credit card
  {
    if (num.substring(0, 2).equals("51") || num.substring(0, 2).equals("52") 
          || num.substring(0, 2).equals("53") || num.substring(0, 2).equals("54")
          || num.substring(0, 2).equals("55")) return 1;
    else if (num.substring(0, 1).equals("4")) return 2;
    else if (num.substring(0, 2).equals("33") || (num.substring(0, 2).equals("34"))) return 3;
    else if (num.substring(0, 4).equals("6011")) return 4;
    else if (num.substring(0, 2).equals("36") || num.substring(0, 2).equals("38")
               || num.substring(0, 3).equals("300") || num.substring(0, 3).equals("301")
               || num.substring(0, 3).equals("302") || num.substring(0, 3).equals("303")
               || num.substring(0, 3).equals("304") || num.substring(0, 3).equals("305")) return 5;    
    else return 0;
  }
}