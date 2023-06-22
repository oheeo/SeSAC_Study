package collection_exercise;

class Data {
    int m;
    public Data(int m) {
        this.m = m;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Data)
            return this.m == ((Data)obj).m;
        else return false;
    }
}

public class Ex05 {
    public static void main(String[] args) {
        Data data1 = new Data(3);
        Data data2 = new Data(3);
        System.out.println(data1 == data2);  // false
        System.out.println(data1.equals(data2));  // true
        System.out.println(data1.hashCode() == data2.hashCode());  // false
        // equals() 는 == 와 동일한 연산 (저장 번지 비교)
        // hashCode() 는 객체가 저장된 번지와 연관된 값 (실제 번지와는 다름)
    }
}
