public class Main {
    private static final String[] ones = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

 

    private static final String[] teens = {
        "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    };

 

    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

 

    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

 

        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            String words = convertToWords(number);
            System.out.println("Number in words: " + words);
        }

 

        
    }

 

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

 

        String words = "";

 

        if (number >= 100) {
            words += ones[number / 100] + " Hundred ";
            number %= 100;
        }

 

        if (number >= 20) {
            words += tens[number / 10] + " ";
            number %= 10;
        }

 

        if (number > 0) {
            if (number >= 11 && number <= 19) {
                words += teens[number - 10];
            } else {
                words += ones[number];
            }
        }

 

        return words.trim();
    }
}

 

 

