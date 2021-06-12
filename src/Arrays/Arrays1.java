package Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        //valores padrões para os tipos
        //byte, short, int, long. float. double = 0
        //char '\u0000' ' '
        //boolean false;
        //reference null
        String[] games = new String[2];
        games[0] = "DOS2";
        games[1] = "minecraft";

        for (int iterator  = 0; iterator < games.length; iterator++){
            System.out.println(iterator + " game: " + games[iterator]);
        }
    }
}
