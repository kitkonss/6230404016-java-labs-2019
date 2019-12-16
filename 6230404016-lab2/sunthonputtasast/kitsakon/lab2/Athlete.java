/**
 * This Athlete program is to accept three arguments: athlete name, the sport name 
*  that that athlete plays, and the nationality of that athlete.  Its output format is "My 
*  favorite athlete is <athlete_name> who plays <sport_name> and has 
* nationality as <athlete_nationality>"
*
* Author: Kitsakon Sunthonputtasast
* ID: 623040401-6
* Sec: 1
* Date: December 16, 2019
*
**/
package sunthonputtasast.kitsakon.lab2;

public class Athlete {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("<athlete_name> <sport_name> <athlete_nationality>");
        } else {
            String athleteName = args[0];
            String sportName = args[1];
            String athleteNationality = args[2];
            System.out.println("My favorite athlete is " + athleteName + " who plays " + sportName
                    + " and has nationality as " + athleteNationality);
        }

    }
}