import java.util.Arrays;
import java.util.Scanner;

public class InfosysHeroesVillains {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] heroes = new int[n];
        int[] villains = new int[k];
        for(int i=0; i < n; i++){
            heroes[i] = sc.nextInt();
        }

        for(int i = 0; i < k; i++){
            villains[i] = sc.nextInt();
        }
        Arrays.sort(heroes);
        Arrays.sort(villains);
        int i = 0, j = 0, defeated = 0;
        while(i < n && j < k){
            if(Math.abs(heroes[i] - villains[j]) <= k) {
                defeated++;
                i++;
                j++;
            }else if(heroes[i] < villains[j]) {
                i++;
            }else{
                j++;
            }

        }
            System.out.println(defeated);
    }
}
