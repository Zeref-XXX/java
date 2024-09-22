// array initialization

public class test {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 7, 3, 1, 0};
        int b[] = new int[10];
        b =new int[]{1,4,5,7,89,4,2,1,2};
        int c[];
        int[] d;
        int[] e;
        int[] f = new int[3];
        // for loop
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i] + " ");
        // }
        // //for each loop
        // for (int i : a) {
        //     System.out.println(" a[" + (i + 1) + "] " + i);
        // }
        //b array
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]++ +" ");
        }
        System.out.println(" changed ");
        //changes made in b[i]++
        for(int i:b){
            System.out.println(i);
        }
    }
}
