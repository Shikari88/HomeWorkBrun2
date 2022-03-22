package HWLesson7.HomeExample.List.ArrayList;

public class Guitar {
    private String name;
    private int countStrings;
    private String materials;
    //колки
    private boolean pegs;

    public Guitar(String name, int countStrings, String materials, boolean pegs) {
        this.name = name;
        this.countStrings = countStrings;
        this.materials = materials;
        this.pegs = pegs;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    public int getCountStrings() {
        return countStrings;
    }
    public void setCountStrings() {
        this.countStrings = countStrings;
    }

    public String getMaterials(){
        return materials;
    }
    public void setMaterials(){
        this.materials = materials;
    }

    public boolean getPegs() {
        return pegs;
    }

    public void setPegs(){
        this.pegs = pegs;
    }

    @Override
    public String toString(){
        return "Guitar = {name = " + name +
                ", materials = " + materials +
                ", countStrings = " + countStrings +
                ", pegs = " + pegs +
                "}";
    }