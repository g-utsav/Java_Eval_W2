package Question3;

public class OLA {

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger <= 3) {
			HatchBack h = new HatchBack();
			h.setNumberOfPassenger(numberOfPassenger);
			h.setNumberOfKms(numberOfKMs);
			return h;
		}else {
			Sedan s = new Sedan();
			s.setNumberOfKms(numberOfKMs);
			s.setNumberOfPassenger(numberOfPassenger);
			return s;
		}
	}

	public int calculateBill(Car car) {
		int amount;
		if(car instanceof HatchBack) {
			HatchBack h = (HatchBack)car;
			amount = h.farePerKm * h.getNumberOfKms();
		}else {
			Sedan h = (Sedan)car;
			amount = h.farePerKm * h.getNumberOfKms();
			}
		
		return amount;
	}

}
