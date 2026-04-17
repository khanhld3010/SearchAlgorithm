//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[] myArray = {42, 17, 89, 5, 23, 76, 11, 94, 38, 50};
    Arrays.sort(myArray);
    System.out.println(Arrays.toString(myArray));
    BinarySearchRecursion binarySearchRecursion = new BinarySearchRecursion();
    System.out.println(binarySearchRecursion.binarySearch(myArray, 0, myArray.length - 1, 89));
}
