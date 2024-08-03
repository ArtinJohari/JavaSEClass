package mft;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product : ");
        String name = sc.nextLine();

        System.out.print("Enter price : ");
        int price = Integer.parseInt(sc.nextLine());

        if(name.equals("furniture")){
            Furniture furniture = new Furniture();
            System.out.print("Enter weight(kg) : ");
            int weight = Integer.parseInt(sc.nextLine());
            System.out.print("Enter seats : ");
            int seats = sc.nextInt();
            furniture.setName(name);
            furniture.setSeats(seats);
            furniture.setPrice(price);
            furniture.setWeight(weight);
            System.out.println("Product successfully added");
            System.out.println("name : " + furniture.getName());
            System.out.println("seats : " + furniture.getSeats());
            System.out.println("price : " + furniture.getPrice());
            System.out.println("weight : " + furniture.getWeight());
        } else if(name.equals("mobile")){
            Mobile mobile = new Mobile();
            System.out.print("Enter voltage(V) : ");
            int voltage = Integer.parseInt(sc.nextLine());
            System.out.print("Enter screen size(Inch) : ");
            int screenSize = Integer.parseInt(sc.nextLine());
            mobile.setScreenSize(screenSize);
            mobile.setPrice(price);
            mobile.setName(name);
            mobile.setVoltage(voltage);
            System.out.println("Product successfully added");
            System.out.println("voltage : " + mobile.getVoltage());
            System.out.println("screen size : " + mobile.getScreenSize());
            System.out.println("price : " + mobile.getPrice());
            System.out.println("name : " + mobile.getName());
        } else if(name.equals("laptop")){
            Asus asus = new Asus();
            Dell dell = new Dell();
            System.out.print("Enter voltage(V) : ");
            int voltage = Integer.parseInt(sc.nextLine());
            System.out.print("Enter CPU : ");
            String cpu = sc.nextLine();
            System.out.print("Enter RAM : ");
            int ram = Integer.parseInt(sc.nextLine());
            System.out.print("Enter laptop's name : ");
            String laptopName = sc.nextLine();
            if(laptopName.equals("asus")){
                System.out.print("Enter battery type : ");
                String batteryType = sc.nextLine();
                asus.setName(laptopName);
                asus.setPrice(price);
                asus.setCpu(cpu);
                asus.setRam(ram);
                asus.setVoltage(voltage);
                asus.setBattery(batteryType);
                System.out.println("Product successfully added");
                System.out.println("voltage : " + asus.getVoltage());
                System.out.println("name : " + asus.getName());
                System.out.println("price : " + asus.getPrice());
                System.out.println("cpu : " + asus.getCpu());
                System.out.println("ram : " + asus.getRam());
                System.out.println("voltage : " + asus.getVoltage());
                System.out.println("battery : " + asus.getBattery());
            } else if(laptopName.equals("dell")){
                System.out.print("Enter if touch (true/false) : ");
                boolean touch = Boolean.parseBoolean(sc.nextLine());
                dell.setName(laptopName);
                dell.setPrice(price);
                dell.setCpu(cpu);
                dell.setRam(ram);
                dell.setVoltage(voltage);
                dell.setTouch(touch);
                System.out.println("Product successfully added");
                System.out.println("voltage : " + dell.getVoltage());
                System.out.println("name : " + dell.getName());
                System.out.println("price : " + dell.getPrice());
                System.out.println("cpu : " + dell.getCpu());
                System.out.println("ram : " + dell.getRam());
                System.out.println("voltage : " + dell.getVoltage());
                System.out.println("is touch : " + dell.isTouch());

            }
        }


    }
}
