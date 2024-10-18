package org.mycola.hebrewcards.util;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "WordEntry")
public class WordEntry {
    private int ID;
    private String Skill;
    private String Word;
    private String Translation;
    private String Type;
    private String Niqqud;
    private String Transliteration;
    private String NewTranslit;
    private String Gender;
        private String Form;
    private String Number;
    private boolean HasShva;
    private String Process;
//    private String Notes;


    public WordEntry() {
    }

    // Getters и Setters с аннотациями @XmlElement для каждого поля
    @XmlElement(name="ID")
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @XmlElement(name="Skill")
    public String getSkill() {
        return Skill;
    }

    public void setSkill(String Skill) {
        this.Skill = Skill;
    }

    @XmlElement(name="Word")
    public String getWord() {
        return Word;
    }

    public void setWord(String word) {
        Word = word;
    }

    @XmlElement(name="Translation")
    public String getTranslation() {
        return Translation;
    }

    public void setTranslation(String translation) {
        Translation = translation;
    }

    @XmlElement(name="Type")
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @XmlElement(name="Nikkud")
    public String getNiqqud() {
        return Niqqud;
    }

    public void setNiqqud(String niqqud) {
        Niqqud = niqqud;
    }

    @XmlElement(name="Transliteration")
    public String getTransliteration() {
        return Transliteration;
    }

    public void setTransliteration(String transliteration) {
        Transliteration = transliteration;
    }

    @XmlElement(name="NewTranslit")
    public String getNewTranslit() {
        return NewTranslit;
    }

    public void setNewTranslit(String newTranslit) {
        NewTranslit = newTranslit;
    }

    @XmlElement(name="Gender")
    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @XmlElement(name="HasShva")
    public boolean isHasShva() {
        return HasShva;
    }

    public void setHasShva(boolean hasShva) {
        HasShva = hasShva;
    }

    @XmlElement(name="process")
    public String getProcess() {
        return Process;
    }

    public void setProcess(String process) {
        Process = process;
    }
// Аналогично для остальных полей

    @XmlElement(name="Form")
    public String getForm() {
        return Form;
    }

    public void setForm(String form) {
        Form = form;
    }
    @XmlElement(name="Number")
    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    @Override
    public String toString() {
        return "\nWordEntry{" +
                "\nID=" + ID +
                ", \nSkill='" + Skill + '\'' +
                ", \nWord='" + Word + '\'' +
                ", \nTranslation='" + Translation + '\'' +
                ", \nType='" + Type + '\'' +
                ", \nNiqqud='" + Niqqud + '\'' +
                ", \nTransliteration='" + Transliteration + '\'' +
                ", \nNewTranslit='" + NewTranslit + '\'' +
                ", \nGender='" + Gender + '\'' +
                ", \nForm='" + Form + '\'' +
                ", \nNumber='" + Number + '\'' +
                ", \nHasShva=" + HasShva +
                ", \nProcess='" + Process + '\'' +
                '}';
    }
}
