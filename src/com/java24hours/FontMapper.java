package com.java24hours;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

public class FontMapper {
    public FontMapper(int argsLength, String argKey, String argName, String argStyle, String argSize) {
        int style = Integer.parseInt(argStyle);
        int size = Integer.parseInt(argSize);
        Font courier = new Font("Courier New", Font.PLAIN, 6);
        Font times = new Font("Times New Roman", Font.BOLD, 12);
        Font verdana = new Font("Verdana", Font.ITALIC, 25);

        HashMap<String, Font> fonts = new HashMap<>();
        for (int i = 0; i < argsLength; i++) {
            fonts.put(argKey, new Font(argName, style, size));
        }

        fonts.put("smallprint", courier);
        fonts.put("body", times);
        fonts.put("headline", verdana);

        for (Map.Entry<String, Font> entry : fonts.entrySet()) {
            String mapKey = entry.getKey();
            Font mapValue = entry.getValue();
            System.out.println(mapKey + ": " + mapValue.getSize() + "-pt " + mapValue.getFontName());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length - 3;) {
            new FontMapper(args.length, args[i], args[i+1], args[i+2], args[i+3]);
            i += 4;
        }
    }
}
