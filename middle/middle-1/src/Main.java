public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        var searcher = new Searcher();
        var desiredElement = 12;
        var position = searcher.binarySearch(array,desiredElement);
        System.out.println(position);
    }
}