


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HumanBMI humanBMI = new HumanBMI(50, 1.52);
        System.out.println(humanBMI.getResult());
    }
}
class HumanBMI  {
    public double weight; //Weight Human
    public double height; // Height Human
    private static double bmi;
    public HumanBMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.bmi = calculateBMI();
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
        this.bmi = calculateBMI();
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
        this.bmi = calculateBMI();
    }
    private double calculateBMI() {
        return weight / (height * height);
    }
    public double getBmi() {
        return bmi;
    }
    public String getResult() {
        if (bmi < 18.5) {
            return "Deficit";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Norm";
        } else if (bmi >= 25 && bmi < 30) {
            return "Warning!";
        } else {
            return "Fat";
        }
    }

}