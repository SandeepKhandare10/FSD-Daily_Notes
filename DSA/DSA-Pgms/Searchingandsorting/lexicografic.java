package Searchingandsorting;

public class lexicografic {
    public static void main(String[] args) {
        String[] frutrs = {"pappaya", "apple", "banana", "mango", "kiwi"};

        for (int i = 0; i < frutrs.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < frutrs.length; j++) {
                if (frutrs[j].compareTo(frutrs[min]) < 0) {
                    min = j;
                }
            }
            String temp = frutrs[i];
            frutrs[i] = frutrs[min];
            frutrs[min] = temp;
        }

        for (String val : frutrs) {
            System.out.println(val);
        }
    }
}
