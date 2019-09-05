public class Main {
    public static void listArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        MoveablePoint moveablePoint = new MoveablePoint(1,2,4, 4);

        System.out.print("getXY of Point: ");
        listArray(point.getXY());
        System.out.println("\nPoint: " + point.toString());

        System.out.print("getSpeed of MovablePoint: ");
        listArray(moveablePoint.getSpeed());
        System.out.println("\nMovablePoint: " + moveablePoint.toString());
    }
}
