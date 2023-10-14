package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if( first < second){
            first = second;
        }
        System.out.println(first > third ? first : third);
    }
}
