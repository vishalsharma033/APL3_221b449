abstract class Beverage{
    void pour (int qty)
    {
        System.out.println("pour"+qty+"ml of bevarage");
    }
    abstract void add_condiment();
    protected void stir()
    {};
    private void serve(){
        System.out.println(" serve through waiter");
    }
    public void templatemethod(int qty)
    {
        pour(qty);
        add_condiment();
        stir();
        serve ();
    }
}