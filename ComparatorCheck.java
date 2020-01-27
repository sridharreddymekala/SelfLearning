package com.hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class ComparatorCheck {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, (a,b) -> {if (a.score < b.score) 
        {
			return 1;
		} else if ((a.score == b.score) && a.name.compareTo(b.name) > 0) {
			return 1;
		} else if ((a.score == b.score) && a.name.compareTo(b.name) == 0) {
			return 0;
		}
		return -1;});
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
