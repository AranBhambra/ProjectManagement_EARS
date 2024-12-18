package EARS_Project_Aran;
//Employment Application Review System (EARS)

import java.util.*;

class User {
    private String username;
    private String email;
    private String password;
    // Other user details like name, title, etc.

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        // Initialize other user details
    }

    // Getters and setters for user details
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password changed successfully.");
    }
    
    public String getPassword() {
        return password;
    }

    // Additional methods for updating user information
}

class FacultySearch {
    private String committeeChair;
    private List<String> committeeMembers;
    private String position;
    private Date startDate;
    private Date endDate;
    // Other search details

    public FacultySearch(String chair, String position, Date startDate, Date endDate) {
        this.committeeChair = chair;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
        committeeMembers = new ArrayList<>();
        // Initialize other search details
    }

    public void addCommitteeMember(String member) {
        committeeMembers.add(member);
        System.out.println(member + " added to the committee.");
    }

    public void listCommitteeMembers() {
        System.out.println("Committee Members:");
        for (String member : committeeMembers) {
            System.out.println(member);
        }
    }

    // Additional methods for managing committee members, etc.
}

class Application {
    private String applicantName;
    private String status;
    // Other application details

    public Application(String applicantName, String status) {
        this.applicantName = applicantName;
        this.status = status;
        // Initialize other application details
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Application status updated successfully.");
    }

    public void setStatusFromOptions() {
        Scanner scanner = new Scanner(System.in);
        String[] validStatuses = {"Submitted", "Under Review", "Interview Scheduled",
                "Pending Decision", "Accepted", "Rejected"};

        System.out.println("Select the status for the application:");
        System.out.println("Choose from the following options:");

        for (int i = 0; i < validStatuses.length; i++) {
            System.out.println((i + 1) + ". " + validStatuses[i]);
        }

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (choice >= 1 && choice <= validStatuses.length) {
            this.status = validStatuses[choice - 1];
            System.out.println("Application status updated successfully.");
        } else {
            System.out.println("Invalid choice. Application status remains unchanged.");
        }
    }
    
    

    // Additional methods for updating application status can be added here
}

   

class EARSManagementSystem {
    private Map<String, User> users;
    private List<FacultySearch> facultySearches;
    private Map<String, Application> applications;

    public EARSManagementSystem() {
        users = new HashMap<>();
        facultySearches = new ArrayList<>();
        applications = new HashMap<>();
    }
    
    public void addApplication(String appId, Application application) {
        applications.put(appId, application);
        System.out.println("Application added successfully.");
    }

    public void addUser(String username, String email, String password) {
    	User newUser = new User(username, email, password);
        users.put(username, newUser);
        System.out.println("User added successfully.");
    }

    public void addFacultySearch(FacultySearch search) {
        facultySearches.add(search);
        System.out.println("Faculty search added successfully.");
    }

    public void listApplications() {
    	for (Map.Entry<String, Application> entry : applications.entrySet()) {
            String appId = entry.getKey();
            Application app = entry.getValue();
            System.out.println("Application ID: " + appId);
            System.out.println("Applicant Name: " + app.getApplicantName());
            System.out.println("Status: " + app.getStatus());
        }
    }

    public void updateApplicationStatus(String appId, String newStatus) {
        Application app = applications.get(appId);
        if (app != null) {
            app.updateStatus(newStatus);
        } else {
            System.out.println("Application not found.");
        }
    }

    public void changeUserPassword(String username, String newPassword) {
        User user = users.get(username);
        if (user != null) {
            user.changePassword(newPassword);
        } else {
            System.out.println("User not found.");
        }
    }
    
    public User authenticateUser(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful.");
            return user;
        } else {
            System.out.println("Invalid username or password.");
            return null;
        }
    }
    
 // Function to create a new faculty search
    public void createFacultySearch(String chair, String position, Date startDate, Date endDate) {
        FacultySearch newSearch = new FacultySearch(chair, position, startDate, endDate);
        facultySearches.add(newSearch);
        System.out.println("Faculty search added successfully.");
    }
    
 // Function to display user account settings and allow modification
    public void updateUserAccountSettings(User user, String newEmail, String newName, String newTitle, String newPassword) {
        user.setEmail(newEmail);
        // Similarly, set new name, title, password
        System.out.println("User account settings updated successfully.");
    }

    public boolean checkExistingUser(String username) {
        for (User user : users.values()) {
            if (user.getUsername().equals(username)) {
                return true; // User already exists
            }
        }
        return false; // User does not exist
    }
    
    // Other methods for managing users, faculty searches, etc.
}

