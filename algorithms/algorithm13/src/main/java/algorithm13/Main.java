package algorithm13;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        int numbers[] = { 1, 6, 9, 19, 45, 88 };
        int x = 16;
        int len = numbers.length;
        int a = 0;
        int b = 0;
        boolean result = false;
        for (int i = 0; i < len; i++) {
            if (result == false) {
                a = numbers[i];
                if (a < x) {
                    for (int j = i + 1; j < len; j++) {
                        b = numbers[j];
                        if (b < x) {
                            if (a + b == x) {
                                result = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        System.out.println(result);
    }
}