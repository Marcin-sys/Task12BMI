package marcin.mirocha.bmi.task;

import marcin.mirocha.bmi.task.db.BMILastInputRepository;
import marcin.mirocha.bmi.task.db.BMIRepository;
import marcin.mirocha.bmi.task.gui.GUI;

public class App {
    public static void main(String[] args) {
        BMIRepository bmiDatabase = new BMIRepository();
        GUI gui = new GUI();
        BMILastInputRepository submittingRepository = new BMILastInputRepository();


        boolean loop = true;
        while (loop) {

            switch (gui.showMenuAndReadChoose()) {
                case "1":  //Oblicz BMI.
                    double BMI = gui.calculateBMI();
                    String categoryBMI = gui.getCategoryBMI(BMI, bmiDatabase.getBmisTable());
                    System.out.println(categoryBMI);
                    String stringInputBMI = gui.saveInput(bmiDatabase.getBmisTable());
                    submittingRepository.saveLastBMIOutput(stringInputBMI);
                    break;
                case "2": //Przypomnij BMI.
                    gui.getBMIUsingID(submittingRepository.getLastBMIInputTable());
                    break;
                case "3": //Exit.
                    gui.exitShop();
                    loop = false;
                    break;
                default:
                    gui.showWrongChoose();
                    break;
            }
        }
    }
}
