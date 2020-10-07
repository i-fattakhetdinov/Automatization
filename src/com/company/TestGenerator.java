package com.company;

import java.io.*;
import java.util.Vector;

public class TestGenerator {

    // построчное считывание файла
    public static void main(String[] args) throws IOException {
        String className = "SomeClass";
        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter("src\\com\\company\\" + className + "Test.java"));
        writer.write("package com.company;\n" +
                "import org.junit.Assert;\n" +
                "import org.junit.jupiter.api.Test;\n" +
                "\n" +
                "import static org.junit.jupiter.api.Assertions.*;\n" +
                "\n" +
                "class SomeClassTest {\n");


        try {
            File file = new File("src\\com\\company\\tests.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            StringBuilder functionHeaderPart1 = new StringBuilder("");
            String functionHeaderPart2 = new String("");
            String curFuncName = new String();
            int num = 1;
            while (line != null) {
                String[] splitted = line.split(" ");
                if (splitted[0].equals("function")){
                    num = 1;
                    curFuncName = new String(splitted[1]);
                    functionHeaderPart1 = new StringBuilder("\t@Test\n"+
                        "\tpublic void " + splitted[1] + "Test");
                    functionHeaderPart2 = new String("() { \n");
                } else {
                    int numNumbers = 0;
                    String[][] testValues = new String[splitted.length][];
                    for(int i = 0; i < splitted.length; i++) {
                        if (splitted[i].contains(",") || splitted[i].contains("-")) {
                            numNumbers = 0;
                            String[] splitByComma = splitted[i].split(",");
                            for (int k = 0; k < splitByComma.length; k++) {
                                if (splitByComma[k].contains("-")) {
                                    String[] newSplit = splitByComma[k].split("-");
                                    int f = Integer.parseInt(newSplit[0]);
                                    int s = Integer.parseInt(newSplit[1]);
                                    numNumbers += s - f + 1;
                                } else {
                                    numNumbers++;
                                }
                            }

                            testValues[i] = new String[numNumbers];
                            int curNumber = 0;
                            for (int k = 0; k < splitByComma.length; k++) {
                                if (splitByComma[k].contains("-")) {
                                    String[] newSplit = splitByComma[k].split("-");
                                    int f = Integer.parseInt(newSplit[0]);
                                    int s = Integer.parseInt(newSplit[1]);
                                    for (int j = f; j <= s; j++) {
                                        testValues[i][curNumber] = String.valueOf(j);
                                        curNumber++;
                                    }
                                } else{
                                    testValues[i][curNumber] = String.valueOf(splitByComma[k]);
                                    curNumber++;
                                }
                            }
                        } else {
                            testValues[i] = new String[1];
                            testValues[i][0] = String.valueOf(splitted[i]);
                        }
                    }

                    if (testValues.length == 2)
                    for (int i = 0; i < testValues[0].length; i++){
                        writer.write(String.valueOf(functionHeaderPart1) + num + " " + String.valueOf(functionHeaderPart2));
                        num++;
                        writer.write("\t\tAssert.assertEquals(" + testValues[splitted.length-1][0] + ", "+
                                className + "." + curFuncName + "(" + testValues[0][i] + "));\n\t}\n");
                    }
                    if (testValues.length == 3)
                        for (int i = 0; i < testValues[0].length; i++){
                            for (int j = 0; j < testValues[1].length; j++){
                                writer.write(String.valueOf(functionHeaderPart1) + num + " " + String.valueOf(functionHeaderPart2));
                                num++;
                                writer.write("\t\tAssert.assertEquals(" + testValues[splitted.length-1][0] + ", "+
                                        className + "." +
                                        curFuncName + "(" + testValues[0][i] + ", " + testValues[1][j] + "));\n\t}\n");
                            }
                        }
                    if (testValues.length == 4)
                        for (int i = 0; i < testValues[0].length; i++){
                            for (int j = 0; j < testValues[1].length; j++){
                                for (int k = 0; k < testValues[2].length; k++) {
                                    writer.write(String.valueOf(functionHeaderPart1) + num + " " + String.valueOf(functionHeaderPart2));
                                    num++;
                                    writer.write("\t\tAssert.assertEquals(" + testValues[splitted.length - 1][0] + ", " +
                                            className + "." +
                                            curFuncName + "(" + testValues[0][i] + ", " + testValues[1][j] +
                                            ", " + testValues[2][k] + "));\n\t}\n");
                                }
                            }
                        }
                }
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.write("}");
        writer.close();
        System.out.println("OK");
    }

}