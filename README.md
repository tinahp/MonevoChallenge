Monevo
SETUP & CONFIGURATION
i) Below shows the steps for Java Installation:

1.JDK [version "15.0.2"] must be installed.
2.SetUp environment variables after a successful download which consist of the steps:
3.Navigate to the advanced System Settings ===the screen would display two “variables”. Environment Variable and SystemVariable
4.Click on edit===new==== on the System Variable, Set the java path in the column for variable value and  then give a unique name for the variable Type.
5.Then click on “path” on the System Variable
6. An edit environment variable would display====click on new=== go to the bin file of the java jdk=== copy file path. Also add the folder file where java exe is as-well



ii) Below shows the steps for Project Configuration:
1)Launch the IntelliJ IDE
2)Select File==Project==new MavenProject
3)Select Project JDK==Click on Next
4)Click on Next==Input Project Name
5)Select project folder ==Click on FINISH
6)ImportMaven “Dependencies” into the POM==Load Maven changes to sync to enable the editor to work correctly.
7)Add a folder for Resources, where drivers can be added for execution eg ChromeDriver
8)Under the SRC, JavaClasses are created under the main folder and tests are created under the test folder . The java class is organized in a package folder called “POM”
10)Created a BaseCase package that has a baseClassTest
11)Then a TestSuite that runs the test using TestNG
12)Other added folders and Files are were added eg allure-result and testng.xml


iii) Belows shows how the repo can be cloned:
Project can be initiated directly from GitHUB  by
Cloning into the local system using the GIT BASH Commands: git clone URL
Once a Project has been successfully cloned, the project can successfully run.

N/B:Same Java version should already have been installed.
Selenium driver should have been downloaded  to allow wen automation
chrome Driver: 116
Google : 116
Updates made locally can be pushed back to the cloud repo.

Accroynm
Note: Java Development Kit (JDK)
