public class Main {
    public static void main(String[] args) {
        Class class1=new Class(22,"Java",new int [] {1,2,3,5,7,3});
        System.out.println(class1.getNumber());
        System.out.println(class1.getWord());
        for (int i = 0; i < class1.getArray().length; i++) {
            System.out.print(class1.getArray()[i]+"");
        }


    }
}