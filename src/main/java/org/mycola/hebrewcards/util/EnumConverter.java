package org.mycola.hebrewcards.util;

import org.mycola.hebrewcards.model.TypeEnum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EnumConverter {
    public static List<TypeEnum> convertStringsToEnums(Set<String> stringTypes) {
//        Set<TypeEnum> enumSet = new HashSet<>();
        List<TypeEnum> enumList = new ArrayList<TypeEnum>();

        for (String type : stringTypes) {
            try {
                // Преобразуем строку в Enum, если имя точно совпадает
                enumList.add(TypeEnum.valueOf(type.toUpperCase()));
            } catch (IllegalArgumentException e) {
                // Если строка не соответствует ни одному значению Enum, добавляем UNDEFINED
                if (type.equalsIgnoreCase("UNDEF")) {
                    enumList.add(TypeEnum.UNDEFINED);
                } else {
                    System.out.println("Unknown type: " + type);
                }
            }
        }

        return enumList;
    }

}
