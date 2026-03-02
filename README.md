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

### Authentication & Access Control
When the librarian enters a valid username and password, and clicks the login button, the system has been set to authenticate the credentials using UserAccount Directory, checks and verifies that the associated profile is a Librarian Profile and leads us to the Librarian Work Area panel using CardLayout. And when the logout button is clicked, the system has been set to clear the work area, returns to the home screen, and resets the login fields.

The librarian is authorized to access only the Librarian Work Area. Librarians cannot access Admin, Student, or Faculty panels. Also, only users with a LibrarianProfile can open and use the Librarian Work Area.

**This process is repeated for all roles to access their respective work areas. Only users with the correct login and password are able to access their respective work panels.**

### Features Implemented
**Lajona Rajan- Librarian Use Case** 
- Librarian features to manage library books (add, update, delete, view books).
- Librarian role to issue books by storing the NUID, Book ID, Author name, Availability,  Issue Date and Due Date.
- Librarian role to accept returned books by checking the Book ID, Book Name, Author Name, Issue Date, Due Date and Return Date. Check the number of days late, fine per day and calculate the total fine.
- Librarian role to view the profile and edit it.

**Kenneth Garcia – Student Use Case**
- Manage course work, track progress (grade), upload and save files for assignments.
- Add and drop courses, addable by using the course name e.g. INFO5001.
-	Perform graduation audit.
- View transcript of all courses taken and the semester they were taken. Also able to access total credits earned as calculated and GPA.

**Merin Godly -  Administrator Use Case**
-	Register individuals within the system, including students, faculty members, and employees/admins, creating their user accounts for system access.
- Manage student, faculty, and employee/admin records, including viewing, updating, and deleting records as needed.
- Maintain and update personal login credentials.

**Hannah Chiou – Faculty Use Case**
- Create and delete course information, and update course name, number, and credits.
- View student profile information, including student’s ID, number of courses taken with the current faculty, average grades, transcript, and hobbies / interests
- View student performance in current courses, including student’s ID, current course(s) taught by faculty that student is enrolled in, course credits, and grade.
- Maintain and update personal login credentials.

### Usage InstructionsStudent Role Example

- Utilize the student credentials (User: adam, PW: ****) and login will take you to the Student Work Area where you can manage course work, register/drop classes, perform a graduation audit, and view transcript of academic history
- Manage course work: Immediately viewable is the student’s course load/seat assignments along with their current grade to track progress. You can select a course and click the next button to access the course to upload and save files for assignments
-	Registration allows the student to add and drop courses, addable by using the course name e.g. INFO5001 and removable by selecting one of the currently enrolled courses and pressing the drop button. Price of the course is viewable and enrollments and dropped courses are immediately reflected in the manage course work JPanel
-	Graduation audit: courses that are labeled as core are in view with either the student’s grade or that it is not taken as well as a text field identifying what fraction of core courses have been taken. Elective courses are labeled as elective and are only in view if they have been taken. A counter of how many electives have been taken is updated appropriately.
-	Transcript is viewable has all courses taken in view as well as the semester they were taken. Total credits earned is calculated and viewable based on the credit hours of a course multiplied by the grade. Similar calculation is done for GPA

Admin Role Example

- Utilize the admin credentials (Username: admin, PW:****) and login to take you to the Administrator Work Area where you can manage User Accounts, Register Persons, Manage Faculty/Students/Employees, and manage your own profile.
- Manage User Accounts: Provides a comprehensive view of all user accounts in the system, including username, role, last accessed date, and last updated date.
- Register Persons: Enables the creation of new user accounts by selecting a role (admin, faculty, or student) and setting login credentials.
- Manage Faculty: Allows you to view a table listing all Faculty user accounts in the system. Three actions are available: Create Faculty, Delete Faculty, and View Faculty.
    - Create Faculty: Creates a new Faculty user account by setting login credentials, automatically adding the account to the system with a Faculty role.
    -	Delete Faculty: Removes a selected Faculty user account from both the Faculty table and the system’s User Accounts. A row must be selected to perform this action; otherwise, the system will prompt you to select one.
    - View Faculty: Displays the details of a selected Faculty account, such as login credentials, and allows you to edit or update them. Like Delete, this action requires a row to be selected.
-	Manage Students: Allows you to view a table listing all Student user accounts in the system. Three actions are available: Create Student, Delete Student, and View Student.
    -	Create Student: Creates a new Student user account by setting login credentials, automatically adding the account to the system with a Student role.
    -	Delete Student: Removes a selected Student user account from both the Student table and the system’s User Accounts. A row must be selected to perform this action; otherwise, the system will prompt you to select one.
    -	View Student: Displays the details of a selected Student account, such as login credentials, and allows you to edit or update them. Like Delete, this action requires a row to be selected.
