public class Main {
    private static final String[] ones = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

 

    private static final String[] teens = {
        "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    };

 

    private static final String[] tens = {
        "", "ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

 

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

 

        if (n < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            String words = convertToWords(n);
            System.out.println("Number in words: " + words);
        }

 

        
    }

 

    public static String convertToWords(int n) {
        if (n == 0) {
            return "Zero";
        }

 

        String words = "";

 

        if (n >= 100) {
            words += ones[n/ 100] + " Hundred ";
            n %= 100;
        }

 

        if (n >= 20) {
            words += tens[n / 10] + " ";
            n %= 10;
        }

 

        if (n > 0) {
            if (n >= 11 && n <= 19) {
                words += teens[n - 10];
            } else {
                words += ones[n];
            }
        }

 

        return words.trim();
    }
}

 

 

