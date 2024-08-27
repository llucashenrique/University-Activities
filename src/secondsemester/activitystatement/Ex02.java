package secondsemester;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee[] employees = new Employee[4];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Funcionário " + (i + 1) + ":");

            Employee employee = new Employee();

            System.out.print("Digite o nome: ");
            String name = input.nextLine();
            employee.setName(name);

            System.out.print("Digite a idade: ");
            int age = input.nextInt();
            input.nextLine();
            employee.setAge(age);

            System.out.print("Em qual estado você vive? ");
            String address = input.nextLine();
            employee.setAddress(address);


            employees[i] = employee;
        }

        int countInState = 0;
        int countOutOfState = 0;
        int countAbove60 = 0;

        for (Employee employee : employees) {
            if (employee.getAddress().equalsIgnoreCase("SP")) {
                countInState++;
            } else {
                countOutOfState++;
            }

            if (employee.getAge() >= 60) {
                countAbove60++;
            }
        }

        System.out.println("Número de motoristas que residem no estado (SP): " + countInState);
        System.out.println("Número de motoristas que residem fora do estado (SP): " + countOutOfState);
        System.out.println("Número de motoristas com idade acima de 60 anos: " + countAbove60);

        input.close();
    }

    static class Employee {
        private String name;
        private int age;
        private String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}

