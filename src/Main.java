import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 8, 9, 6, 10, 7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập sô cần xóa: ");
        int number = sc.nextInt();
        boolean flag = false;
        int doDai = array.length;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.println("Sô này năm trong mảng ở vị trí: " + i);
                flag = true;
                array[i] = array[i+1];
            }
        }
        if (!flag) {
            System.out.println("Số này không nằm trong mảng");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "-----" + array[i]);

        }
    }

}

