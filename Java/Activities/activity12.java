package activities;
interface addable{
    int add(int a,int b);
}


public class activity12 {
    public static void main(String[] args) {
        // Lambda expression without return keyword.
        addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Lambda expression with return keyword.
        addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(100, 200));
        }

    }



