# Role-Based Digital University Platform
## INFO5100 Midterm Project – Group 5

### Team Information
- Merin Godly (NUID: 003186986): Developing University admin role, creating presentation video
- Kenneth Garcia (NUID: 003166112): Developing student role
- Lajona Rajan: (NUID: 003158194): Developing librarian role
- Hannah Chiou (NUID:  002124283): Developing faculty role, creating README documentation


### Project Overview
This project implements a **Digital University System** integrated with a **role-based access control layer** to support secure authentication and authorization for different university users. The objective is to combine the provided Digital University model with an Access Control Layer to ensure that **users can only access features appropriate to their assigned roles**.

The system is built using Java and follows a reference architecture that supports multiple user roles, each with distinct responsibilities. Our implementation focuses on completing and validating four different use cases (Admin, Student, Faculty, and Librarian) while enforcing proper access control throughout the system.

**Key Features:**
- Role-based authentication and authorization (Admin, Faculty, Student, and Librarian role)
- Secure login and logout functionality
- Ability to manage own profile
- Administrator tools for managing users, students, and faculty records
- Faculty functionality for course management, student performance tracking, and profile management
- Student features for course registration, assignment management, transcript review, and graduation auditing
- Librarian features to manage library books (add, update, delete, view books), issue books, accept returned books and update the status, and manage the profile
- Modular Java design following best practices for readability, maintainability, and access control enforcement

### Installation & Setup Instructions
List the prerequisites required to run the project (e.g., Java version, IDE, libraries)
Provide step-by-step setup instructions, including how to clone the repository and run the project

### Authentication & Access Control
Java version: Java 19
IDE: Apache Netbeans 16
Libraries: Java Swing, Java standard library (java.util, java.math, java.awt, java.io.File)

**Setup Instructions**
1.	If not already downloaded, install Apache Netbeans 16 using the instructions given by your operating system. 
2.	Open Netbeans and navigate from Team > Git > Clone.
3.	In the Repository URL field, copy and paste the following GitHub link: https://github.com/hannah-chiou/info5100-midterm-project.git Enter your GitHub username and password when prompted and click Next. 
4.	At the “Remote Branches” page, click main as the branch you would like to download. Click Next. 
5.	In the Parent Directory field specify where the project should be stored on your local directory and click Finish. Note that the Clone Name field will automatically fill with the repository name. This is the local folder name. The Remote Name is typically origin, which is the recommended default alias for the original repository. NetBeans will clone the repository and open the project.
  1. If the project does not open automatically, navigate to File → Open Project, locate the cloned repository, and open it.
6.	Right-click the project in the Projects panel and select Clean and Build to ensure all dependencies are resolved. 
7.	To run the project, right-click the project again and select Run, or press the green Play button located on the top of the Netbeans IDE. 

### Features Implemented
Detail the functionalities implemented for each role
Clearly specify which team member was responsible for each feature

### Usage Instructions
Provide a step-by-step guide on how to interact with the system.
Include example scenarios for different user roles.

### Testing Guide
Outline how to test the system, including sample test cases.
Explain how to verify that authentication and authorization work correctly.

### Challenges & Solutions
Summarize any difficulties encountered during development.
Highlight the solutions implemented to overcome these challenges.

### Future Enhancements
Suggest potential improvements or additional features that could be implemented.

### Contribution Breakdown
Clearly state each team member’s contributions to the project.
Provide details on coding, documentation, testing, and other tasks.
