package acme.testing;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class AuthenticatedTaskListTest extends AcmePlannerTest {
	
		
	@ParameterizedTest
	@CsvFileSource(resources = "/authenticated/task.csv", encoding = "utf-8", numLinesToSkip = 1)
	@Order(20)	
	public void listPositive(final int recordIndex, final String title, final String description , final String start, final String end,final String workload,final String link) {		
		super.signIn("administrator", "administrator");
		super.clickOnMenu("Authenticated", "Tasks");		
		
		
		super.checkColumnHasValue(recordIndex, 0, title);
		super.checkColumnHasValue(recordIndex, 1, description);
		super.checkColumnHasValue(recordIndex, 2, start);
		super.checkColumnHasValue(recordIndex, 3, end);
//		super.checkColumnHasValue(recordIndex, 4, workload);

		super.clickOnListingRecord(recordIndex);
		
		super.checkInputBoxHasValue("title", title);
		super.checkInputBoxHasValue("description", description);
//		super.checkInputBoxHasValue("workload", workload);
		super.checkInputBoxHasValue("start", start);
		super.checkInputBoxHasValue("end", end);
//		super.checkInputBoxHasValue("link", link);
		
		super.signOut();
	}
	
}
