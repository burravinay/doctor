import java.util.ArrayList;


public class Doctor {
public static Schedule drSch; 
private static ArrayList<Patients> drPatients=new ArrayList<Patients>();
public Doctor()
{
	drSch=new Schedule();
}

public static boolean doesPatientExist(String name)
{
	for(Patients p: drPatients)
	{
		if(p.name.equalsIgnoreCase(name))
			return true;
	}
	return false;
}

public void takeLeave(String day)
{
	int dayIntVersion=PA.day2IntMapping(day);
	drSch.d[dayIntVersion].drLeaveStatus=true;
}

}
