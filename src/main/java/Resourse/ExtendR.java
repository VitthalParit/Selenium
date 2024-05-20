package Resourse;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendR {
	
	public static ExtentReports extendreport() {
		
		String path=System.getProperty("user.dir")+"//vitthal//index.html";
		ExtentSparkReporter spark=new ExtentSparkReporter(path);
		spark.config().setReportName("Automation report");
		spark.config().setDocumentTitle("selenium");
		
		ExtentReports extend=new ExtentReports();
		extend.attachReporter(spark);
		extend.setSystemInfo("QA", "vitthal pradeep parit");
		extend.createTest(path);
	   return extend;
		
		
		
		
		
		
	}
	
}


