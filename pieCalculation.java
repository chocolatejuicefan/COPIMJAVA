public class pieCalculation {
    public static void main(String[] args) {
        int pies = 10, people = 4;
        double piesPerPerson;
        piesPerPerson =  pies / people; // int/int = int
        System.out.println(piesPerPerson);
        piesPerPerson = (double) pies / people;
        System.out.println(piesPerPerson);
    }

}
