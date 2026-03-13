public class OopsBannerApp {


    static class CharacterPattern {
        char ch;
        String[] pattern;

        
        CharacterPattern(char ch, String[] pattern) {
            this.ch = ch;
            this.pattern = pattern;
        }

        
        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        
        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        
        CharacterPattern P = new CharacterPattern('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });

        
        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        
        CharacterPattern[] banner = {O, O, P, S};

        
        for (int i = 0; i < 5; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern c : banner) {
                line.append(c.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}