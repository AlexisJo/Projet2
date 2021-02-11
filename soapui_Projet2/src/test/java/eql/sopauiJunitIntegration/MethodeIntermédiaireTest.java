/*package eql.sopauiJunitIntegration;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.apache.xmlbeans.XmlException;
import org.junit.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.soapui.support.SoapUIException;


public class MethodeIntermédiaireTest {
@Test
public void JunitTest1()
        throws XmlException, IOException, SoapUIException {

    WsdlProject project = new WsdlProject(
            "src\\test\\resources\\LibrePlan.xml");

    List<TestSuite> testSuiteList = project.getTestSuiteList();

    for (TestSuite ts : testSuiteList) {
        System.out.println("******Running " + ts.getName() + "***********");

        List<TestCase> testCaseList = ts.getTestCaseList();

        for (TestCase testcase : testCaseList) {
            System.out.println("******Running " + testcase.getName() + "***********");

            TestRunner testCaseRunner = testcase.run(new PropertiesMap(), false);

            assertEquals(TestRunner.Status.FINISHED, testCaseRunner.getStatus());
        }
    }
}}*/