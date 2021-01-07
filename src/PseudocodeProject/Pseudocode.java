package PseudocodeProject;

public class Pseudocode {
    int limit = 4;
    boolean flag = true;
    int counter = 0;
    int[] values;
    public void calc(){
        while(counter < limit){
            if(flag = true){
                flag = false;
                counter = 0;
                limit = limit - 1;
                while(values[counter] < values[counter+1]){
                    int temporary = values[counter];
                    values[counter] = values[counter+1];
                    values[counter+1] = temporary;
                    flag = true;
                }
                counter = counter+1;
            }
            else if( flag = false){
                break;
            }
        }
    }
}
