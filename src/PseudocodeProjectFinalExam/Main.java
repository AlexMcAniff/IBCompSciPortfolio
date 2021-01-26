package PseudocodeProjectFinalExam;

public class Main {

    public void start(){
        int[] numbers = {6,9,420};
        int current = numbers[0];
        int[] three = new int[0];
        int threePosition = 0;
        for (int i = 0; i < numbers.length; i++) {
            current = numbers[i+1];
            if (current >= 100 && current <= 999){
                if(current/100 < current%100 && current%100 < current%10 ){
                    three[threePosition] = current;
                    threePosition = threePosition + 1;

                }
            }
        }
        if(three == null){
            System.out.println("No Such Numbers");
        }
    }
}
