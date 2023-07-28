# SOEN_6431

# Project Description:

The purpose of this project is learning to make critical decisions through theory and practice of reengineering the source code of a selected system. In doing so, the project studies the maintainability (as defined by the ISO/IEC 25010 Standard) of the selected system.  

The source code of systems1 that have proven to be useful also tend to be modified relatively frequently for some purpose, including enhancements. These modifications can lead to deterioration of quality2, specifically, deterioration of maintainability and/or deterioration of (space and/or time) efficiency.


# Team members:

Pratik Gondaliya: 40194062, Email ID: pratikgondaliya7473@gmail.com

Sree Sneha Kothapalli: 40235510, Email ID: kothapallisneha9903@gmail.com

Abhishek Gupta: 40226797, Email ID: abhishek.gupta.20221@mail.concordia.ca

Poojitha Bhupali: 40232528, Email ID: poojitha.bhupalli333@gmail.com

# Roles and Responsibilities:

 ## Deliverable 1

## Pratik Gondaliya

- N System Selected: Inventory Management System
- Github Setup
- Content Planning (Why Inventory Management System should be selected as R.)
- URL: https://github.com/nrudeys/Inventory-Management-System/tree/main
- Latex Report Preparation


## Sree Sneha Kothapalli

- N System Selected: Hotel Management System
- Content Planning (Why Hotel Management System (N System) should be rejected)
- URL: https://github.com/akashkolekar98/HOTEL-MANAGEMENT-SYSTEM
- Latex Report Preparation.

   
## Abhishek Gupta

- N System Selected: Online Shop
- Content Planning (Why Online shop (N System) should be rejected)
- URL: https://github.com/CodecoolGlobal/online-shop-java-sql-ltkw/tree/master
- Abstract Planning


## Poojitha Bhupali

- N System Selected: Restaurant Management System
- Content Planning (Why Restaurant Management System (N System) should be rejected)
- URL: https://github.com/KubaTworek/Restaurant-Management-System
- Introduction Planning

 ## Deliverable 2

## Pratik Gondaliya

* A “NullPointerException” could be thrown; getMonth() can be return null.(Line:432,FileName: AnalysisChartsHelpers.java)
* Define a constant instead of duplicating this literal “Month” three times.(Line:40, FileName: AnalysisChartsHelpers.java)
* Declare “Sales Table” on a separate line.(Line:39, FileName: AnalysisChartsHelpers.java)
   Add Default case to this switch.(Line:436, FileName: AnalysisChartsHelpers.java)
* Replace this use of System.out or System.err by a logger.(Line:64,FileName: AnalysisChartsHelpers.java) 

* Equal Contribution in Report Preparation.

  
1) Category: Exception Handling

Error: A “NullPointerException” Could Be Thrown; getMonth() Can Return Null.
Code Smell Type: Bug
Summary:
The code does not handle the possibility of a NullPointerException when calling getMonth(), which can return null. Proper null-checking or defensive programming should be implemented to avoid potential runtime exceptions.

2) Category: Code Organization

Error: Define a Constant Instead of Duplicating the Literal “Month” Three Times.
Code Smell Type: Maintainability
Summary:
The literal "Month" is duplicated three times in the code, which can lead to maintenance issues and decrease code readability. It's recommended to define a constant with a descriptive name to avoid duplication and improve code maintainability.


3) Category: Code Smell

Error: Missing Try-with-resources or Finally Clause for "PreparedStatement"
Code Smell Type: Resource Management
Summary: 
In this code, there is a missing try-with-resources or finally clause to properly handle the "PreparedStatement" object. The "PreparedStatement" is a resource that requires proper cleanup after its usage to release any associated system resources and avoid potential resource leaks.

4) Category: Code Logic

Error: Add Default Case to This Switch.
Code Smell Type: Bug
Summary:
The switch statement lacks a default case, which can result in unexpected behavior when the switch expression does not match any defined case. Adding a default case allows graceful handling of such situations and improves code robustness.

5) Category: Logging

Error: Replace This Use of System.out or System.err by a Logger.
Code Smell Type: Maintainability
Summary:
Directly using System.out or System.err for logging is not recommended in production code. Instead, a proper logging framework like SLF4J or Log4j should be used. This change enhances maintainability and allows better control over log levels and destinations.


## Sree Sneha Kothapalli

*  Move this file to named package.(FileName: AnalysisChartsHelper.java)
* Declare “Platform” on separate line.(Line:207, FileName: AnalysisChartsHelpers.java)
* Define a constant instead of duplicating this literal “Title 1” 3 times.(Line: 51, FileName: MainFrame.java)
* Remove the declaration of thrown exception ‘java.util.prefs.BackingStoreException’, as it cannot be thrown from method’s body. (Line: 38, FileName: ColorPreferences.java)
* Make ‘con’ serializable’ or ‘transient’.(Line: 46, FileName: MainFrame.java)

* Equal Contribution in Report Preparation.


1) Category: Code Organization

Error: Move this file to a named package.
Code Smell Type: Maintainability
Summary: The code is not organized into packages, which can lead to difficulties in managing and locating related code files. Moving the file to a named package would improve code organization and maintainability.

2) Category: Code Formatting

Error: Declare “Platform” on separate line.
Code Smell Type: Readability
Summary:
The variable "Platform" should be declared on a separate line. Declaring each variable on a separate line enhances code readability and makes the code more organized. This practice improves the ability to quickly understand and maintain the code by clearly distinguishing individual declarations.

