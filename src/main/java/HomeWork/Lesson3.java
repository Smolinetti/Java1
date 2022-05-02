package HomeWork;

public class Lesson3 {
    public static void main(String[] args) {
        final int SEASON_NUMBER = 3;
        seasons(SEASON_NUMBER);

    }

    private static void seasons(int seasonNumber) {
        String season = switch (seasonNumber) {
            case 1 -> "Winter";
            case 2 -> "Spring";
            case 3 -> "Summer";
            case 4 -> "Fall";
            default -> "UnKnow season";
        };

        System.out.println(season);

    }

}
