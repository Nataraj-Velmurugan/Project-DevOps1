package listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

		public class OverrideAttributes implements IAnnotationTransformer,ITestAnnotation,ISuiteListener {
	
		public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) 
		
			{
					if (testMethod.getName().equals("editLead"))
						annotation.setInvocationCount(1);
					if (testMethod.getName().equals("createLead"))
						annotation.setEnabled(false);
				
			
			
			}

	public long getTimeOut() {

		return 0;
	}

	
	public void setTimeOut(long l) {
		
		
	}

	
	public String[] getGroups() {
		
		return null;
	}

	
	public void setGroups(String[] groups) {
		
		
	}

	
	public String[] getDependsOnGroups() {
		
		return null;
	}

	
	public void setDependsOnGroups(String[] groups) {
		
		
	}

	
	public String[] getDependsOnMethods() {
		
		return null;
	}

	
	public void setDependsOnMethods(String[] dependsOnMethods) {
		
		
	}

	
	public String getDescription() {
		
		return null;
	}

	
	public void setDescription(String description) {
		
		
	}

	
	public String[] getParameters() {
		
		return null;
	}

	
	public boolean getEnabled() {
		
		return false;
	}

	
	public void setEnabled(boolean enabled) {
		
		
	}

	
	public int getInvocationCount() {
		
		return 0;
	}

	
	public void setInvocationCount(int l) {
		
		
	}

	
	public int getThreadPoolSize() {
		
		return 0;
	}

	
	public void setThreadPoolSize(int n) {
		
		
	}

	
	public int getSuccessPercentage() {
		
		return 0;
	}

	
	public void setSuccessPercentage(int s) {
		
		
	}

	
	public boolean getAlwaysRun() {
		
		return false;
	}

	
	public void setAlwaysRun(boolean f) {
		
		
	}

	
	public Class<?>[] getExpectedExceptions() {
		
		return null;
	}

	
	public void setExpectedExceptions(Class<?>[] e) {
		
		
	}

	
	public String getExpectedExceptionsMessageRegExp() {
		
		return null;
	}

	
	public void setExpectedExceptionsMessageRegExp(String e) {
		
		
	}

	
	public String getSuiteName() {
		
		return null;
	}

	
	public void setSuiteName(String s) {
		
		
	}

	
	public String getTestName() {
		
		return null;
	}

	
	public void setTestName(String s) {
		
		
	}

	
	public boolean getSequential() {
		
		return false;
	}

	
	public void setSequential(boolean f) {
		
		
	}

	
	public boolean getSingleThreaded() {
		
		return false;
	}

	
	public void setSingleThreaded(boolean f) {
		
		
	}

	
	public String getDataProvider() {
		
		return null;
	}

	
	public void setDataProvider(String v) {
		
		
	}

	
	public Class<?> getDataProviderClass() {
		
		return null;
	}

	
	public void setDataProviderClass(Class<?> v) {
		
		
	}

	
	public IRetryAnalyzer getRetryAnalyzer() {
		
		return null;
	}

	
	public void setRetryAnalyzer(Class<?> c) {
		
		
	}

	
	public boolean skipFailedInvocations() {
		
		return false;
	}

	
	public void setSkipFailedInvocations(boolean skip) {
		
		
	}

	
	public long invocationTimeOut() {
		
		return 0;
	}

	
	public void setInvocationTimeOut(long timeOut) {
		
		
	}

	
	public boolean ignoreMissingDependencies() {
		
		return false;
	}

	
	public void setIgnoreMissingDependencies(boolean ignore) {
		
		
	}

	
	public int getPriority() {
		
		return 0;
	}

	
	public void setPriority(int priority) {
		
		
	}

	
	public void onStart(ISuite suite) {
		
		
	}

	
	public void onFinish(ISuite suite) {
		
		
	}

}