/**
 * 
 */
/**
 * @author Dad
 *
 */
package pkgEmpty;
public class testRetirement{
	public static void main(String[] args) {
		int iYearsToWork = 40;
		double dAnnualReturnWorking=0.07;
		int iYearsRetired = 20;
		double dAnnualReturnRetired = 0.02;
		double dRequiredIncome = 10000;
		double dMonthlySSI = 2642;
		Retirement = new Retirement()
	
				@Test 
				public void testSetiYearsToWork() {
				  System.out.println("setiYearsToWork");
				  int iYTW= 40;
				  iYearsToWork instance = new iYearsToWork();
				  assertEquals(instance.getiYearsToWork(), iYTW));
				}
				@Test
				public void testGetiYearsToWork() {
				  System.out.println("getiYearsToWork");
				  iYearsToWork instance = new iYearsToWork();
				  int iYTW=40;
				  instance.setiYearsToWork(40);
				  int years = instance.getiYearsToWork();
				  assertEquals(iYTW, years);
				}

				@Test
				public void testSetdAnnualReturnWorking() {
				  System.out.println("setdAnnualReturnWorking");
				  int dARW= 0.07;
				  dAnnualReturnWorking instance = new dAnnualReturnWorking();
				  assertEquals(instance.getdAnnualReturnWorking(), dARW));
				}

				@Test
				public void testGetdAnnualReturnWorking() {
				  System.out.println("getdAnnualReturnWorking");
				  dAnnualReturnWorking instance = new dAnnualReturnWorking();
				  int dARW=0.07;
				  instance.setdAnnualReturnWorking(0.07);
				  int return = instance.getdAnnualReturnWorking();
				  assertEquals(return, dARW);
				}

				@Test
				public void testSetiYearsRetired() {
				  System.out.println("setiYearsRetired");
				  int iYR= 20;
				  iYearsRetired instance = new iYearsRetired();
				  assertEquals(instance.getiYearsRetired(), iYR));
				}

				@Test
				public void testGetiYearsRetired() {
				  System.out.println("getiYearsRetired");
				  iYearsRetired instance = new iYearsRetired();
				  int iYR=20;
				  instance.getiYearsRetired(20);
				  int years = instance.getiYearsRetired();
				  assertEquals(years, iYR);
				}
				
				@Test
				public void testSetiYearsRetired() {
				  System.out.println("setiYearsRetired");
				  int iYR= 20;
				  iYearsRetired instance = new iYearsRetired();
				  assertEquals(instance.getiYearsRetired(), iYR));
				}

				@Test
				public void testGetiYearsRetired() {
				  System.out.println("getiYearsRetired");
				  iYearsRetired instance = new iYearsRetired();
				  int iYR=20;
				  instance.getiYearsRetired(20);
				  int years = instance.getiYearsRetired();
				  assertEquals(years, iYR);
				
				@Test
				public void testSetdAnnualReturnWorking() {
				  System.out.println("dAnnualReturnWorking");
				  int dARW= 0.02;
				  dAnnualReturnWorking instance = new dAnnualReturnWorking();
				  assertEquals(instance.getdAnnualReturnWorking(), dARW));
				}

				@Test
				public void testGetdAnnualReturnWorking() {
				  System.out.println("getdAnnualReturnWorking");
				  dAnnualReturnWorking instance = new dAnnualReturnWorking();
				  int dARW=0.02;
				  instance.getdAnnualReturnWorking(0.02);
				  int return = instance.getdAnnualReturnWorking();
				  assertEquals(return, dARW);
					
				@Test
				public void testSetdRequiredIncome() {
				  System.out.println("dRequiredIncome");
				  int dRI= 10000;
				  dRequiredIncome instance = new dRequiredIncome();
				  assertEquals(instance.getdRequiredIncome(), dRI));
				}

				@Test
				public void testGetdRequiredIncome() {
				  System.out.println("getdRequiredIncome");
				  dRequiredIncome instance = new dRequiredIncome();
				  int dRI=10000;
				  instance.getdRequiredIncome(10000);
				  int income = instance.getdRequiredIncome();
				  assertEquals(income, dRI);
					
				@Test
				public void testSetdMonthlySSI() {
				  System.out.println("dMonthlySSI");
				  int dMSSI= 2642;
				  dMonthlySSI instance = new dMonthlySSI();
				  assertEquals(instance.getdMonthlySSI(), dMSSI));
				}

				@Test
				public void testGetdMonthlySSIe() {
				  System.out.println("dMonthlySSI");
				  dMonthlySSI instance = new dMonthlySSI();
				  int dMSSI=2642;
				  instance.getdMonthlySSI(2642);
				  int month = instance.getdMonthlySSI();
				  assertEquals(month, dMSSI);

				@Test
				public void testAmountToSave() {
					System.out.println("AmountToSave");
					AmountToSave instance = new AmountToSave();
					int ATS=554.13;
					instance.AmountToSave(554.13);
					int amount = instance.AmountToSave();
					assertEquals(amount, ATS);
				}
				
				@Test
				public void testTotalAmountSaved() {
					System.out.println("TotalAmountSaved");
					TotalAmountSaved instance = new TotalAmountSaved();
					int TAS=1454485.55;
					instance.TotalAmountSaved(1454485.55);
					int amount = instance.TotalAmountSaved();
					assertEquals(amount, TAS);
	}
}
