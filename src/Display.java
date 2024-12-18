public class Display {
    public static void main(String[] args) {
        int marks = 30;

        if(marks > 90){
            System.out.println("Resultado excelente");
        } else if (marks < 90 && marks >= 75) {
            System.out.println("Bom resultado");
            
        } else if (marks < 75 && marks > 40) {
            System.out.printf("Resultado regular");
        } else {
            System.out.println("Resultado ruim");
        }
    }

}

