public class TimeTest {


    public static void main(String[] args) {
        int n=10000;
        long startTime=System.currentTimeMillis();
        int numberOfOperation=0;

        for (int i=1;i<=n;i++){
            for (int j = 1; j <=n; j++) {
                numberOfOperation++;
            }
        }
        long endTime=System.currentTimeMillis();
        System.out.println("Number of operations is= " +numberOfOperation+ " in " +(endTime-startTime)+" milliseconds");

    }
}
