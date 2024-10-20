package org.mycola.hebrewcards.model.transDto;

public class SkillTrans implements Comparable<SkillTrans>{
private int id;
private String name;

    public SkillTrans(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(SkillTrans other) {
        return this.name.compareTo(other.name);  // Сравнение по имени
    }

    @Override
    public String toString() {
        return "\nSkillTrans{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
