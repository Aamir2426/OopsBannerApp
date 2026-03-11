public class OopsBannerApp {

public static void main(String[] args) {

        // Create array to store banner lines
        String[] banner = {

            String.join(" ",
                    " ***** ",
                    " ***** ",
                    " ******",
                    " ***** "),

            String.join(" ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*      "),

            String.join(" ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*      "),

            String.join(" ",
                    "*     *",
                    "*     *",
                    " ******",
                    " ***** "),

            String.join(" ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "     * "),

            String.join(" ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "*    * "),

            String.join(" ",
                    " ***** ",
                    " ***** ",
                    "*      ",
                    " ***** ")
        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}