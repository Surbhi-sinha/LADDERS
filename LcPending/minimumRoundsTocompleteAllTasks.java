package LcPending;

import java.util.*;

public class minimumRoundsTocompleteAllTasks {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = scn.nextInt();
            }
            System.out.println(minimumRounds(arr));

      }

      public static int minimumRounds(int[] tasks) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < tasks.length; i++) {
                  if (!map.containsKey(tasks[i])) {
                        map.put(tasks[i], 1);
                  } else {
                        map.put(tasks[i], map.get(tasks[i]) + 1);
                  }
            }

            int round = 0;

            for (int task : map.keySet()) {
                  if (map.get(task) > 0 && map.get(task) < 2) {
                        return -1;
                  } else if (map.get(task) == 2) {
                        map.put(task, map.get(task) - 2);
                        round++;
                  } else {
                        while (map.get(task) > 0) {
                              map.put(task, map.get(task) - 3);
                              round++;
                        }
                  }

            }

            return round;
      }
}
