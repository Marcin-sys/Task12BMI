package marcin.mirocha.bmi.task.gui;

import marcin.mirocha.bmi.task.model.BMI;

import java.util.Scanner;

public class GUI {

        private final Scanner scanner;

    private double weight = 1;
    private double height = 1;

    private double calculatedBMI = 0;

        public GUI() {
            this.scanner = new Scanner(System.in);
        }

        public String showMenuAndReadChoose() {
            System.out.println("1. Oblicz BMI");
            System.out.println("2. Przypomnij BMI");
            System.out.println("3. Exit");
            String input = this.scanner.nextLine();
            System.out.println("What did you chose: " + input);
            return input;
        }

        public double calculateBMI(){
            System.out.println("Write your body weight [kg]: ");
            this.weight = this.scanner.nextDouble();
            System.out.println("Write your body height [m]: ");
            this.height = this.scanner.nextDouble();
            while (this.height > 3){
                System.out.println("Your height cannot be more then 3 meters, write again your height [m]: ");
                this.height = this.scanner.nextDouble();
            }
            double sumHeight = this.height * this.height;

            this.calculatedBMI = this.weight/sumHeight;
            System.out.println("Your BMI is: " + this.calculatedBMI );
            return this.calculatedBMI;
        }

        public String getCategoryBMI(double calculatedBMI,BMI[] bmisTable){
            String categoryBMI = "";
            for (BMI bmi : bmisTable){
                if (calculatedBMI > bmi.getKgNaMetrKwadratMin()
                        && calculatedBMI < bmi.getKgNaMetrKwadratMax()){
                    categoryBMI = "Your BMI category is: " + bmi.getKategoriaBMI();

                    break;
                }
            }
            return categoryBMI;
        }

        public void getBMIUsingID (String [] inputBMITable){
            System.out.println("Write your id: ");
            int id = scanner.nextInt();
            System.out.println(inputBMITable[id]);
        }

        public String saveInput(BMI[] bmisTable){
            return "Weight Parameter was: " + this.weight +
                    " Height parameter was: " + this.height +
                    " Your BMI was: " + this.calculatedBMI+
                    " " + getCategoryBMI(this.calculatedBMI,bmisTable);
        }


        public void exitShop() {
            System.out.println("See you again");
        }

        public void showWrongChoose() {
            System.out.println("Wrong choose!!");
        }


}