public class EARSMain {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        EARSManagementSystem system = new EARSManagementSystem();

	        // Adding initial users
	        system.addUser("aran", "aran@gmail.com", "0000");
	        system.addUser("zoro", "zoro@gmail.com", "0000");
	        
	        //Adding initial applicaitons
	        Application newApp1 = new Application("Cicle", "Accepted");
	        Application newApp2 = new Application("Triangle", "Pending Decision");
	        Application newApp3 = new Application("Square", "Submitted");
	        
	        system.addApplication("App1", newApp1);
	        system.addApplication("App2", newApp2);
	        system.addApplication("App3", newApp3);
	        int count=3;

	        System.out.println("\nWelcome to the EARS Management System!");

	        // Login
	        System.out.println("\nLogin:");
	        System.out.println("Enter your username:");
	        String usernameInput = scanner.nextLine();
	        System.out.println("Enter your password:");
	        String passwordInput = scanner.nextLine();

	        User loggedInUser = system.authenticateUser(usernameInput, passwordInput);
	        if (loggedInUser != null) {
	            // Add new user
	            System.out.println("\nEnter details for a new user:");
	            System.out.print("New Username: ");
	            String newUsername = scanner.nextLine();

	            // Check if the entered username already exists
	            if (!system.checkExistingUser(newUsername)) {
	                System.out.print("Email: ");
	                String email = scanner.nextLine();
	                System.out.print("Password: ");
	                String password = scanner.nextLine();

	                system.addUser(newUsername, email, password);
	            } else {
	                System.out.println("Username already exists. Please choose a different username.");
	            }

	            // Create new faculty search
	            System.out.println("\nEnter details for a new faculty search:");
	            System.out.print("Committee Chair: ");
	            String chair = scanner.nextLine();
	            System.out.print("Position: ");
	            String position = scanner.nextLine();
	            // Add start and end dates (for example purposes)
	            Date startDate = new Date();
	            Date endDate = new Date();

	            system.createFacultySearch(chair, position, startDate, endDate);
	            
	            
	            // Add Applications
		        System.out.println("Enter the number of applications to add:");
		        int numApplications = scanner.nextInt();
		        scanner.nextLine(); // Consume the newline character

		        int initialApplications = count;
		        for (int i = initialApplications; i < initialApplications + numApplications; i++) {
		            System.out.println("\nEnter details for Application " + (i + 1) + ":");
		            System.out.print("Applicant Name: ");
		            String appName = scanner.nextLine();

		            Application newApp = new Application(appName, ""); // Status to be set later
		            newApp.setStatusFromOptions(); // Set status through user input
		            system.addApplication("App" + (i + 1), newApp);
		        }
		        
		        FacultySearch newSearch = new FacultySearch(chair, position, new Date(), new Date());
		        system.addFacultySearch(newSearch);

		        // List Applications
		        system.listApplications();
		        
		        // Ask to update
		        System.out.println("If you want to update your account settings enter 'y', else 'n': ");
		        String update=scanner.nextLine();
		        
		        if(update.equals("y")) {
		        	// Update user account settings
		            System.out.println("\nEnter new email:");
		            String newEmail = scanner.nextLine();
		            System.out.println("Enter new name:");
		            String newName = scanner.nextLine();
		            System.out.println("Enter new title:");
		            String newTitle = scanner.nextLine();
		            System.out.println("Enter new password:");
		            String newPassword = scanner.nextLine();

		            system.updateUserAccountSettings(loggedInUser, newEmail, newName, newTitle, newPassword);
		            
		            System.out.println("EXITED THE SYSTEM!");
		        }
		        else {
		        	System.out.println("EXIT!");
		        }

	            
	        } else {
	            System.out.println("Login failed. Invalid username or password.");
	        }

	    }
}
