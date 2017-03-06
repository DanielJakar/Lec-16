package course.Daniel.Java.terminal.basketball;

import java.util.ArrayList;

/**
 * Created by Jakars on 06/03/2017.
 */
public class TeamManagement {
    private ArrayList<Player> team = new ArrayList<>();

    public void addPlayer (Player player){
        team.add(player);
    }

    public void printTeam(){
        if (team.size() == 0){
            System.out.println("There are currently no team members!");
        }
        else {
            for (Player player : team) {
                System.out.println(player);
                String cat = player.getCategory();
                if (cat.equals("defense")){
                    System.out.println();
                }
            }
        }
    }
}
