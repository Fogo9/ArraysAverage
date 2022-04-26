public class ArraysAverage{
    
    public static void main(String[] args) {

        int[] list = {55, 25, 40, 65, 70, 35};

        double sum = 0;

        double sum1 = 0.0;


        for(int i = 0; i < list.length; i++){

            sum += list[i];

        }

        System.out.println("Average : " + sum / list.length);
        

        for(int i = 1; i <= list.length; i++){

            sum1 += (1.0 / i);


        }

        System.out.println("Harmonic Average : " + sum1);






    }
}
