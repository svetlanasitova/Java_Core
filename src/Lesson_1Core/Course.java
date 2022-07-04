package Lesson_1Core;

public class Course {
    String result;
    private int race;
    private int distance;
    private int marathon;

    public Course(int race, int distance, int marathon){
        this.race = race;
        this.distance = distance;
        this.marathon = marathon;
    }

    public String doIt(Team team) {
        result = "Группа " + team.getName() + " " + '\n';
        for (Player player : team.getPlayers()) {
            result += " имя игрока " + player.getName() + " " + '\n';
            int value = player.getCanGo();
            testRace(value);
            testDistance(value);
            testMarathon(value);
        }
        return result;
    }

    private void testRace(int value){
        if(value > race){
            result += " - 100 метровку пробежал. " + '\n';
        }
    }
    private  void testDistance(int value){
        if(value > distance + 50 ){
            result += " - Дистанция 200 метров пройдена! " + '\n';
        }
    }
    private void testMarathon(int value){
        if(value > marathon ){
            result += " - Марафон 500 выдержал ! " + '\n';
        }
    }

}
