class Runner {

    public static void printNums(int value, int numRounds) {
            //your code here
                int x = -1;
                for (int i = 0; i < numRounds; i ++) {
                    while (x != value) {
                        x = (int) (Math.random() * 10);
                        System.out.print(x);
                    }
                x = -1;
                System.out.println();
            }
        }

        public static String longestStreak(String str) {
                    int max = 0;
                      int count;
                    String letter = "";
                      for (int i = 0; i < str.length() - 1; i++) {
                        count = 1;
                        int j = i;
        
                        while (j != str.length() - 1 && str.substring(j, j + 1).equals(str.substring(j + 1, j + 2))) {
                            j++; 
                            count++;
                        }
        
                        if (count > max) {
                            max = count;
                            letter = str.substring(i, i + 1);
                        }
                    }
                return letter + " " + max;
                }
                
                    
            public static void main(String[] args) {
                CoinGame game1 = new CoinGame(10, 5);
                game1.playGame();
                
                CoinGame game2 = new CoinGame(10, 4);
                game2.playGame();
                
                CoinGame game3 = new CoinGame(10, 3);
                game3.playGame();
                
                CoinGame game4 = new CoinGame(10, 2);
                game4.playGame();
                
                CoinGame game5 = new CoinGame(10, 6);
                game5.playGame();
                
                CoinGame game6 = new CoinGame(5, 4);
                game6.playGame();
                
                CoinGame game7 = new CoinGame(7, 4);
                game7.playGame();
                


    }
}