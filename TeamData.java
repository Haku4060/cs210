package Program_assignment6;
import java.time.*;

class TeamData{
	
	private String TeamName;
	private String CoachName;
	private String ConferenceName;
	private int MAX_MEMBERS = 20;
	private PersonIdentity[] members;
	private int MembersNumber = 0;
	
	public static void main(String args[]) {
		TeamData team1 = new TeamData("Bulldog BasketBall", "Tonny", "BcMatch");
		PersonIdentity member1 = new PersonIdentity("Patric", "42539382023" , LocalDate.of(2000, 5, 30), 20);
		PersonIdentity member2 = new PersonIdentity("Maicha", "42539382023" , LocalDate.of(2003, 8, 26), 21);
		PersonIdentity member3 = new PersonIdentity("Trant", "42539382023" , LocalDate.of(2004, 4, 10), 22);
		PersonIdentity member4 = new PersonIdentity("Gray", "42539382023" , LocalDate.of(2000, 10, 20), 23);
		
		team1.AddTeamMember(member1);
		team1.AddTeamMember(member2);
		team1.AddTeamMember(member3);
		team1.AddTeamMember(member4);
		PersonIdentity findPerson = team1.findMembersbyName("Patric");
		
		if(findPerson != null) {
			System.out.println("Person found");
			System.out.println("Name: " + findPerson.getName());
			System.out.println("JerseyNumber: " + findPerson.getJerseyNumber());
			
			team1.displayRoster();
		}else {
			System.out.println("Person not found");
		}
		
	}
	
	public TeamData(String TeamName, String CoachName, String ConferenceName) {
		this.TeamName = TeamName;
		this.CoachName = CoachName;
		this.ConferenceName = ConferenceName;
		members = new PersonIdentity[MAX_MEMBERS];
		
	}
	
	public void AddTeamMember(PersonIdentity member) {
		members[MembersNumber] = member;
		MembersNumber++;
	}
	
	public PersonIdentity findMembersbyName(String name) {
		for(PersonIdentity member : members) {
			if(member.getName().equalsIgnoreCase(name)) {
				return member;
			}
		}
		
		return null;
	}
	
	public void displayRoster() {
		
		System.out.println("Team: " + TeamName);
		System.out.println("CoachName" + CoachName);
		System.out.println("ConferenceName" + ConferenceName);
		System.out.println("Members: ");
		for(PersonIdentity member : members) {
			System.out.println(member);
		}
	}
	
}