public class OopsBannerApp {

public static void main(String[] args) {

        String[] banner = {

            // Line 1
            String.join("   ",
                    " ***** ",
                    " ***** ",
                    " ******",
                    " ***** "),

            // Line 2
            String.join("   ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*      "),

            // Line 3
            String.join("   ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*      "),

            // Line 4
            String.join("   ",
                    "*     *",
                    "*     *",
                    " ******",
                    " ***** "),

            // Line 5
            String.join("   ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "      *"),

            // Line 6
            String.join("   ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "*     *"),

            // Line 7
            String.join("   ",
                    " ***** ",
                    " ***** ",
                    "*      ",
                    " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}