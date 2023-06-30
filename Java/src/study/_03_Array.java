package study;

public class _03_Array {
    // 1차원 배열
    public static void main(String[] args) {
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = (i+3);
            System.out.println(a[i]);
        }

        // 이렇게도 가능
        int[] b = new int[3];
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] = (i+3));
        }

        System.out.println("-----------");

//        int c = 0;
//        int[] d = null;
//        System.out.println(c);
//        System.out.println(d);

        System.out.println("-----------");

        // 기본자료형의 변수 복사 : 값의 복사
        int e = 3;
        int f = e;
        f = 7;
        System.out.println(e);  // 3
        System.out.println(f);  // 7

        // 참조자료형의 변수 복사 : 위치(번지) 복사
        int[] g = {3, 4, 5};
        int[] h = g;
        h[0] = 7;
        System.out.println(g[0]);  // 7
        System.out.println(h[0]);  // 7
//
        System.out.println("-----------");
//
//        int[] aa = new int[100];
//        int i = 0;
//        for (int k: aa) {
//            aa[k] = i;
//            System.out.println(aa[k]);
//            i++;
//        }

        System.out.println("-----------");
        
        // 2차원 배열
        int[][] numsArr = new int[2][];
        int[] nums1 = new int[5];
        int[] nums2 = new int[15];

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = i+1;
        }

        for(int i = 0; i < nums2.length; i++){
            nums2[i] = i+6;
        }

        numsArr[0] = nums1;
        numsArr[1] = nums2;

        for(int[] arr : numsArr){
            for(int n : arr){
                System.out.print(n + " ");
            }
            System.out.println();
        }

        System.out.println("-----------");

        // 다른 방법
        int[][] c = new int[2][];
        c[0] = new int[5];
        c[1] = new int[15];

        int k=1;
        for(int i[] : c) {
            for(int j:i) {
                i[j] = k++;
                System.out.print(i[j]+" ");
            }
            System.out.println();
        }

    }
}