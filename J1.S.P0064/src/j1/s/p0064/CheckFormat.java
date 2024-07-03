/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0064;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
class CheckFormat {

    static String checkPhoneNumber() {
        //Loop until input value is valid
        while(true) { 
            try {
                String phoneNumber = GetInput.getPhoneNumber();
                int phoneCheck = Integer.parseInt(phoneNumber);
                String result = String.valueOf(phoneCheck);
                //Check input value
                if(phoneNumber.matches("^[0-9]{10}$") && phoneNumber.length() == 10) { 
                    return result;
                } else { 
                    System.out.println("Phone number must be 10 digits");
                }
            } catch (Exception e) {
                System.out.println("Phone number must be number");
            }
        }
    }

    

//    private static final String PHONE_VALID = "^[0-9]{10}$";
//    private static final String EMAIL_VALID = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
//
//    static String checkPhoneNumber() {
//        //Loop until input value is valid
//        while (true) {
//            try {
//                String phonenumber = GetInput.getPhoneNumber();
//                int phoneCheck = Integer.parseInt(phonenumber);
//                String resultCheck = String.valueOf(phoneCheck);
//                //Check input string valid
//                if (phonenumber.matches(PHONE_VALID) && phonenumber.length() == 10) {
//                    return resultCheck;
//                } else {
//                    System.out.println("Phone number must be 10 digits");
//                }
//            } catch (Exception e) {
//                System.out.println("Phone number must be number");
//            }
//        }
//    }
//
//    static String checkEmail() {
//        //Loop until input value is valid
//        while(true) { 
//            String emailCheck = GetInput.getEmail();
//            //Check input email
//            if(emailCheck.matches(EMAIL_VALID)) { 
//                return emailCheck;
//            } else { 
//                System.out.println("Email must be correct format");
//            }
//        }
//    }
//
//    static String checkDate() {
//        //Loop until input value is valid
//        while(true) { 
//            try {
//                String dateCheck = GetInput.getDate();
//                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateCheck);
//                return dateCheck;
//            } catch (ParseException e) {
//                System.out.println("Date to correct format(dd/MM/yyyy)");
//            }
//        }
//    }

    static String checkEmail() {
        //Loop until input string valid
        while(true) {
            String emailCheck = GetInput.getEmail();
            //Check input email
            if(emailCheck.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) { 
                return emailCheck;
            } else { 
                System.out.println("Email must be correct format");
            }
        }
    }

    static String checkDate() {
        //Loop until input date valid
        while(true) {
            try {
                String dateCheck = GetInput.getDate();
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateCheck);
                
                // Check day and month range
                int day = Integer.parseInt(dateCheck.substring(0, 2));
                int month = Integer.parseInt(dateCheck.substring(3, 5));

                if (day >= 1 && day <= 31 && month >= 1 && month <= 12) {
                    return dateCheck;
                } else {
                    System.out.println("Invalid day or month. Please enter a valid date.");
                }

            } catch (ParseException e) {
                System.out.println("Date to correct format(dd/MM/yyyy)");
            } catch (Exception e) { 
                System.out.println("Date to correct format(dd/MM/yyyy)");
            }
        }
    }
    

}
