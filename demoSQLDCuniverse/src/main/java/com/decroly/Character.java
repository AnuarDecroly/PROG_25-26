package com.decroly;

public class Character {
    private int id;
    private String heroName;
    private String fullName;
    private String gender;
    private String race;
    private String alignment;

    public int getId() {
        return id;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public Character(int id, String heroName, String fullName, String gender, String race, String alignment) {
        this.id = id;
        this.heroName = heroName;
        this.fullName = fullName;
        this.gender = gender;
        this.race = race;
        this.alignment = alignment;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Character{");
        sb.append("id=").append(id);
        sb.append(", heroName='").append(heroName).append('\'');
        sb.append(", fullName='").append(fullName).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", race='").append(race).append('\'');
        sb.append(", alignment='").append(alignment).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
