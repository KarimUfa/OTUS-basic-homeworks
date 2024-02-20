package ru.idrisov.homeworks.homework13;

public enum Terrain {
    FOREST("Лесу"),
    PLAIN("Равнине"),
    SWAMP("Болоте");

    private String index;

    public String getIndex(){
        return index;
    }
    Terrain(String index){
        this.index = index;
    }
}
