import java.util.*;

public class Indian_Coins {

    public static void main(String[] args) {

        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Integer value = 590;

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= value) {
                while (coins[i] <= value) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    value -= coins[i];
                }
            }
        }

        System.out.println("Misizecount of coins : " + countOfCoins);

        for (int i = 0; i < ans.n(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
