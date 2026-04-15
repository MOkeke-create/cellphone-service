package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        getCellphoneData(cellPhone1);
        displayCellPhone(cellPhone1);
        getCellphoneData(cellPhone2);
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());





    }

    private static void displayCellPhone(CellPhone cellPhone) {
        System.out.println("Serial number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getiPhoneModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone number " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());
    }

    private static void getCellphoneData(CellPhone cellphone) {
        System.out.print("Enter the serial number: ");
        cellphone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter model: ");
        cellphone.setiPhoneModel(scanner.nextLine());
        System.out.print("Enter the carrier: ");
        cellphone.setCarrier(scanner.nextLine());
        System.out.print("Enter phone number: ");
        cellphone.setPhoneNumber(scanner.nextLine());
        System.out.print("Enter owner name: ");
        cellphone.setOwner(scanner.nextLine());
    }



}
