/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0052;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
class ManageEastAsiaCountries {

    void inputCountry(ArrayList<EastAsiaCountry> listCountry) {
        String code, name, terrain;
        float area;
        //Loop until input string is valid
        while (true) {
            code = GetInput.getString("Enter code of country: ", "CountryCode invalid", "[a-zA-Z ]+");
            //Check duplicate code
            if (isDuplicateCode(code, listCountry)) {
                System.out.println("Duplicate code");
            } else {
                break;
            }
        }
        //Loop until input string invalid
        while (true) {
            name = GetInput.getString("Enter name of country: ", "CountryName invalid", "[a-zA-Z ]+");
            //Check duplicate name
            if (isDuplicateName(name, listCountry)) {
                System.out.println("Duplicate name");
            } else {
                break;
            }
        }
        area = GetInput.getFloat();
        terrain = GetInput.getString("Enter terrain of country: ", "CountryTerrain invalid", "[a-zA-Z ]+");
        EastAsiaCountry country = new EastAsiaCountry(code, name, area, terrain);
        listCountry.add(country);
    }

    void displayCountryJustInput(ArrayList<EastAsiaCountry> listCountry) {
        //Check list is empty
        if (listCountry.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        EastAsiaCountry country = listCountry.get(listCountry.size() - 1);
        System.out.format("%-15s %-15s %-15s %-15s\n", "ID", "Name", "Total Area", "Terrain");
        country.display();
    }

    void searchCountry(ArrayList<EastAsiaCountry> listCountry) {
            String name = GetInput.getString("Enter the name you want to search for: ", "CountryName invalid", "[a-zA-Z ]+");
            List<EastAsiaCountry> list = findCountriesByName(name, listCountry);
            //Check list is empty
            if (listCountry.isEmpty()) {
                System.out.println("Not found");
            } else {
                System.out.format("%-15s %-15s %-15s %-15s\n", "ID", "Name", "Total Area", "Terrain");
                //Loop through all entry in list
                for (EastAsiaCountry eastAsiaCountry : list) {
                    eastAsiaCountry.display();
                
            }
        }
    }

    void sortCountries(ArrayList<EastAsiaCountry> listCountry) {
        List<EastAsiaCountry> listSort = new ArrayList<>();
        listSort.addAll(listCountry);
        // Bubble Sort
        int n = listSort.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                EastAsiaCountry country1 = listSort.get(j);
                EastAsiaCountry country2 = listSort.get(j + 1);
                //Việc hoán đổi được thực hiện bằng cách sử dụng câu lệnh listSort.set(j, country2) và listSort.set(j + 1, country1). 
                //Ở đây, country1 được di chuyển đến vị trí của country2, và country2 được di chuyển đến vị trí của country1, hiệu quả hoán đổi vị trí của họ trong danh sách.
                //country1 đứng sau tên của country2 trong thứ tự từ điển, và chúng cần được hoán đổi vị trí để giữ thứ tự tăng dần.
                if (country1.getCountryName().compareToIgnoreCase(country2.getCountryName()) > 0) {
                    // Swap countries
                    listSort.set(j, country2);
                    listSort.set(j + 1, country1);
                }
            }
        }
        for (EastAsiaCountry eastAsiaCountry : listSort) {
            eastAsiaCountry.display();
        }
    }

    private boolean isDuplicateCode(String code, ArrayList<EastAsiaCountry> listCountry) {
        //Loop through all entry in list
        for (EastAsiaCountry eastAsiaCountry : listCountry) {
            //Check duplicate code
            if (eastAsiaCountry.getCountryCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    private boolean isDuplicateName(String name, ArrayList<EastAsiaCountry> listCountry) {
        //Loop through all entry in list
        for (EastAsiaCountry eastAsiaCountry : listCountry) {
            //Check duplicate name
            if (eastAsiaCountry.getCountryName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    private List<EastAsiaCountry> findCountriesByName(String name, ArrayList<EastAsiaCountry> listCountry) {
        name = name.toUpperCase();
        List<EastAsiaCountry> listFound = new ArrayList<>();
        for (EastAsiaCountry eastAsiaCountry : listCountry) {
            //Check found country
            if (eastAsiaCountry.getCountryName().toUpperCase().contains(name)) {
                listFound.add(eastAsiaCountry);
            }
        }
        return listFound;
    }

}
