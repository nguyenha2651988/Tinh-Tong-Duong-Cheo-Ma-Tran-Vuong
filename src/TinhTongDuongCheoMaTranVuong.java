public class TinhTongDuongCheoMaTranVuong {
    public static void main(String[] args) {
        int[][] array = {
                {1, 3, 4, 5},
                {6, 7, 8, 9},
                {4, 5, 4, 3},
                {3, 4, 6, 9}

        };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
