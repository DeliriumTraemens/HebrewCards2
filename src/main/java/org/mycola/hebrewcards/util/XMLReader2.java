package org.mycola.hebrewcards.util;
import org.mycola.hebrewcards.model.Skill;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class XMLReader2 {
    public static void main(String[] args) {

        Set<String> skillNames = new HashSet<>();
        Set<Skill> skills = new HashSet<>();


        try {
            // Создание фабрики и парсера для XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Чтение XML файла
            File xmlFile = new File("E:/Docs/sample3.xml");
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();

            // Получаем список всех WordEntry
            NodeList wordEntries = document.getElementsByTagName("WordEntry");

            // Проходим по каждому WordEntry
            for (int i = 0; i < wordEntries.getLength(); i++) {
//            for (int i = 0; i < 60; i++) {
                Element wordEntry = (Element) wordEntries.item(i);


                // Получаем дочерние узлы каждого WordEntry
                NodeList children = wordEntry.getChildNodes();


                // Проходим по каждому дочернему элементу
                for (int j = 0; j < children.getLength(); j++) {
                    Node child = children.item(j);

                    // Проверяем, является ли узел элементом
                    if (child.getNodeType() == Node.ELEMENT_NODE) {

                        // Приведение узла к типу Element для доступа к методу getTagName
                        Element element = (Element) child;

                        NodeList id = element.getElementsByTagName("ID");



                        element.getElementsByTagName("Skill");

                        // Выводим название тега и его содержимое
//                        System.out.println(element.getTagName());
                        System.out.println(element.getTagName() + " " + element.getTextContent());

                        extracted(element, skillNames);


                    }
                }
                System.out.println("======= Card # "+i+" =======");
            }

            System.out.println("====SKILLS===");
            System.out.println(skillNames);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void extracted(Element element, Set<String> skillNames) {
        if(element.getTagName().equals("Skill")) {

            skillNames.add(element.getTextContent());
        }
    }
}