3) Category: Magic Number

Error: Define a constant instead of duplicating the literal “Title 1” 3 times.
Code Smell Type: Maintainability
Summary: The literal "Title 1" is duplicated multiple times in the code without explanation. Creating a constant with a meaningful name would improve code readability and maintainability.

4) Category: Exception Handling

Error: Remove the declaration of thrown exception ‘java.util.prefs.BackingStoreException’, as it cannot be thrown from the method’s body.
Code Smell Type: Robustness
Summary: The method declares an exception that cannot be thrown from its body, which is unnecessary and potentially confusing. The exception declaration should be removed to maintain code clarity.

5) Category: Serialization

Error: Make ‘con’ serializable or ‘transient’.
Code Smell Type: Performance/Security
Summary: The variable 'con' is not serializable, and attempting to serialize it could lead to runtime errors. To avoid this, the variable should be marked as serializable or transient, depending on the actual requirement.

   
## Abhishek Gupta

* Define a constant instead of duplicating this literal “yyyy-MM-dd” 4 times.(Line: 48, FileName: MainFrameHelper.java)
* Declare “roi” on seperate line.(Line: 379, FileName: MainFrameHelper.java)
* Remove this useless assignment to local variable “mainFrame”.(Line: 22, FileName: TestMainFrame.java)
* Remove this unused private “testItemNoName” method.(Line:24, FileName: TestMainFrame.java)
* Use static access with “Javax.swing.SwingConstants” for “CENTER”.(Line:72,MainFrameHelpers.java)

* Equal Contribution in Report Preparation.

  
1) Category: Code Organization

Error: Define a Constant Instead of Duplicating the Literal “yyyy-MM-dd” 4 Times.
Code Smell Type: Duplicated Code
Summary:
The literal "yyyy-MM-dd" is duplicated four times in the code, leading to duplicated code. It's better to define a constant with a meaningful name for this date format to avoid repetition and improve code maintainability.

2) Category: Code Formatting

Error: Declare “roi” on Separate Line.
Code Smell Type: Code Style
Summary:
Declaring multiple variables on the same line is a code style issue. It can decrease code readability and makes it harder to understand the variables' declarations. It's recommended to declare each variable on a separate line for better code organization.

3) Category: Dead Code

Error: Remove This Useless Assignment to Local Variable “mainFrame”.
Code Smell Type: Maintainability
Summary:
The assignment to the local variable "mainFrame" is not used anywhere in the code, making it useless or dead code. Removing this assignment improves code clarity and maintainability.

4) Category: Dead Code

Error: Remove This Unused Private “testItemNoName” Method.
Code Smell Type: Maintainability
Summary:
The private method "testItemNoName" is declared but not used anywhere in the code. Removing unused code helps improve maintainability and reduces confusion for other developers.

5) Category: Code Style

Error: Use Static Access with “Javax.swing.SwingConstants” for “CENTER”.
Code Smell Type: Code Style
Summary:
The code is accessing the constant "CENTER" without static access from the "Javax.swing.SwingConstants" class. Using static access (SwingConstants.CENTER) follows the code style conventions, improves code readability, and clearly indicates the origin of the constant.


## Poojitha Bhupali

* Add the ‘@Override’ annotation above this method signature.(Line:220, FileName: MainFrame.java)
* Define a constant instead of duplicating this literal “Tahoma” 33 times.(Line:56, FileName: MainFrame.java)
* Remove this unused method parameter ‘evt’.(Line:205, FileName: MainFrame.java)
* Declare “pf” and all following declarations on a separate line.(Line:256, FileName: AnalysisChartsHelper.java)
* Remove useless curly braces around statement.(Line:260, FileName: AnalysisChartsHelper.java)

* Equal Contribution in Report Preparation.

  
1) Category: Code Quality/Annotation
Error: Add the ‘@Override’ annotation above this method signature.
Code Smell Type: Maintainability
Summary: The '@Override' annotation is a helpful indicator that a method is intended to override a superclass or interface method. Adding this annotation improves code maintainability and can catch potential issues at compile time.

2) Category: Magic String

Error: Define a constant instead of duplicating this literal “Tahoma” 33 times.
Code Smell Type: Maintainability
Summary: The literal "Tahoma" is repeated 33 times in the code, which can lead to maintenance issues and make the code harder to maintain. Defining a constant with a meaningful name would improve code readability and maintainability.

3) Category: Unused Code

Error: Remove this unused method parameter ‘evt’.
Code Smell Type: Readability
Summary: The parameter 'evt' is declared but not used within the method body, which can create confusion for other developers. Removing the unused parameter improves code readability.

4) Category: Code Formatting

Error: Declare “pf” and all following declarations on a separate line.
Code Smell Type: Readability
Summary: Declaring multiple variables on the same line reduces code readability. Each variable declaration should be on a separate line to enhance code clarity and make it easier to maintain.

5) Category: Useless Code

Error: Remove useless curly braces around statement.
Code Smell Type: Maintainability
Summary: Having unnecessary curly braces around a statement can make the code look cluttered and harder to read. Removing the unnecessary braces improves code maintainability.

##### NOTE:
* D1: All team members has equal contributions in every N systems and Selecting R.
* D2: All team members has equal contributions in solving code smells, Vulnerabilities and Bugs.

