/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.math.BigInteger;

/**
 *
 * @author admin
 */
class ChangeBase {

    String convertValue(String InputData, int valueInput, int ValueOuput) {
        String result = "";
        switch(valueInput){
            case 1:
                result = ConvertBinaryToOrther(InputData, ValueOuput);
                break;
            case 2:
                result = ConvertDecimalToOrther(InputData, ValueOuput);
                break;
            case 3:
                result = convertHexaToOrther(InputData, ValueOuput);
                break;
        }
        return result;
    }

    private String ConvertBinaryToOrther(String valueInput, int ValueOuput) {
        StringBuilder sb = new StringBuilder();
        BigInteger remainder;
        BigInteger value = new BigInteger(valueInput);
        BigInteger base= new BigInteger(Integer.toString(ValueOuput));
        // loop until value=0, after each loop we have a char to add to sb 
        while (!value.equals(new BigInteger("0"))){
            // if the base is 2
            if (ValueOuput==1){
                sb.append(value.remainder(base));
            }
            // if the base is 16
            else {
                remainder= value.remainder(base);
                // if the remainder is smaller than 10
                if (remainder.intValue()<10) sb.append(remainder);
                // if the remainder is bigger than 10
                else {
                    sb.append((char)((int)'A'-10+remainder.intValue()));
                }
            }
            value = value.divide(base);
        }
        return sb.reverse().toString();
    }

    private String ConvertDecimalToOrther(String valueInput, int ValueOuput) {
        BigInteger count = new BigInteger("1");
        BigInteger value = new BigInteger("0");
        BigInteger base = new BigInteger("2");
        // loop from the end to the begin of the inputvalue
        for (int i= valueInput.length()-1;i>=0;i--){
            BigInteger remainter =  new BigInteger(String.valueOf(valueInput.charAt(i)));
            value = value.add(remainter.multiply(count));
            count=count.multiply(base); 
        }
        String result= String.valueOf(value);
        // if outputbase is 10 we have the result equal result variable
        if (ValueOuput==2) return result;
        // if outputbase is 16 we need to wus method convertDec to convert result
        else return ConvertDecimalToOrther(result,3);
    }

    private String convertHexaToOrther(String valueInput, int ValueOuput) {
        BigInteger count = new BigInteger("1");
        BigInteger value = new BigInteger("0");
        BigInteger digit = new BigInteger("0");
        BigInteger base = new BigInteger("16");
        // loop from the end to the begin of the inputvalue
        for (int i= valueInput.length()-1;i>=0;i--){
            // check if inputvalue[i] is a number from 0 to 9;
            if (Character.getNumericValue(valueInput.charAt(i))<10){
               BigInteger remainter =  new BigInteger(String.valueOf(valueInput.charAt(i)));
               value = value.add(remainter.multiply(count));
            }
            // check if inputvalue[i] is from A to F
            else {
                switch(valueInput.charAt(i)){
                    case 'A':
                        digit = new BigInteger("10");
                        break;
                    case 'B':
                        digit = new BigInteger("11");
                        break;
                    case 'C':
                        digit = new BigInteger("12");
                        break;
                    case 'D':
                        digit = new BigInteger("13");
                        break;
                    case 'E':
                        digit = new BigInteger("14");
                        break;
                    case 'F':
                        digit = new BigInteger("15");
                        break;
                }
                value = value.add(digit.multiply(count));
            }
            count=count.multiply(base);
        }
        String result= String.valueOf(value);
        //if outputbase is 10 we have the result equal result variable
        if (ValueOuput==2) return result;
        // if outputbase is 2 we need to use method convertDec to convert result 
        else return ConvertDecimalToOrther(result,1);
    }     
}
