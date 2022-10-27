
import java.util.*;

public class VersionControlSystem {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0){
                  int n = scn.nextInt(); // number of source files
                  int m = scn.nextInt(); // number of ignored files
                  int k = scn.nextInt(); // number of tracked files


                  HashSet<Integer> ignores = new HashSet<>();
                  for(int i = 0 ; i < m ; i++){
                        ignores.add(scn.nextInt());
                  }

                  HashSet<Integer> tracks = new HashSet<>();
                  for(int i = 0 ; i < k ; i++){
                        tracks.add(scn.nextInt());
                  }

                  int trackedandignored = 0;
                  for(int val : ignores){
                        if(tracks.contains(val)){
                              trackedandignored++;
                        }
                  }

                  HashSet<Integer> unignored = new HashSet<>();
                  for(int i = 1 ; i <= n ;i++){
                        if(!ignores.contains(i)){
                              unignored.add(i);
                        }
                  }

                  int unignoredanduntracked = 0;
                  for(int val : unignored){
                        if(!tracks.contains(val)){
                              unignoredanduntracked++;
                        }
                  }

                  System.out.print(trackedandignored +" " + unignoredanduntracked);
            }
      }
}
