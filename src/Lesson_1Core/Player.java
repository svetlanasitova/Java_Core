package Lesson_1Core;

public class Player {
    private String name;
    private int canGo;

    public String getName() {
        return name;
    }

    public int getCanGo() {
        return canGo;
    }

    public Player(String name, int canGo){
        this.name = name;
        this.canGo = canGo;
    }
    public void info(){
        System.out.println("Имя " + name + " может пробежать - " + canGo + " метров.");
    }

}


