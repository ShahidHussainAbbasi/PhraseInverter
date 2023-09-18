public class PhraseInverter {
    static String reversedPhrase = "";

    public static void main(String[] args){
            String str = "Are you twenty-one years old?";
            String rev = reverse(str);
            System.out.println("Reversed sentence: " + rev);
        }

        public static String reverse(String s) {
            String[] splitted = s.split(" ");

            if (splitted.length == 0) {
                return reversedPhrase;
            }

            for (int i= splitted.length-1; i>= 0; i--) {
                char[] chars = splitted[i].toCharArray();
                char ch = 'q';
                String word="";
                int index = -1;
                for (int j=0; j< chars.length; j++) {
                    if (!Character.isDigit(chars[j])
                            && !Character.isLetter(chars[j])
                            && !Character.isWhitespace(chars[j])) {
                        ch=chars[j];
                        index = (chars.length -1) - j;
                    } else {
                        word += chars[j];
                    }
                }
                if (ch !='q') {
                    for (int j=0; j< chars.length; j++) {
                        if (index == 0 || index == chars.length) {
                            splitted[i] = ch+word;
                        }
                    }
                }
                reversedPhrase +=splitted[i]+" ";
            }

            return reversedPhrase;
        }
    }
