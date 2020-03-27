
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        int counter = 0;
        int wins = 0;
        int losses = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamFind = scan.nextLine();

        try ( Scanner scanner = new Scanner(Paths.get(fileName))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int team1Points = Integer.valueOf(parts[2]);
                int team2Points = Integer.valueOf(parts[3]);

                if (team1.equals(teamFind)) {
                    counter++;
                    if (team1Points > team2Points) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

                if (team2.equals(teamFind)) {
                    counter++;
                    if (team2Points > team1Points) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

        System.out.println("Games: " + counter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