-	Manage Employees: Allows you to view a table listing all Employee user accounts in the system. Three actions are available: Create Employee, Delete Employee, and View Employee.
    -	Create Employee: Creates a new Employee user account by setting login credentials, automatically adding the account to the system with a Employee role.
    -	Delete Employee: Removes a selected Employee user account from both the Employee table and the system’s User Accounts. A row must be selected to perform this action; otherwise, the system will prompt you to select one.
    -   View Employee: Displays the details of a selected Employee account, such as login credentials, and allows you to edit or update them. Like Delete, this action requires a row to be selected
-	My Profile: Provides access to your personal profile, allowing you to view and update your login credentials as needed.

Faculty Role Example

-	First, login using provided faculty account (username: faculty, password: ****10) to view the Faculty Profile main page, which has buttons directing user to all functionalities of a faculty. 
-	Manage course information: Allows a user to view information about the courses they currently teach and manage them as needed.
    -	Delete course: A user can delete any course they teach using the Delete Course button. 
    -	Update course: A user can update course information, including the course name, the course number / code, and the credits the course is worth using the Update Course Details button. 
-	Manage own profile: Users can view their current username and password, their role, and their average rating, as calculated by their ratings by students from past courses.
    -	Update username and/or password: A user can update their username and/or password using the Update Profile button. 
-	View information about students enrolled in courses: A Faculty user can view general information about the students enrolled in their courses, including the total number of credits and the student’s average grade so far, their hobbies / interests, and their transcript score.
-	View current academic performance for students enrolled in courses: A Faculty user can track how all students across all their courses are doing so far, by seeing their grades and letter grades in the courses the students are taking. 



### Testing Guide
Outline how to test the system, including sample test cases.
Explain how to verify that authentication and authorization work correctly.

### Challenges & Solutions
•	Because we were working on individual branches, sometimes errors were not clear until we worked off of the main branch. 
  - *Solution:* Communicate with other team members to find where the error(s) were.
- For some members, Git / GitHub was a new resource so learning how to resolve merge conflicts, use a new interface, learn what Git actually does, etc.
  - *Solution:* Independent research and communicating with team members. More experienced members would also try to show other members how to use these tools.
-	Some overlap with classes or features that other team members had already created
  - *Solution:* Using merge conflict to resolve any differences and having open communication with other members so everyone was aware of what was being changed. 

### Future Enhancements
**Librarian Use Case**
-	When searching using the Book ID, details about the book and information about who has borrowed it can be made visible.
-	When a book is issued, it can be made visible in the Faculty and Student work areas through a “Library” button.

**Administrator Use Case**
-	Add support for additional user profile fields, such as NUID, department, contact information, and role-specific metadata.
-	Add search, filter, and sort functionality for user, student, faculty, and employee tables to improve navigation.

**Faculty Use Case**
-	View course schedule for each semester, which is especially helpful for faculty teaching multiple classes in a semester.
-	Add ability to view past course offerings, including past rosters of students associated with each course offering and their performance in the class.  
-	Add more specificity for each faculty’s profile, such as the college and department they teach in or their position (assistant professor, lecturer, full professor, etc).
-	Add ability to search through all courses taught by faculty. 
-	Instead of seeing all students for all courses in one table, include more of a hierarchy where Faculty users first choose the course they’d like to see more information on, and then see the associated students and student information just for that class. 

### Contribution Breakdown
**Kenneth Garcia**
-	Pulled and merged the module 7 code skeleton which contains most of the classes utilized
-	Modified the ConfigureABusiness java class to hardcode in example department, courses, new course schedules, create course offerings by assigning courses to either schedule, arbitrarily labeled courses as either core or elective for the graduation audit, created a course load object for the sample student profile and registered them to two seat assignments
-	Coded the userInterface.WorkAreas.StudentRole JPanels
-	Modified other classes as necessary to fulfill the student role responsibilities
-	Some amount of troubleshooting

**Lajona Rajan**
-	Updated ConfigureABusiness class for pre-populating the library books in the table and set the librarian username and password
-	Updated ProfileWorkAreaMainFrame to implement the login and the logout buttons
-	Created a package  Library. Profile and create the classes Book and Book Directory to set informations and methods regarding the books
-	Created and implemented LibrarianWorkAreaJPanel, LibrarianProfileJPanel,ManageBooksJPanel,AddUpdateBookJPanel,IssueBookJPanel,ReturnBookJPanel for the librarian use case

**Merin Godly**
-	Developed the complete Admin role interface, including all backend logic, data handling, and user interactions.
-	Coded the userInterface.WorkAreas.AdminRole JPanels.
-	Integrated and modified supporting classes to manage student, faculty, and employee records within the admin workflow.
-	Performed and tested full CRUD operations (create, read, update, delete) on student, faculty, and employee records.
-	Consolidated individual team member walkthroughs into a single cohesive video presentation for project submission.

**Hannah Chiou**
-	Developed all panels associated with Faculty, including faculty profile, student performance and overview, and course management
-	Tested create, update, and delete functionalities for faculty profile and course information
-	Modified other classes as needed to access student academic information and course information
-	Created documentation and consolidated member contributions to GitHub README

All members communicated regularly using Microsoft Teams.
