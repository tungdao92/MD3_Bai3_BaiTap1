import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array= {1,2,3,4,5,6,7,8,9};
        boolean found = false;
        System.out.println("Nhập giá trị muốn xóa: ");
        int value = scanner.nextInt();
        System.out.println("Mảng trước khi xóa:");
        for (int k :array){
            System.out.print(k +"\t");
        }
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]){
                found= true;
                System.out.println("Vị trí nằm trong mảng" +i);
                System.arraycopy(array, i +1, array,i,array.length-1-i);
                array[array.length-1]=0;
                System.out.println("Mảng mới:");
                for (int k : array){
                    System.out.print(k+"\t");
                }
            }
        }
        if (!found) System.out.println("Không nằm trong mảng");
    }
}