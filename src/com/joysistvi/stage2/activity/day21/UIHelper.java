package com.joysistvi.stage2.activity.day21;



// NOT YET DONE

public class UIHelper {

    public static final String RESET  = "\u001B[0m";
    public static final String CYAN   = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN  = "\u001B[32m";
    public static final String BOLD   = "\u001B[1m";

    public static void displayData(String headerTitle, String content, String netPay) {
        // split the \n from the text
        String[] contentLines = content.split("\n");

        // store the value of contentLines in the parameter of the getMaxLength method
        int maxLength = getMaxLength(contentLines);
        maxLength = Math.max(maxLength, getVisualLength(headerTitle));
        maxLength = Math.max(maxLength, getVisualLength(netPay));

        // initialized the width of the content and store the value of the sum of maxLength and 4
        int contentWidth = maxLength + 4;

        // creation of the top border & title & paddings
        System.out.println(CYAN + "╔" + "═".repeat(contentWidth) + "╗");
        int padTotal = maxLength - getVisualLength(headerTitle);
        int padLeft = padTotal / 2;
        int padRight = padTotal - padLeft;
        System.out.printf("║  %s%s%s  ║%n", " ".repeat(padLeft), BOLD + headerTitle + RESET + CYAN, " ".repeat(padRight));

        // creation of middle divider; padding is not necessary
        System.out.println("╠" + "═".repeat(contentWidth) + "╣");

        // loop the contentLines in forEach loop; compute the padding and validate it
        for (String line : contentLines) {
            int padding = maxLength - getVisualLength(line);
            if (padding < 0) padding = 0;
            System.out.printf("║  %s%s  ║%n", line, " ".repeat(padding));

        }
        // creation of closing border for content
        System.out.println("╠" + "═".repeat(contentWidth) + "╣");
        // creation of netPay
        int netPayPadding = maxLength - getVisualLength(netPay);
        if (netPayPadding < 0) netPayPadding = 0;
        System.out.printf("║  %s%s  ║%n", netPay, " ".repeat(netPayPadding));

        // scanner
//        System.out.print("  >  ");
//        String input = scanner.nextLine();

        // creation of closing border of scanner
//        System.out.println(" " + " ".repeat(contentWidth) + " ");

         // creation of the top border of input accepted message
//        String statusMessage = "Input Accepted: " + input;
//        int statusPadding = maxLength - getVisualLength(statusMessage);
//        if (statusPadding < 0) statusPadding = 0;
//        System.out.printf("   %s%s%s%s    %n", BOLD, statusMessage, RESET + CYAN, " ".repeat(statusPadding));

        // creation of bottom-border & shadow
        System.out.println("╚" + "═".repeat(contentWidth) + "╝");
//        System.out.println(" " + " ".repeat(contentWidth + 1) + RESET);

//        return content;
    }

    public static void printStyledPayslip(Employee emp) {
        String employeeData = emp.storeData();
        String netPayData = emp.storeData(0.10).strip();
        displayData("Company Payroll", employeeData, netPayData);
    }

    public static int getVisualLength(String text) {
        // early exit
        if (text == null || text.isEmpty()) return 0;

        // the one with splitted \n I guess
        String cleanText = text.replaceAll("\u001B\\[[;\\d]*m","");

        // storing the cleaned text in a variable called length to store the value of the number of length of a text
        int length = cleanText.length();

        // loop the text with special symbols

        return length;

    }

    private static int getMaxLength(String[] lines)  {
        // let max be equals to zero
        int max = 0;

        // loop the lines and store the method of getVisualLength in a variable, then
        // conditional statement if th variable is greater than max, store the value of the created variable to max then return to max

        for (String line : lines) {
            int visualllen = getVisualLength(line);
            if (visualllen > max) {
                max = visualllen;
            }
        }

        return max;
    }
}
