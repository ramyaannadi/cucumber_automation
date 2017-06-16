$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "To Test BPM Portal",
  "description": "",
  "id": "to-test-bpm-portal",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BPM"
    }
  ]
});
formatter.before({
  "duration": 5726249174,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "To Add one Haluer and accept the haluer to complete the task",
  "description": "",
  "id": "to-test-bpm-portal;to-add-one-haluer-and-accept-the-haluer-to-complete-the-task",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@BPMAddHaluer"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I Navigate to BPM Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I Login to BPM",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I Click on All Task Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I Search CaseId \"004009-118226-2662529\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Click on Add3 Contact Button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I Click on Claim",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Select LOA Details \"Yes, LOA looks OK\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I Click on Add Haluer Button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I Add Hauler Details",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I Select Haulers Agree To The Terms",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I Add Contracted Haluer Details",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I Click on Complete Task",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I Click on Logout",
  "keyword": "And "
});
formatter.match({
  "location": "BPMDefinitions.i_Navigate_to_BPM_Portal()"
});
formatter.result({
  "duration": 2764419190,
  "status": "passed"
});
formatter.match({
  "location": "BPMDefinitions.i_Login_to_BPM()"
});
formatter.result({
  "duration": 3599866108,
  "status": "passed"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_All_Task_Tab()"
});
formatter.result({
  "duration": 61253115560,
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 30 seconds waiting for visibility of element located by By.xpath: .//*[text()\u003d\u0027All Open Tasks\u0027 and contains(@class,\u0027button\u0027)]\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027RUB-BNTSR72\u0027, ip: \u002710.128.111.150\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\RAMYA~1.ANN\\AppData\\Local\\Temp\\scoped_dir12028_22276}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 07df8e42b5ac910e7135424e8dba58bc\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:261)\r\n\tat com.bpm.base.BaseWebDriver.getXpath(BaseWebDriver.java:109)\r\n\tat com.bpm.base.BaseWebDriver.getWebElement(BaseWebDriver.java:201)\r\n\tat com.bpm.pageactions.BPMHomeActions.clickAllTaskTab(BPMHomeActions.java:33)\r\n\tat com.bpm.definitions.BPMDefinitions.i_Click_on_All_Task_Tab(BPMDefinitions.java:91)\r\n\tat ✽.Given I Click on All Task Tab(Login.feature:8)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[text()\u003d\u0027All Open Tasks\u0027 and contains(@class,\u0027button\u0027)]\"}\n  (Session info: chrome\u003d58.0.3029.110)\n  (Driver info: chromedriver\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 20.07 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027RUB-BNTSR72\u0027, ip: \u002710.128.111.150\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\RAMYA~1.ANN\\AppData\\Local\\Temp\\scoped_dir12028_22276}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 07df8e42b5ac910e7135424e8dba58bc\n*** Element info: {Using\u003dxpath, value\u003d.//*[text()\u003d\u0027All Open Tasks\u0027 and contains(@class,\u0027button\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:899)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:41)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:238)\r\n\tat com.bpm.base.BaseWebDriver.getXpath(BaseWebDriver.java:109)\r\n\tat com.bpm.base.BaseWebDriver.getWebElement(BaseWebDriver.java:201)\r\n\tat com.bpm.pageactions.BPMHomeActions.clickAllTaskTab(BPMHomeActions.java:33)\r\n\tat com.bpm.definitions.BPMDefinitions.i_Click_on_All_Task_Tab(BPMDefinitions.java:91)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:34)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:30)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:35)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:163)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:120)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCukes(TestNGCucumberRunner.java:43)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.run_cukes(AbstractTestNGCucumberTests.java:14)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)\r\n\tat org.testng.internal.MethodInvocationHelper$1.runTestMethod(MethodInvocationHelper.java:200)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.run(AbstractTestNGCucumberTests.java:19)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeHookable(MethodInvocationHelper.java:212)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:707)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:901)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1231)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:127)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:111)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:767)\r\n\tat org.testng.TestRunner.run(TestRunner.java:617)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:348)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:343)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:305)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:254)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1224)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1149)\r\n\tat org.testng.TestNG.run(TestNG.java:1057)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:132)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:230)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:76)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "004009-118226-2662529",
      "offset": 17
    }
  ],
  "location": "BPMDefinitions.i_Search_CaseId(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Add3_Contact_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Claim()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes, LOA looks OK",
      "offset": 22
    }
  ],
  "location": "BPMDefinitions.i_Select_LOA_Details(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Add_Haluer_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Add_Hauler_Details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Select_Haluer_Agree_To_The_Terms()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Add_Contracted_Haluer_Details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Complete_Task()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3594960147,
  "status": "passed"
});
formatter.before({
  "duration": 3272007427,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "To upload customer document and add Haluer and complete the task",
  "description": "",
  "id": "to-test-bpm-portal;to-upload-customer-document-and-add-haluer-and-complete-the-task",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@BPMAddHaluer1"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I Navigate to BPM Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I Login to BPM",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I Click on All Task Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I Search CaseId \"004009-118229-2662532\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I Click on the Case Link \"004009-118229-2662532\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I Click on Claim",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I Upload Customer Document",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I Click on Complete Task",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I Click on the Cases Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I Search CaseId \"004009-118229-2662532\"",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I Click on the Case Link \"004009-118229-2662532\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I Click on Add3 Contact Button",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I Click on Claim",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I Select LOA Details \"Yes, LOA looks OK\"",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I Click on Add Haluer Button",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "I Add Hauler Details",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "I Select Haulers Agree To The Terms",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "I Add Contracted Haluer Details",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "I Click on Complete Task",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "I Click on Logout",
  "keyword": "And "
});
formatter.match({
  "location": "BPMDefinitions.i_Navigate_to_BPM_Portal()"
});
formatter.result({
  "duration": 3033324703,
  "status": "passed"
});
formatter.match({
  "location": "BPMDefinitions.i_Login_to_BPM()"
});
formatter.result({
  "duration": 3518076151,
  "status": "passed"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_All_Task_Tab()"
});
formatter.result({
  "duration": 61080186983,
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 30 seconds waiting for visibility of element located by By.xpath: .//*[text()\u003d\u0027All Open Tasks\u0027 and contains(@class,\u0027button\u0027)]\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027RUB-BNTSR72\u0027, ip: \u002710.128.111.150\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\RAMYA~1.ANN\\AppData\\Local\\Temp\\scoped_dir7264_24471}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: f6bb46578621f685dff88123e3cab81c\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:261)\r\n\tat com.bpm.base.BaseWebDriver.getXpath(BaseWebDriver.java:109)\r\n\tat com.bpm.base.BaseWebDriver.getWebElement(BaseWebDriver.java:201)\r\n\tat com.bpm.pageactions.BPMHomeActions.clickAllTaskTab(BPMHomeActions.java:33)\r\n\tat com.bpm.definitions.BPMDefinitions.i_Click_on_All_Task_Tab(BPMDefinitions.java:91)\r\n\tat ✽.Given I Click on All Task Tab(Login.feature:24)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[text()\u003d\u0027All Open Tasks\u0027 and contains(@class,\u0027button\u0027)]\"}\n  (Session info: chrome\u003d58.0.3029.110)\n  (Driver info: chromedriver\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 20.04 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027RUB-BNTSR72\u0027, ip: \u002710.128.111.150\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\RAMYA~1.ANN\\AppData\\Local\\Temp\\scoped_dir7264_24471}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: f6bb46578621f685dff88123e3cab81c\n*** Element info: {Using\u003dxpath, value\u003d.//*[text()\u003d\u0027All Open Tasks\u0027 and contains(@class,\u0027button\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:899)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:41)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:238)\r\n\tat com.bpm.base.BaseWebDriver.getXpath(BaseWebDriver.java:109)\r\n\tat com.bpm.base.BaseWebDriver.getWebElement(BaseWebDriver.java:201)\r\n\tat com.bpm.pageactions.BPMHomeActions.clickAllTaskTab(BPMHomeActions.java:33)\r\n\tat com.bpm.definitions.BPMDefinitions.i_Click_on_All_Task_Tab(BPMDefinitions.java:91)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:34)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:30)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:35)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:163)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:120)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCukes(TestNGCucumberRunner.java:43)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.run_cukes(AbstractTestNGCucumberTests.java:14)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)\r\n\tat org.testng.internal.MethodInvocationHelper$1.runTestMethod(MethodInvocationHelper.java:200)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.run(AbstractTestNGCucumberTests.java:19)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeHookable(MethodInvocationHelper.java:212)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:707)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:901)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1231)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:127)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:111)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:767)\r\n\tat org.testng.TestRunner.run(TestRunner.java:617)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:348)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:343)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:305)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:254)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1224)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1149)\r\n\tat org.testng.TestNG.run(TestNG.java:1057)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:132)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:230)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:76)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "004009-118229-2662532",
      "offset": 17
    }
  ],
  "location": "BPMDefinitions.i_Search_CaseId(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "004009-118229-2662532",
      "offset": 26
    }
  ],
  "location": "BPMDefinitions.i_Click_on_the_Case_Link(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Claim()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Upload_Customer_Documents()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Complete_Task()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_the_Cases_Tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "004009-118229-2662532",
      "offset": 17
    }
  ],
  "location": "BPMDefinitions.i_Search_CaseId(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "004009-118229-2662532",
      "offset": 26
    }
  ],
  "location": "BPMDefinitions.i_Click_on_the_Case_Link(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Add3_Contact_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Claim()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes, LOA looks OK",
      "offset": 22
    }
  ],
  "location": "BPMDefinitions.i_Select_LOA_Details(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Add_Haluer_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Add_Hauler_Details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Select_Haluer_Agree_To_The_Terms()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Add_Contracted_Haluer_Details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Complete_Task()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 3469449013,
  "status": "passed"
});
});