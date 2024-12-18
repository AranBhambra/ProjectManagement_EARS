# EARS Project (Employment Application Review System)

The Employment Application Review System (EARS) is a **Java-based system** designed to streamline and manage the process of reviewing employment applications. The system allows administrators to manage users, applications, and faculty searches efficiently.

---

## 🚀 Features

- **User Authentication**: Secure login system with username and password.
- **User Management**: Ability to create, update, and modify user account details.
- **Application Tracking**: Add, list, and update the status of employment applications.
- **Faculty Search Management**: Manage committee members, search positions, and search timeframes.

---

## 📜 Usage

1. **Run the Project**: Compile and run the `EARSMain.java` file to start the system.
2. **Login**: Use the initial login credentials provided in the main file.  
   **Example**:  
   ```
   Username: aran  
   Password: 0000
   ```
3. **System Operations**:  
   - **Create Users**: Add new users to the system.  
   - **Create Faculty Search**: Start a new faculty search process.  
   - **Manage Applications**: Add, list, and update application statuses.  

---

## 💻 Code Overview

### 1️⃣ **User.java**

**Attributes**:  
- `username`  
- `email`  
- `password`  

**Methods**:  
- `getUsername()`, `setUsername()`: Get and set the username.  
- `getEmail()`, `setEmail()`: Get and update the user's email.  
- `changePassword()`: Update the user's password.  

---

### 2️⃣ **Application.java**

**Attributes**:  
- `applicantName`  
- `status`  

**Methods**:  
- `getApplicantName()`, `getStatus()`: Get application details.  
- `updateStatus()`: Update the application status.  
- `setStatusFromOptions()`: Select from pre-defined status options.  

---

### 3️⃣ **FacultySearch.java**

**Attributes**:  
- `committeeChair`  
- `position`  
- `startDate`  
- `endDate`  
- `committeeMembers`  

**Methods**:  
- `addCommitteeMember()`: Add new members to the committee.  
- `listCommitteeMembers()`: Display the list of members in the committee.  

---

### 4️⃣ **EARSManagementSystem.java**

**Attributes**:  
- `users`  
- `facultySearches`  
- `applications`  

**Methods**:  
- **User Management**: `addUser()`, `changeUserPassword()`, `authenticateUser()`  
- **Application Management**: `addApplication()`, `listApplications()`, `updateApplicationStatus()`  
- **Faculty Search Management**: `addFacultySearch()`, `createFacultySearch()`  

---

## 📚 How to Run

1. **Clone this repository**:  
   ```bash
   git clone https://github.com/your-username/EARS_Project_Aran.git
   ```
2. **Open the project** in your preferred Java IDE (like IntelliJ or Eclipse).  
3. **Compile and run** the `EARSMain.java` file.  

---

## 🛠️ System Workflow

1. **Login**: Users log in using their username and password.  
2. **User Management**: Admins can create new users or modify existing user information.  
3. **Application Handling**: Add new applications, view existing applications, and update the status of applications.  
4. **Faculty Search Management**: Create new faculty searches, assign committee members, and track progress.  

---

## ⚙️ Pre-defined Status Options for Applications

- **Submitted**  
- **Under Review**  
- **Interview Scheduled**  
- **Pending Decision**  
- **Accepted**  
- **Rejected**  

---

## 🌐 Technologies Used

- **Java**: Core programming language.  
- **OOP**: Object-Oriented Programming principles.  
- **Data Structures**: Lists, Maps, and Collections for efficient data handling.  

---

## 📢 Future Enhancements

- **Add GUI**: Replace the console-based UI with a graphical user interface.  
- **Database Integration**: Store user, application, and search data in a database.  
- **Advanced Authentication**: Include password hashing and multi-factor authentication.  

---

## 🧑‍💻 Contributing

Contributions are welcome! If you'd like to contribute:  
1. Fork the repository.  
2. Create a feature branch.  
3. Make your changes.  
4. Submit a pull request.  

---

**Enjoy using the EARS Project! 🚀**
