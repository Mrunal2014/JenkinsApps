ease this solution to run the testNG from the Command Line it is working.

java -classpath "Path of TestNG.jar"; org.testng.TestNG "your_TestNG.xml"


If you want to run your code in standalone machine without Eclipse IDE.Create Executable .Jar file using eclipse and use below option to run the testNG from command prompt.

java -classpath"Path of TestNG.jar";"Your_classe_executable_Jar_path.jar"; . org.testng.TestNG  "your_TestNG.xml"


Regards,
G.Ravi