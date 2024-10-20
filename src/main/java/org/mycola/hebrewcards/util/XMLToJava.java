package org.mycola.hebrewcards.util;

import org.mycola.hebrewcards.model.Gender;
import org.mycola.hebrewcards.model.Skill;
import org.mycola.hebrewcards.model.TypeEnum;
import org.mycola.hebrewcards.model.transDto.SkillTrans;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class XMLToJava {
    public static void main(String[] args) {

        Set<String>forms = new TreeSet<String>();
        Set<Gender>genders = new TreeSet<Gender>();
//        Set<SkillTrans>skills = new TreeSet<SkillTrans>(Comparator.comparingInt(SkillTrans::getId));
        Set<SkillTrans>skills = new TreeSet<SkillTrans>((s1, s2) -> Integer.compare(s1.getId(), s2.getId()));
        Set<String>types=new TreeSet<>();

        try {
            // Создание контекста JAXB
            JAXBContext context = JAXBContext.newInstance(WordData.class);

            // Создание объекта Unmarshaller для десериализации
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Чтение XML-файла и преобразование в объект HebrewWord
            File xmlFile = new File("E:/Docs/sample3.xml");

//            Object unmarshal = unmarshaller.unmarshal(xmlFile); Без кастинга типа, просто обж

            WordData word = (WordData) unmarshaller.unmarshal(xmlFile);
            List<WordEntry> entries = word.getEntries();

            // Вывод данных
            for (WordEntry entry : entries) {
                System.out.println("============"+"\n"+entry.toString());
                forms.add(entry.getForm().toUpperCase());

                SkillTrans skill=new SkillTrans(entry.getID(), entry.getSkill());
//                    skill.setId(entry.getID());
//                    skill.setName(entry.getSkill());
                skills.add(skill);
                types.add(entry.getType().toUpperCase());
            }//end for()
            for (SkillTrans skill : skills) {
                System.out.println(skill.getId()+" "+skill.getName());
            }

                System.out.println(skills);
            System.out.println("Types "+types);
            System.out.println("=== FORMS ===\n"+forms);
            System.out.println("Total "+entries.size()+" Entries\n");

            List<TypeEnum> typeEnums = EnumConverter.convertStringsToEnums(types);
//            List<TypeEnum> typeEnumsList = (List<TypeEnum>) EnumConverter.convertStringsToEnums(types);
            System.out.println("Converted enum values: " + typeEnums);
            for (TypeEnum typeEnum : typeEnums) {
                System.out.println("Enum number "+typeEnum.ordinal()+" "+typeEnum.name());
            }



        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
