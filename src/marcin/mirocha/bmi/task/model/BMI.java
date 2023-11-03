package marcin.mirocha.bmi.task.model;

public class BMI {

    private final String kategoriaBMI;

    private final double kgNaMetrKwadratMin;
    private final double kgNaMetrKwadratMax;

    public BMI(String kategoriaBMI, double kgNaMetrKwadratMin, double kgNaMetrKwadratMax) {
        this.kategoriaBMI = kategoriaBMI;
        this.kgNaMetrKwadratMin = kgNaMetrKwadratMin;
        this.kgNaMetrKwadratMax = kgNaMetrKwadratMax;

    }

    public String transformToString() {
        return "kategoriaBMI: " + this.kategoriaBMI + " " + "kgNaMetrKwadratMin: "
                + this.kgNaMetrKwadratMin + " "
                + "kgNaMetrKwadratMax: " + this.kgNaMetrKwadratMax;
    }

    public String getKategoriaBMI() {
        return kategoriaBMI;
    }

    public double getKgNaMetrKwadratMin() {
        return kgNaMetrKwadratMin;
    }

    public double getKgNaMetrKwadratMax() {
        return kgNaMetrKwadratMax;
    }
}
