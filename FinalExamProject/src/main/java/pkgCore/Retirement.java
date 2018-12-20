package pkgCore;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	//TODO: Build the contructor, getters and setters for the attributes above.
	Retirement(int iYTW, double aRW,int iYR, double aRR, double dRI,double dMSSI) {
	
		iYearsToWork = iYTW;
		dAnnualReturnWorking = aRW;
		iYearsRetired= iYR;
		dAnnualReturnRetired = aRR;
		dRequiredIncome = dRI;
		dMonthlySSI = dMSSI;
	}	
	public int getiYearsToWork() {
		return iYearsToWork;
	}
	
	public void setiYearsToWork(int iYTW) {
		this.iYearsToWork = iYTW;
	}
		
	public double getdAnnualReturnWorking() {
		return dAnnualReturnWorking;
	}
	
	public void setdAnnualReturnWorking(double aRW) {
		this.dAnnualReturnWorking = aRW;
	}
	
	public int getiYearsRetired() {
		return iYearsRetired;
	}
	
	public void setiYearsRetired(int iYR) {
		this.iYearsRetired = iYR;
	}
	
	public double getdAnnualReturnRetired () {
		return dAnnualReturnRetired;
	}
	public void setdAnnualReturnRetired(double aRR) {
		this.dAnnualReturnRetired= aRR;
	}
	
	public double getdRequiredIncome() {
		return dRequiredIncome;
	}
	public void setdRequiredIncome(double dRI) {
		this.dRequiredIncome= dRI;
	}
	
	public double getdMonthlySSI() {
		return dMonthlySSI;
	}
	
	public void setdMothlySSI(double dMSSI) {
		this.dMonthlySSI= dMSSI;
	}
	
	public double AmountToSave()
	{
		//TODO: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		
		
		return (1454485.55*(1/((1+dAnnualReturnWorking)Math.pow(iYearsToWork))))/(12*iYearsToWork);
	}
	
	public double TotalAmountSaved()
	{
		//	TODO: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		//
		return (iYearsRetired*dRequiredIncome)-(iYearsRetired*dMonthlySSI);
	}
}
