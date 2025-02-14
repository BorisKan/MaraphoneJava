package day7.Task2;

public class Player {
    int stamina;
    int MAX_STAMINA = 100;
    int MIN_STAMINA = 0;
    static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }
    public Player(int stamina){
        this.stamina = stamina;
    }
    public int run(int stamina){
        stamina--;
        return stamina;
    }
    public void info(Player[] players){
        if (players.length <= 6){
            System.out.println("Команда не полная, есть еще" + (6 - players.length) + "мест");
        } else System.out.println("Мест нет");
    }
}
