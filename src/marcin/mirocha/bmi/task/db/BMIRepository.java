package marcin.mirocha.bmi.task.db;

import marcin.mirocha.bmi.task.model.BMI;

public class BMIRepository {
    private final BMI[] bmisTable = new BMI[8];

    public BMIRepository() {
        this.bmisTable[0] = new BMI("Wygłodzenie",0,16);
        this.bmisTable[1] = new BMI("Wychudzenie",16,17);
        this.bmisTable[2] = new BMI("Niedowaga",17,18.5);
        this.bmisTable[3] = new BMI("Pożądana masa ciała",18.5,25);
        this.bmisTable[4] = new BMI("Nadwaga",25,30);
        this.bmisTable[5] = new BMI("Otyłość I stopnia",30,35);
        this.bmisTable[6] = new BMI("Otyłość II stopnia (duża)",35,40);
        this.bmisTable[7] = new BMI("Otyłość III stopnia (chorobliwa)",40,1000);
    }


    private BMI findBMI(String categoryBMI) {
        for (BMI bmi : this.bmisTable) {
            if (bmi.getKategoriaBMI().equals(categoryBMI)){
                return bmi;
            }
        }
        return null;
    }

    public BMI[] getBmisTable() {
        return bmisTable;
    }
}
