package org.mycola.hebrewcards.util;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

//@XmlRootElement(name = "WordData", namespace = "http://example.com/schema")  // Убедитесь, что имя совпадает
@XmlRootElement(name = "WordData")  // Убедитесь, что имя совпадает
public class WordData {

    // Ваши поля с аннотациями
    private List<WordEntry> entries;

    @XmlElement(name = "WordEntry")
    public List<WordEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<WordEntry> entries) {
        this.entries = entries;
    }

    @Override
    public String toString() {
        return "WordData{" +
                "entries=" + entries +
                '}';
    }
}
