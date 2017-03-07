package course.Daniel.Java.terminal.basketball;

import course.Daniel.Java.IO;

import java.util.ArrayList;

/**
 * Created by Jakars on 06/03/2017.
 */
public class TeamManagement {
    private ArrayList<Player> team = new ArrayList<>();
    public String name;

    public TeamManagement(String name) {
        this.name = name;
    }

    public TeamManagement() {
        name = IO.getString("Enter team name:");
    }

    public void add(){
        int choice = IO.getInt("Enter 1 for Offense\n" +
                "2 for Defence\n" +
                "3 for Pointguard:");
        switch (choice){
            case 1:
                team.add(new Offense());
                break;
            case 2:
                team.add(new Defense());
                break;
            case 3:
                team.add(new PointGuard());
        }
    }

    public void printTeam (){
        for (Player player : team) {
            System.out.println(player);
        }


    }

    public int teamFromThree(){
        int score = 0;
        for (Player player : team) {
            boolean didScore = player.throwFromThree();
            System.out.print(player.getFirstName() + " ");
            System.out.println(didScore?"scored": "Missed...");
            score += didScore? 3: 0;
        }
        return score;
    }
}
