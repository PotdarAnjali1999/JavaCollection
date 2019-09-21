
public class Grade {
	
	int m_year1,m_year2,m_year3,total_years=3,m_total_sum;

	public Grade(int m_year1, int m_year2, int m_year3) {
	
		this.m_year1 = m_year1;
		this.m_year2 = m_year2;
		this.m_year3 = m_year3;
	}
	
	public int getAvg()
	{
		int m_total_sum=m_year1+m_year2+m_year3;
		return m_total_sum/total_years;
		
	}

}
