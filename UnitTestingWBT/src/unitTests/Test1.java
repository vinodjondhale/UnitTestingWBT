package unitTests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import code.EmpDetails;
import code.EmpLogic;

public class Test1 {
EmpDetails details=new EmpDetails();
EmpLogic logic= new EmpLogic();
@Test
public void testAnnualSal()
{
details.setEmpName("Vinod");
details.setEmpAge(25);
details.setEmpSalary(30000.0);
double eAnnualSal= 360000.0;
double aAnnualSal=logic.yearlySal(details);
Reporter.log(aAnnualSal+"",true);
Assert.assertEquals(eAnnualSal, eAnnualSal);
}
}
