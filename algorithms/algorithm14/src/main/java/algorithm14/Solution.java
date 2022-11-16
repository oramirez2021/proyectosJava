package algorithm14;
import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        boolean result = false;
        // Return true if you can win the game; otherwise, return false.
        int len = game.length;
        for (int i = 0; i < len; i++) {
            if(i+leap <= len - 1){
                if(i == 0){
                    if((game[i+1]==0)||(game[i+leap]==0)){
                        result = true;
                    }else{
                        result = false;
                        break;
                    }
                }else{
                    if(i == len - 1){
                        if(game[i-1]==0){
                            result = true;
                        }else{
                            result = false;
                            break;
                        }
                    }else{
                        if((game[i-1]==0)||(game[i+1]==0)||(game[i+leap]==0)){
                            result = true;
                        }else{
                            result = false;
                            break;
                        }
                    }

                }
            }
            if((i == len - 1)||(i + leap >= len)){
                result = true;
                break;
            }




        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();

    }
}