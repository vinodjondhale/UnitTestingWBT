package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import code.EmpDetails;
import code.EmpLogic;

public class Test2 {
	EmpDetails details=new EmpDetails();
	EmpLogic logic= new EmpLogic();
	@Test
	public void testAppraisalMoreThanTen()
	{
		details.setEmpName("Vinod");
		details.setEmpAge(25);
		details.setEmpSalary(30000.0);
		double eAppraisal= 1000.0;
		double aAppraisal=logic.appraisals(details);
		Assert.assertEquals(eAppraisal, aAppraisal);
	}
	@Test
	public void testAppraisalLessThanTen()
	{
		details.setEmpName("Vinod");
		details.setEmpAge(25);
		details.setEmpSalary(9999.9);
		double eAppraisal= 500.0;
		double aAppraisal=logic.appraisals(details);
		Assert.assertEquals(eAppraisal, aAppraisal);
	}
	
}
