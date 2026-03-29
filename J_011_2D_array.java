public class J_011_2D_array {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{11}, {22,22}, {33,33,33}};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}