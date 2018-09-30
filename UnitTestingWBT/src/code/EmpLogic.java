package code;

public class EmpLogic {
public double yearlySal(EmpDetails details)
{
double yearlySalary=details.getEmpSalary()*12;
return yearlySalary;
}

public double appraisals(EmpDetails details)
{
double appraisal=0.0;
if (details.getEmpSalary()>10000.0) {
	appraisal=1000.0;
} else {
appraisal=500.0;
}
return appraisal;
}
}
