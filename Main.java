//TODO: <name>
//TODO: <date>
//Practice 2015 - 00: Number Summation

public class  {
  public static void main(String[] args) {
       Scanner key = new Scanner(System.in);    
       System.out.println("Enter how may entries");
       int entries = key.nextInt();
       int[] nums = new int[entries];
     
     
       System.out.println("Enter positive integers:");
       for(int i = 0; i < entries; i++)
       {
         System.out.print("#" + (i+1) + ":");
          nums[i] = key.nextInt();
       }

       
       System.out.println("Summations:");
       for(int j = 0; j < entries; j++)
       {
          int summation = 0;
          for(int k = 0; k<=nums[j]; k++)
          {
             summation += k;
          }  
          nums[j] = summation;
          System.out.println(nums[j]);
       }
    System.exit(0);
  }
}
