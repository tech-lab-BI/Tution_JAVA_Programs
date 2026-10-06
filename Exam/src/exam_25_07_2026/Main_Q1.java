// Exam1 - Create a class Player with attributes: playerId (int), skill (String), level (String), and points (int).
// Create a parameterized constructor in the attribute sequence specified above.
// Create class Solution with main() method and two static methods: findPointsForGivenSkill and getPlayerBasedOnLevel.
// 1. findPointsForGivenSkill: Takes an array of Player objects and skill string, returning the sum of points for matching players (case-insensitive). Returns 0 if skill is not found.
// 2. getPlayerBasedOnLevel: Takes level string, skill string, and array of Player objects. Returns the Player object matching level and skill (case-insensitive) with points >= 20, or null if no match is found.
// In main(), take inputs for n players, skill to check points, skill and level to check player availability. Display total points (or "The given Skill is not available") and matching player's ID (or "No player is available with specified level, skill and eligibility points").
// input  - 5 101 Cricket Basic 20 102 Cricket Intermediate 15 111 Football Intermediate 50 113 BaseBall Advanced 100 117 Football Intermediate 21 Cricket Football Intermediate
// output - Total Points: 35, Player ID: 111

package exam_25_07_2026;
import java.util.Scanner;

class Player{
	int playerId;
	String skill;
	String level;
	int point;
	
	Player(int playerId, String skill, String level, int point){
		this.playerId = playerId;
		this.skill = skill;
		this.level = level;
		this.point = point;
	}
}

public class Main_Q1 {
	
	static int findPointsForGivenSkill(Player p[], String s) {
		int i=0,res=0;
		while(i<p.length) {
			if(p[i].skill.equalsIgnoreCase(s)) {
				res+=p[i].point;
			}
			i++;
		}
		return res;
	}
	
	static Player[] getPlayerBasedOnLevel(Player p[], String level, String skill) {
		int i=0,j=0;
		Player resP[] = new Player[p.length];
		while(i<p.length) {
			if(p[i].level.equalsIgnoreCase(level) && p[i].skill.equalsIgnoreCase(skill) && p[i].point >= 20) {
				resP[j++] = p[i];
			}
			i++;
		}
		if(resP[0] == null)
			return null;
		return resP;
	}
	static void show(Player p[] ) {
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].playerId);
			System.out.println(p[i].skill);
			System.out.println(p[i].level);
			System.out.println(p[i].point);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int playerId;
		String skill;
		String level;
		int point;
		
		System.out.print("Enter no of Player : ");
		n = sc.nextInt();
		
		Player p[] = new Player[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Player "+(i+1)+"th Details - ");
			
			System.out.print("Player ID : ");
			playerId = sc.nextInt();sc.nextLine();
			
			System.out.print("SKILL : ");
			skill = sc.nextLine();
			
			System.out.print("LEVEL : ");
			level = sc.nextLine();
			
			System.out.print("POINT : ");
			point = sc.nextInt();sc.nextLine();
			while(point < 0) {
				System.out.print("POINT : ");
				point = sc.nextInt();sc.nextLine();
			}
			
			p[i] = new Player(playerId, skill, level, point);
			
		}
		
		System.out.print("Enter skill : ");
		String s = sc.nextLine();
		
		int res = findPointsForGivenSkill(p, s);
		System.out.print("Total point :: "+res);
		if(res == 0) {
			System.out.println("\n and The given Skill is not avilable.");
		}
		
		
		System.out.print("Enter skill : ");
		skill = sc.nextLine();
		System.out.print("Enter level : ");
		level = sc.nextLine();
		Player resP[] = getPlayerBasedOnLevel(p, level, skill);
		System.out.println("Player based on level ->");
		if(resP == null) {
			System.out.println("No player is avilable");
		}else {
			for(int i=0;i<resP.length;i++) {
				if(resP[i] == null) break;
				System.out.println(resP[i].playerId);
			}
		}
		
	}

}
