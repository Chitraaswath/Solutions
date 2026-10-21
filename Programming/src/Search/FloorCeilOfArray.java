package Search;
// Find the floor and ceil of a number
// if the key matches the element in an array then floor and ceil will be the same as the key
// if the key doesn't match floor will be immediate smaller element and ceil will be immediate greater element
public class FloorCeilOfArray {

    public static void main(String[] args) {
        int ar[] = { 134, 393, 508, 109, 100, 12, 199 };
        int key = 500;
        String  floor = findCeilFloor(ar, key);
        System.out.print("Floor and Ceil of " + key + " is : " + floor);
    }

    private static String findCeilFloor(int[] ar, int key) {
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;
        String ceilFloor = "";
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == key) {
                floor = ar[i];
                ceil = ar[i];
                break;
            }
            if (ar[i] < key && ar[i] > floor) {
                floor = ar[i];
            }
            if (ar[i] > key && ar[i] < ceil) {
                ceil = ar[i];
            }
        }
        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil );
        ceilFloor = "Floor : " + floor + " Ceil : " + ceil;
        return ceilFloor;
    }
}
