public class WhileLoopFun {
    public WhileLoopFun() { }

    public void printDigits(int number) {
        while (number > 0) {
            System.out.println(number % 10);
            number /= 10;
        }
    }
    
    public int countLetter(String word, String letter) {
        int n = 0; int count = 0;
        while (n < word.length()) {
            if (word.substring(n, n + 1).equals(letter)) {
                count ++;
            }
            n++;
        }
        return count;
    }

    public int maxDoubles(int number, int threshold) {
        int count = 0;
        int num = number * 2;
        while (num <= threshold) {
            num *= 2;
            count++;
        }
        return count;
    }  

    public boolean isPrime(int number) {
        int num = 2;
        if (number == 1) {
            return false;
        }
        while (num < number) {
            if (number % num == 0) {
                return false;
            }
            num++;
        }
        return true;
    }
}
