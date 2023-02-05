package matchFixtures;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> teams = new ArrayList<>();
		teams.add("Galatasaray");
		teams.add("Bursaspor");
		teams.add("Beþiktaþ");
		teams.add("Trabzonspor");

		ScheduleGenerator generator = new ScheduleGenerator(teams);
		generator.generate();

		ArrayList<String[]> fixtures = generator.getFixtures();
		for (String[] fixture : fixtures) {
		    System.out.println(fixture[0] + " vs " + fixture[1]);
		}
	}

}
