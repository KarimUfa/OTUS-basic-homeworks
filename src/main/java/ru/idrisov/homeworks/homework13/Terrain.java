package ru.idrisov.homeworks.homework13;

public enum Terrain {
    LES("Лесу"),
    RAVNINA("Равнине"),
    BOLOTO("Болоте");

    private String index;

    public String getIndex(){
        return index;
    }
    Terrain(String index){
        this.index = index;
    }
}
