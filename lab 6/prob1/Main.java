 class Main
{
	public static void main(String[] args) {
	    Offering offering = new Coffee();
	    offering = new Rum(offering);
	    
		System.out.println(offering.getName()+ " "+offering.getPrice());
		Offering offering1 = new Tea();
		offering1 =new Gin(offering1);
		System.out.println(offering1.getName()+ " "+offering1.getPrice());
		
	}
}
