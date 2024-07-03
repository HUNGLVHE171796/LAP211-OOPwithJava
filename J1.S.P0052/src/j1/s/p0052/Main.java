/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0052;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        ManageEastAsiaCountries manage = new ManageEastAsiaCountries();
        ArrayList<EastAsiaCountry> listCountry = new ArrayList<>();
        while (true) {
            //Step1: Display a menu
            displayMenu();
            //Step2: Enter an choice
            int choice = GetInput.inputChoice();
            switch (choice) {
                //Perform selected option
                //Step3: Input the information of 11 countries
                case 1:
                    manage.inputCountry(listCountry);
                    break;
                //Step4: Display information of country just input
                case 2:
                    manage.displayCountryJustInput(listCountry);
                    break;
                //Step5: Search information of countries by user-entered name
                case 3:
                    manage.searchCountry(listCountry);
                    break;
                //Step6: Display list countries sorted name ascending
                case 4:
                    manage.sortCountries(listCountry);
                    break;
                //Step7: Exit program
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("                                MENU                     ");
        System.out.println("=========================================================================");
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending order");
        System.out.println("5. Exit");
        System.out.println("=========================================================================");
    }
}
