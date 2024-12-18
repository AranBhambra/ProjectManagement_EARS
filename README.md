# 🖥️ EARS Project (Employment Application Review System)

The Employment Application Review System (EARS) is a **Java-based system** designed to streamline and manage the process of reviewing employment applications. The system allows administrators to efficiently manage users, applications, and faculty searches.

---

## 🚀 **Features**
- **User Authentication**: Secure login system with username and password.  
- **User Management**: Ability to create, update, and modify user account details.  
- **Application Tracking**: Add, list, and update the status of employment applications.  
- **Faculty Search Management**: Manage committee members, search positions, and search timeframes.  

---

## 📜 **Usage**
1. **Run the Project**: Compile and run the `EARSMain.java` file to start the system.  
2. **Login**: Use the initial login credentials provided in the main file.  
   - **Example**:  
     ```
     Username: aran  
     Password: 0000
     ```
3. **System Operations**:  
   - **Create Users**: Add new users to the system.  
   - **Create Faculty Search**: Start a new faculty search process.  
   - **Manage Applications**: Add, list, and update application statuses.  

---

## 💻 **Code Overview**

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
- **User Management**:  
  - `addUser()`, `changeUserPassword()`, `authenticateUser()`  
- **Application Management**:  
  - `addApplication()`, `listApplications()`, `updateApplicationStatus()`  
- **Faculty Search Management**:  
  - `addFacultySearch()`, `createFacultySearch()`  

---

## 📚 **How to Run**
1. **Clone this repository**:  
   ```bash
   git clone https://github.com/your-username/EARS_Project_Aran.git
