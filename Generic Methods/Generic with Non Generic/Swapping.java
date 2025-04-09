class Swapping{
    static<T> void display(T arr[], int a, int b){
        System.out.println("before swapping:");
        for(T i: arr) System.out.println(i);
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println("after swapping:");
        for(T i: arr) System.out.println(i);
    }
    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3, 4, 5};
        String str[] = {"A", "B", "C", "D", "E"};
        display(arr, 0, 1); // Swapping integers
        display(str, 0, 1); // Swapping strings
    }
}