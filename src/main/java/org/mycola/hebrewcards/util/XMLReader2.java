package org.mycola.hebrewcards.util;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLReader2 {
    public static void main(String[] args) {
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

                        // Выводим название тега и его содержимое
//                        System.out.println(element.getTagName());
                        System.out.println(element.getTagName() + " " + element.getTextContent());
                    }
                }
                System.out.println("======= Card # "+i+" =======");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

