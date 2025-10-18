package Week9;
import java.util.Scanner;
interface Sports{
	int getNumberOfGoals();
	void dispTeam();
}
class Hockey implements Sports{
	private int goals;
	public Hockey(int goals) {
		if(goals < 0) {
			throw new IllegalArgumentException("Goals must be non-negative.");
		}
		this.goals = goals;
	}
	public int getNumberOfGoals() {
		return goals;
	}
	public void dispTeam() {
		System.out.println("Hockey team scored: " + getNumberOfGoals());
	}
}
class Football implements Sports{
	private int goals;
	public Football(int goals) {
		if(goals < 0) {
			throw new IllegalArgumentException("Goals must be non-negative");
		}
		this.goals = goals;
	}
	public int getNumberOfGoals() {
		return goals;
	}
	public void dispTeam() {
		System.out.println("Football team scored: " + getNumberOfGoals());
	}
}
public class SportsDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter number of hockey teams: ");
			int hockeyTeams = sc.nextInt();
			for(int i = 0; i < hockeyTeams; i++) {
				System.out.println("Enter number of goals for the hockey team: ");
				int hockeyGoals = sc.nextInt();
				Sports hockey = new Hockey(hockeyGoals);
				hockey.dispTeam();
			}
			System.out.println("Enter number of football teams: ");
			int footballTeams = sc.nextInt();
			for(int i = 0; i < footballTeams; i++) {
				System.out.println("Enter number of goals for the football team: ");
				int footballGoals = sc.nextInt();
				Sports football = new Football(footballGoals);
				football.dispTeam();
			}
		}catch(IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
