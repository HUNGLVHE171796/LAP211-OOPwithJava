/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0055;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
class Manager {

    static void addDoctor(ArrayList<Doctor> ld) {
        String code;
        //check code exist or not
        while (true) {
            code = GetInput.getString("Enter code: ");
            if (isCodeExist(ld, code)) {
                System.out.println("Duplicate code");
            } else {
                break;
            }
        }
        String name = GetInput.getString("Enter name: ");
        String specialization = GetInput.getString("Enter specialization: ");
        int availability = GetInput.getInteger();
        //check worker duplicate

        ld.add(new Doctor(code, name, specialization, availability));
    }

    static void updateDoctor(ArrayList<Doctor> ld) {
        String code = GetInput.getString("Enter code: ");
        if (!isCodeExist(ld, code)) {
            System.out.println("Not found doctor");
            return;
        }
        String codeUpdate = GetInput.getString("Enter code: ");
        Doctor doctor = getDoctorByCode(ld, code);
        String name = GetInput.getString("Enter name: ");
        String specialization = GetInput.getString("Enter specialization: ");
        int availability = GetInput.getInteger();
        //check user change infomation or not
//        if (checkChangeInfo(doctor, code, name, specialization, availability)) {
//            System.out.println("No change");
//            return;
//        }

        //Check user change information or not
        if(CheckChangeInfo(doctor, code, name, specialization, availability)) {
            System.out.println("No change infomation");
            return;
        }
        doctor.setCode(codeUpdate);
        doctor.setName(name);
        doctor.setSpecialization(specialization);
        doctor.setAvailability(availability);
    }

    static void deleteDoctor(ArrayList<Doctor> ld) {
        while (true) {
            String code = GetInput.getString("Enter code: ");
            Doctor doctor = getDoctorByCode(ld, code);
            if (doctor == null) {
                System.out.println("Not found doctor.");
            } else {
                ld.remove(doctor);
                return;
            }
        }
    }

    static void searchDoctor(ArrayList<Doctor> ld) {
        while (true) {
            String nameSearch = GetInput.getString("Enter name: ");
            ArrayList<Doctor> listFoundByName = listFoundByName(ld, nameSearch);
            if (listFoundByName.isEmpty()) {
                System.out.println("Doctor not found");
            } else {
                System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                        "Specialization", "Availability");
                for (Doctor doctor : listFoundByName) {
                    System.out.printf("%-10s%-15s%-25s%-20d\n", doctor.getCode(),
                            doctor.getName(), doctor.getSpecialization(),
                            doctor.getAvailability());
                }
                return;
            }
        }
    }

    private static boolean isCodeExist(ArrayList<Doctor> ld, String code) {
        for (Doctor doctor : ld) {
            if (code.equalsIgnoreCase(doctor.getCode())) {
                return true;
            }
        }
        return false;
    }

    private static Doctor getDoctorByCode(ArrayList<Doctor> ld, String code) {
        for (Doctor doctor : ld) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return doctor;
            }
        }
        return null;
    }

    private static boolean checkChangeInfo(Doctor doctor, String code, String name, String specialization, int availability) {
        if (doctor.getCode().equalsIgnoreCase(code)
                && doctor.getName().equalsIgnoreCase(name)
                && doctor.getSpecialization().equalsIgnoreCase(specialization)
                && doctor.getAvailability() == availability) {
            return true;
        }
        return false;
    }

    private static ArrayList<Doctor> listFoundByName(ArrayList<Doctor> ld, String nameSearch) {
        ArrayList<Doctor> listFoundByName = new ArrayList<>();
        for (Doctor doctor : ld) {
            if (doctor.getName().contains(nameSearch)) {
                listFoundByName.add(doctor);
            }
        }
        return listFoundByName;
    }

    private static boolean CheckChangeInfo(Doctor doctor, String code, String name, String specialization, int availability) {
        if(doctor.getCode().equalsIgnoreCase(code) 
                && doctor.getName().equalsIgnoreCase(name)
                && doctor.getSpecialization().equalsIgnoreCase(specialization)
                && doctor.getAvailability() == availability) { 
            return true;
        }
        return false;
    }

}
