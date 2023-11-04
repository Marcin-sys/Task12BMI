package marcin.mirocha.bmi.task.db;


public class BMILastInputRepository {
    private final String[] lastBMITable = new String[10];

    public String[] getLastBMIInputTable() {
        return this.lastBMITable;
    }

    public void saveLastBMIOutput(String BMIInput) {
        int id = 0;
        for (int i = 0; i < 10; i++) {
            if (this.lastBMITable[i] == null) {
                id = i;
                this.lastBMITable[i] = BMIInput;
                System.out.println("Your id is: " + id);
                break;
            }
        }
    }

    public void printAll() {
        for (String element : this.lastBMITable) {
            System.out.println(element);
        }
    }
}
