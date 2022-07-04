package Lesson_1Core;

public class Start {
    public static void main(String[] args){

        Player[] player = new Player[4];
        player[0] = new Player("Трус", 90);
        player[1] = new Player("Балбес", 340);
        player[2] = new Player("Бывалый", 230);
        player[3] = new Player("Новичок", 510);


        Team team = new Team("Пивовары", player);
        Course course = new Course(100, 200, 500);
        String result = course.doIt(team);
        System.out.println(result);


        for (int i = 0; i < player.length; i++) {
            player[i].info();
            System.out.println();
        }
    }
}


