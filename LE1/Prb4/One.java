
class One {
    One(int x) {
        System.out.println("One's constructor: " + x);
    }
}

class Two extends One {
    Two(int x) {
        super(x);  
        System.out.println("Two's constructor");
    }
}
