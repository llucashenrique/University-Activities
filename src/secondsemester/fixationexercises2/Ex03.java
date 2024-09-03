package secondsemester.fixationexercises2;

public class Ex03 {
    public static void main(String[] args) {
        int greenCars = 0;
        int carBefore2020 = 0;
        int onixCAr = 0;
        int carTotal = 0;

        Ex03Obj car1 = new Ex03Obj("Camaro", 2023, "Blue", "BRA2E19");
        Ex03Obj car2 = new Ex03Obj("Fusca", 2024, "Green", "BRA2E19");
        Ex03Obj car3 = new Ex03Obj("Onix", 2019, "Brow", "BRA2E19");
        Ex03Obj car4 = new Ex03Obj("Mustang", 2020, "Red", "BRA2E19");
        Ex03Obj car5 = new Ex03Obj("Prisma", 2018, "Pink", "BRA2E19");

        Ex03Obj[] cars = {car1, car2, car3, car4, car5};

        for (Ex03Obj car : cars) {
            if (car.getColor().equalsIgnoreCase("Green")) {
                greenCars++;
            }
            if (car.getYearOfManufacture() < 2020) {
                carBefore2020++;
            }
            if (car.getModel().equalsIgnoreCase("Onix")) {
                onixCAr++;
            }
            carTotal++;
        }
        double percentageOnix = (carTotal > 0) ? (onixCAr * 100 / carTotal) : 0.0;
        double percentageBefore2020 = (carTotal > 0) ? (carBefore2020 * 100 / carTotal) : 0.0;
        double percentageGreen = (carTotal > 0) ? (greenCars * 100.0 / carTotal) : 0.0;

        System.out.println("Quantidade de carros verde: " + greenCars);
        System.out.println("Percentual de carros verdes: " + percentageGreen + "%");
        System.out.println("---------------------------------");

        System.out.println("Quantidade de carros fabricados antes de 2020: " + carBefore2020);
        System.out.println("Percentual de carros antes de 2020: " + percentageBefore2020 + "%");
        System.out.println("--------------------------------");

        System.out.println("Quantidade de carros onix: " + onixCAr);
        System.out.println("Percentual de carros onix: " + percentageOnix + "%");


    }
}
