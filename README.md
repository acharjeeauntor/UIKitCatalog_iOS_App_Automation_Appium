# UIKitCatalog_iOS_App_Autoamtion_Appium
This repo will contains UIKitCatalog iOS Application test script using Selenium-Appium

## Technology <br>
Tool: selenium, Appium <br>
Build tool: Maven <br>
Language: Java <br>
Framework: TestNG,Data Driven Framework(DDF) <br>
Report: Extent<br>
Project Structure: Page object Model(POM)<br>
Dependency Used:java-client,apache poi,extentreports,log4j,testng,selenium-java,etc<br>
IDE: Intellij<br>


#### Note: In this project i have used latest version of Appium(v2) & Java-Client(v8), Also Intregrate this project with BrowserStack & Jenkins via Docker Container. <br>

## To Run the project with Different Test Runner from command line:<br>

Use the following command from the Cmd: mvn clean test -Dfilename=testNG_File_name.xml<br>
Example: mvn clean test -Dfilename=all_testng.xml<br>


## Allure Report view for the test:
<img width="1436" alt="Screenshot 2023-04-01 at 8 22 52 PM" src="https://user-images.githubusercontent.com/38497405/229306790-8b3fb3e9-23cc-4e5a-a251-94267a88dec9.png">
<img width="1436" alt="Screenshot 2023-04-01 at 8 22 34 PM" src="https://user-images.githubusercontent.com/38497405/229306793-ce69eb26-8cb2-4c84-9b22-dd76cccd9d7b.png">
<img width="1436" alt="Screenshot 2023-04-01 at 8 22 46 PM" src="https://user-images.githubusercontent.com/38497405/229306795-21ab0396-dced-4b9e-89d7-38b3924f07ec.png">
<img width="1436" alt="Screenshot 2023-04-01 at 8 23 01 PM" src="https://user-images.githubusercontent.com/38497405/229306798-839b7d21-cb54-4901-a251-d02a0791e32d.png">

To See the Demo Video click [here](https://youtu.be/Zmea_pM60fs)<br>

----------------------------------------------------------

## BrowserStack Related Info:<br>

To run this test autoamtion project in a virtual device, i have intregrate this project with Browserstack.We have uploaded the .ipa file in the browserstack and get the app_url and then using this app_url we are able to run the ios app in the BrowserStack. <br>

To See the Demo Video click [here](https://youtu.be/f5cKtEd146k)<br>

----------------------------------------------------------

## Jenkins with BrowserStack Related Info:<br>

I have intregrate this project with jenkins through the github repository and run test on Browserstack for virtual device support. <br>

To See the Demo Video click [here](https://youtu.be/YNkYywxe12c)<br>
