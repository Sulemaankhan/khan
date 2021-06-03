class AddNumbers
{
   public static void main(String args[])
   {
      int x, y, z;
 
      System.out.println("Enter two integers to calculate their sum");
      Scanner in = new Scanner(System.in);
     //x is input 
      x = in.nextInt();
      y = in.nextInt();
      z = x + y;
     
      //Print the calculations of java programs
      System.out.println("Sum of the integers = " + z);
   }
}
