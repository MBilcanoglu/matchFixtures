package matchFixtures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScheduleGenerator {

	private ArrayList<String> teams;
    private ArrayList<String[]> fixtures;

    public ScheduleGenerator(ArrayList<String> teams) {
        this.teams = teams;
        this.fixtures = new ArrayList<>();
    }

    public void generate() {
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        for (int i = 0; i < teams.size() - 1; i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                fixtures.add(new String[]{teams.get(i), teams.get(j)});
            }
        }

        Collections.shuffle(fixtures);
    }

    public ArrayList<String[]> getFixtures() {
        return fixtures;
    }
}