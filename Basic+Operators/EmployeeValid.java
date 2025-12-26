class EmployeeValid 
{
	public static void main(String[] args) 
	{
		Boolean id = false;
		Boolean p_employee = false;
		Boolean c_employee = false;
		String Res = (id == true || p_employee == true || c_employee == true)?"ValidEntry":"Not Allowed";
		System.out.println(Res);
	}
}
