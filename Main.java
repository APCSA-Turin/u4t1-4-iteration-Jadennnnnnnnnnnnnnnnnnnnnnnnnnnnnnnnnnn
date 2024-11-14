public class Main {
    public static void main(String[] args)
    {
        String str = "Hoopla";
            int max = 0;
            int count;
            for (int i = 0; i < str.length() - 1; i++) {
              count = 1;
              int j = i;
              while (j != str.length() - 1 && str.substring(j, j + 1).equals(str.substring(j + 1, j + 2))) {
                j++; 
                count++;
              }
              if (count > max) {
                max = count;
              }
            }
        System.out.println(max);
    }
 }
 
    
