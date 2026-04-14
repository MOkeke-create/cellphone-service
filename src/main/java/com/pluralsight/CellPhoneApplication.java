package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        getCellphoneData(cellPhone);
        displayCellPhone(cellPhone);
        dialCellPhone(cellPhone);



    }

    private static void displayCellPhone(CellPhone cellPhone) {
        System.out.print("Serial number: " + cellPhone.getSerialNumber());
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

    private static void dialCellPhone(CellPhone cellPhone){
        System.out.print("Enter number you want to dial: ");
        cellPhone.setPhone2(scanner.nextLine());
        System.out.println(cellPhone.getOwner() + " is calling " + cellPhone.getPhone2());
    }
}
