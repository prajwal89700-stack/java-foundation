import java.util.Arrays;
import java.util.Scanner;

public class InfosysMonsterGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long exp = sc.nextLong();
        int[][] monsters = new int[n][2];
        for(int i=0; i < n; i++) {
            monsters[i][0] = sc.nextInt();
        }
        for(int i=0; i < n; i++) {
            monsters[i][1] = sc.nextInt();
        }
        Arrays.sort(monsters, (a, b) -> Integer.compare(a[0], b[0]));
        int defeated = 0;
        for(int i =0; i < n; i++){
            if(exp >= monsters[i][0]){
                defeated++;
                exp += monsters[i][1];
            }else {
                break;
            }
        }
        System.out.println(defeated);
    }
}
