package StopWatch;

public class Main {

	public static void main(String[] args) {
		StopWatch sW = new StopWatch();
        double arr[] = new double[100000];
        for (int i = 0;i< arr.length;i++){
            arr[i] = Math.random()*1000;
        }
        sW.start();
        selectionSort(arr);
        sW.stop();
        System.out.println("Execution time (miliseconds): " + sW.getElapsedTime());

	}
    public static void swap(double num1, double num2) {
        double temp = num1;
        num1 = num2;
        num2 = temp;
    }

    public static void selectionSort(double arr[]) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;

            swap(arr[min], arr[i]);
        }
    }

}
