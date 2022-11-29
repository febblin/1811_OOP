import chars.Coordinates;

import java.util.Collections;

public class ConsoleView {
    public static int step = 0;
    public static void field(int teamCount) {

        if (step++ == 0) {
            System.out.println(Colors.ANSI_RED+"First step!"+Colors.ANSI_RESET);
        } else {
            System.out.println(Colors.ANSI_RED + "Step: "+step+Colors.ANSI_RESET);
        }

        // Верх
        System.out.println(
                "\u250c" + String.join("", Collections.nCopies(teamCount-1, "\u2500\u2500\u252c")) + "\u2500\u2500\u2510");

        // Середина
        for (int i = 1; i < teamCount; i++) {
            System.out.printf("\u2502%s", ConsoleView.getChar(i, 0, teamCount));

            for (int j = 1; j < teamCount; j++) {
                System.out.printf("\u2502%s", ConsoleView.getChar(i, j, teamCount));
            }

            System.out.println("\u2502\n");
            // Где-то здесь вместо \n идет \s и передается результат метода "status"
            // System.out.printf("\u2502     %s\n", ConsoleView.status());
            System.out.println(
                    "\u251c" + String.join("", Collections.nCopies(teamCount-1, "\u2500\u2500\u253c")) + "\u2500\u2500\u2524");
            // Где-то здесь вместо println идет printf c \s и передается результат метода "status".Нужна проверка так же как в get Char на положение.
//          /*
//          System.out.println(
//                   "\u251c" + String.join("", Collections.nCopies(teamCount-1, "\u2500\u2500\u253c")) + "\u2500\u2500\u2524     "                     + ConsoleView.status());
//          */
        }

        // Низ
        System.out.printf("\u2502%s", ConsoleView.getChar(teamCount-1, 0, teamCount));

        for (int j = 1; j < teamCount; j++) {
            System.out.printf("\u2502%s", ConsoleView.getChar(teamCount-1, j, teamCount));
        }

        System.out.printf("\u2502%s", ConsoleView.getChar(teamCount-1, teamCount-1, teamCount));
        System.out.println(
                "\u2514" + String.join("", Collections.nCopies(teamCount-1, "\u2500\u2500\u2534")) + "\u2500\u2500\u2518");

    }

    private static String getChar(int x, int y, int teamCount) {
        String str = "  ";
        for (int i = 0; i < teamCount; i++) {
            if (Main.lightSide.get(i).getPosition().isSame(new Coordinates(x, y))) //сейчас они воспринимают друг друга как внешние. Как сделать так, чтобы в одном большом пакете java все классы (в подпакете chars и просто) воспринимали друг друга как внутренние, а не внешние?
                str = Colors.ANSI_BLUE + Main.lightSide.get(i).getName().substring(0, 2)+Colors.ANSI_RESET;
            if (Main.darkSide.get(i).getPosition().isSame(new Coordinates(x, y)))
                str = Colors.ANSI_GREEN + Main.darkSide.get(i).getName().substring(0, 2)+Colors.ANSI_RESET;
        }
        return str;
    }


    public static String status() {
        return "тут должна быть информация о персонаже";
    }
}

/*Шпаргалка по значению кодовых точек
 * '\u250c' - верхний левый угол
 * '\u252c' - пересечение верхней горизонтальной границы и внутренней вертикальной
 * '\u2510' - верхний правый угол
 * '\u251c' - пересечение внешней границы слева и горизонтальной внутренней
 * '\u253c' - пересечение внутренней вертикальной и горизонтальной границ ячейки
 * '\u2524' - пересечение внешней границы справа и горизонтальной внутренней
 * '\u2514' - левый нижний угол
 * '\u2534' - пересечение нижней горизонтальной границы и внутренней вертикальной
 * '\u2518' - правый нижний угол
 * '\u2500' - нижняя граница
 * '\u2574' - верхняя граница
 * "___"
 * */