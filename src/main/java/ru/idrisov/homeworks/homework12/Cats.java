package ru.idrisov.homeworks.homework12;

public class Cats {
   private final String name;
    private final int appetite;
    private boolean satiety;

    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }
    public boolean isSatiety() {
        return satiety;
    }
    public Cats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }

    public boolean eating(Tarelka tarelka) {
        if (satiety && tarelka.DecreaseFood(appetite)) {
            satiety = false;
            return false;
        }
        return true;
    }


}
