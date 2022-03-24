package application;

import java.util.ArrayList;

public class MySQL extends DBHandler {

	@Override
	public void RecordSale(Sale sale) {
		

	}

	@Override
	public ArrayList<MedicineDescription> viewCatalog() {

		medicineCatalog = new ArrayList<MedicineDescription>();
		MedicineDescription list = new MedicineDescription("Paracetamol", 1,
				"basic", "PainReliever", 100);
		medicineCatalog.add(list);
		return medicineCatalog;

	}

	@Override
	public void AddMedicine(int medicineID, int qty) {


	}

	@Override
	public void RemoveMedicine(int medicineID, int qty) {
		

	}

	@Override
	public void AddMedicineHistory(int managerId, int medicineID, int quantity, String type) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public Receipt GenerateReceipt(Sale sale) {
		

		return null;
	}

	@Override
	public ArrayList<Medicine> getAllMedicines() {


		MedicineDescription list = new MedicineDescription("Paracetamol", 1,
				"basic", "PainReliever", 100);
		Medicine list2 = new Medicine();
		list2.setMedicinedescription(list);
		list2.setID(list.getID());
		AllMedicines.add(list2);
		return AllMedicines;
	}

	@Override
	public SalesPerson getSalesPerson(String UserName, String Password) {
		
		SalesPerson salesperson = new SalesPerson();

		salesperson.setName("Wasay");
		salesperson.setPassword("1234");
		
		return salesperson;

	}

	@Override
	public Manager getManager(String UserName, String Password) {

		Manager manager = null;
		manager = new Manager();

		manager.setManagername("Waqas");
		manager.setManagerPassword("1234");
		return manager;

	}

	@Override
	public ArrayList<String> getSaleRecord(String from, String to) {
		
		return null;
	}

	@Override
	public void saveSalesPerson(SalesPerson salesperson) {
	
	}

}
