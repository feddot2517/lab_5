public class Main {
    public static void main(String[] args) {
        Array abc = new Array();
        abc.createArray();
        for (int i = 0; i < 10; i ++ ) {
            System.out.printf(abc.strList.get(i) + " ");
        }
        System.out.println(" ");
        Name abcd = new Name();
        abcd.mapping();
        abcd.out(10);
        abcd.outall();
	
    }
}


