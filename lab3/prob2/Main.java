interface Testable {
    void display();
}


class Test implements Testable {
    @Override
    public void display() {
        System.out.println("This is a test display method.");
    }
}


abstract class AbsTest implements Testable {
    
}

public class Main {
    public static void main(String[] args) {
        
        Test testObj = new Test();
        testObj.display();

        
    }
}
