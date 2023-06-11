package study;

public class _02_Operator {

    public static void main(String[] args) {
//		// 삼항 연산자
//		int x = 3;
//		int y = 5;
//		int max = (x>y)? x:y;
//		System.out.println(max);
//
//		int min = (x<y)? x:y;
//		System.out.println(min);
//
//		// 삼항 연산자는 if-else 제어문으로 변경 가능
//		int m;
//		if(3>5) {
//		m = 3;
//		} else {
//		m = 5;
//		}
//		System.out.println(m);
//

//		// 제어문

//		int a=85;
//		if(a>=90) {
//			System.out.println("A학점");
//		}
//		else if(a>=80) {
//			System.out.println("B학점");
//		}
//		else if(a>=70) {
//			System.out.println("C학점");
//		}
//		else {
//			System.out.println("F학점");
//		}


        // for 제어문

//		int i;
//		for(i=0; i<3; i++) {
//			System.out.println(i);
//		}
        // 값 0 1 2

//		int i;  // 이거 주석 안 하면 오류남
//		for(int i=0; i<3; i++) {
//			System.out.println(i);
//		}
        // 값 0 1 2

//		for(int i=0; i<100; i++) {
//			System.out.println(i);
//		}
        // 값 0 1 2 ... 99

//		for(int i=10; i>0; i--) {
//			System.out.println(i);
//		}
        // 값 10 9 8 7 6 5 4 3 2 1

//		for(int i=0; i<10; i+=2) {
//			System.out.println(i);
//		}
        // 출력 0 2 4 6 8

//		for(int i=0,j=0; i<10; i++,j++) {
//			System.out.println(i+j);
//		}
        // 출력  0 2 4 6 8 10 12 14 16 18

//		for(int i=0; ; i++) {
//			if(i>10) {
//				break;
//			}
//			System.out.println(i+" ");
//		}
        // 출력 0 1 2 3 4 5 6 7 8 9 10


        // 구구단 세 열로 출력
//		for (int i=1; i<10; i++) {
//			for (int j=1; j<4; j++) {
//				System.out.print(j + "x" + i + "=" + i*j);
//			    System.out.print("\t");
//			}
//			System.out.println();
//		}
//
//		System.out.println();
//
//		for (int i=1; i<10; i++) {
//			for (int j=4; j<7; j++) {
//				System.out.print(j + "x" + i + "=" + i*j);
//			    System.out.print("\t");
//			}
//			System.out.println();
//		}
//
//		System.out.println();
//
//		for (int i=1; i<10; i++) {
//			for (int j=7; j<10; j++) {
//				System.out.print(j + "x" + i + "=" + i*j);
//			    System.out.print("\t");
//			}
//			System.out.println();
//		}

        System.out.println("------------------------");

        for (int i=1; i<=9; i=i+3) {
            for (int j=1; j<=9; j++) {
                for (int k=i; k<i+3 && k<10; k++) {
                    System.out.print(k + "*" + j  + "=" + (j*k)+"\t");
                    System.out.print("<-k값"+ "*" +"j값"+"\t"+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
