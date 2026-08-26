package com.joysistvi.stage1.day7;

import java.util.Scanner;
import com.joysistvi.stage1.language.JapaneseFileReader;
import java.util.List;

public class Activity5_Manite {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<String> jp = japaneseLang();

        int choice, langChoice, pin;
        int correctPin = 123456, attempts = 3;
        double balance = 5000.00, depositAmount, withdrawAmount;

        boolean isValidLang = false;
        boolean isValidChoice = true;
        boolean isLoggedin = false;

        // Ask user's preferred language
        do {
            System.out.println("Select Language / 言語選択");
            System.out.println("1 - English");
            System.out.println("2 - 日本語");
            System.out.print("Select: ");
            langChoice = input.nextInt();

            if (langChoice == 1 || langChoice == 2) {
                isValidLang = true;
            } else {
                System.out.println("Invalid. Please try again.\n");
            }
        } while(!isValidLang);

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }


        String actTitle = "=== SIMPLE ATM MENU ===";
        String checkBalance = "1 - Check Balance", deposit = "2 - Deposit", withdraw = "3 - Withdraw", exit = "4 - Exit";

        if (langChoice == 2 && jp != null && jp.size() >= 5) {
            actTitle = jp.get(0);
            checkBalance = jp.get(1);
            deposit = jp.get(2);
            withdraw = jp.get(3);
            exit = jp.get(4);
        }


        do {
            do {
                System.out.println(langChoice == 2 ? "暗証番号のご入力をお願いします。" : "Enter your PIN: ");
                pin = input.nextInt();
                input.nextLine();

                if (pin != correctPin) {
                    attempts--;
                    if(attempts > 0) {
                        System.out.printf(langChoice == 2 ? "パスワードが間違っています！ 残り試行回数：%d%n%n" : "Wrong password! Attempts remaining: %d%n%n",attempts);
                    } else {
                        System.out.println(langChoice == 2 ? "不正な試行回数が多すぎます。カードが利用停止になりました！" : "Too many incorrect attempts. Card blocked!");
                        return;
                    }
                }
            } while(pin != correctPin);

            System.out.println(langChoice == 2 ? "ログインに成功になりました！\n" : "Login successfully!\n");

            do {
                // Main Menu
                System.out.printf("%n%s%n%s%n%s%n%s%n%s%n",actTitle,checkBalance,deposit,withdraw,exit);
                System.out.print(langChoice == 2 ? "選択肢を入力してください：" : "Enter Choice (1-4): ");
                choice = input.nextInt();
                input.nextLine();

                // Conditional
                switch (choice) {
                    case 1:
                        System.out.printf(langChoice == 2 ? "現在の預金残高は%.0f円%n%n" : "Your current balance is ￥%.0f%n%n",balance);

                        System.out.print(langChoice == 2 ? "エンターキーを押してメニューに戻ってください。" : "Press Enter to return to the menu...");
                        input.nextLine();
                        break;
                    case 2:
                        System.out.print(langChoice == 2 ? "入金金額を入力してください: ￥" : "Enter amount to deposit: ￥");
                        depositAmount = input.nextDouble();
                        if (depositAmount > 0) {
                            balance += depositAmount;
                            System.out.printf(langChoice == 2 ? "入金完了！現在の残高：%.0f円%n%n" : "Deposit successful! New balance: ￥%.0f%n%n",balance);
                        } else {
                            System.out.printf(langChoice == 2 ? "金額が無効です!%n%n" : "Invalid amount!%n%n");
                        }
                        input.nextLine();
                        System.out.print(langChoice == 2 ? "エンターキーを押してメニューに戻ってください。" : "Press Enter to return to the menu...");
                        input.nextLine();
                        break;
                    case 3:
                        System.out.print(langChoice == 2 ? "引き出し金額のご入力お願いします。￥" : "Enter amount to withdraw: ￥");
                        withdrawAmount = input.nextDouble();
                        if (withdrawAmount > 0 && withdrawAmount <= balance) {
                            balance -= withdrawAmount;
                            System.out.printf(langChoice == 2 ? "出金成功！新しい残高：%.0f円%n%n" : "Withdraw successful. New balance: ￥%.0f%n%n",balance);
                        } else {
                            System.out.printf(langChoice == 2 ? "すみません、残高不足なんですが、現在の残高は%.0f円%n%n" : "Insufficient Balance. Your current balance is ￥%.0f%n%n",balance);
                        }
                        input.nextLine();
                        System.out.print(langChoice == 2 ? "エンターキーを押してメニューに戻ってください。" : "Press Enter to return to the menu...");
                        input.nextLine();
                        break;
                    case 4:
                        System.out.println(langChoice == 2 ? "シンプル ATMをご利用いただき、ありがとうございます。さようなら！" : "Thank you for using Simple ATM. Goodbye!");
                        isValidChoice = false;
                        break;
                    default:
                        System.out.println(langChoice == 2 ? "無効な選択です！" : "Invalid choice!");
                        System.out.print(langChoice == 2 ? "\nエンターキーを押して、もう一度お試しください。" : "\nPress Enter to try again...");
                        input.nextLine();
                }

            } while(isValidChoice);

            if (choice != 4) {
                isValidChoice = true;
            }
        } while (choice != 4);

        input.close();

    }

    public static List<String> japaneseLang() {
        String path = "C:\\Users\\DELL\\Documents\\B326\\individual-manite-alexa\\japanese_text.txt";
        return JapaneseFileReader.readFile(path);
    }
}
