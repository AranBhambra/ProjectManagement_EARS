<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EARS Project (Employment Application Review System)</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            color: #333;
            margin: 0;
            padding: 0 20px;
            background-color: #f4f4f9;
        }
        h1, h2, h3, h4 {
            color: #555;
        }
        header {
            text-align: center;
            padding: 30px 0;
            background-color: #333;
            color: #fff;
        }
        section {
            margin-bottom: 20px;
        }
        code {
            background-color: #f4f4f4;
            padding: 4px 6px;
            border-radius: 4px;
            font-size: 1rem;
        }
        pre {
            background-color: #f4f4f4;
            padding: 15px;
            border-radius: 5px;
            overflow-x: auto;
        }
        ul {
            list-style-type: disc;
            padding-left: 40px;
        }
        .code-block {
            background-color: #272822;
            color: #f8f8f2;
            padding: 15px;
            border-radius: 5px;
            overflow-x: auto;
        }
    </style>
</head>
<body>
    
<header>
    <h1>EARS Project (Employment Application Review System)</h1>
    <p>The Employment Application Review System (EARS) is a Java-based system designed to streamline and manage the process of reviewing employment applications. The system allows administrators to manage users, applications, and faculty searches efficiently.</p>
</header>

<section>
    <h2>🚀 Features</h2>
    <ul>
        <li><strong>User Authentication:</strong> Secure login system with username and password.</li>
        <li><strong>User Management:</strong> Ability to create, update, and modify user account details.</li>
        <li><strong>Application Tracking:</strong> Add, list, and update the status of employment applications.</li>
        <li><strong>Faculty Search Management:</strong> Manage committee members, search positions, and search timeframes.</li>
    </ul>
</section>

<section>
    <h2>📜 Usage</h2>
    <ol>
        <li><strong>Run the Project:</strong> Compile and run the <code>EARSMain.java</code> file to start the system.</li>
        <li><strong>Login:</strong> Use the initial login credentials provided in the main file (example: <code>username: aran</code>, <code>password: 0000</code>).</li>
        <li><strong>System Operations:</strong>
            <ul>
                <li>Create Users: Add new users to the system.</li>
                <li>Create Faculty Search: Start a new faculty search process.</li>
                <li>Manage Applications: Add, list, and update application statuses.</li>
            </ul>
        </li>
    </ol>
</section>

<section>
    <h2>💻 Code Overview</h2>
    <h3>1️⃣ User.java</h3>
    <ul>
        <li><strong>Attributes:</strong> username, email, password</li>
        <li><strong>Methods:</strong>
            <ul>
                <li><code>getUsername()</code>, <code>setUsername()</code>: Get and set the username.</li>
                <li><code>getEmail()</code>, <code>setEmail()</code>: Get and update the user's email.</li>
                <li><code>changePassword()</code>: Update the user's password.</li>
            </ul>
        </li>
    </ul>
    
    <h3>2️⃣ Application.java</h3>
    <ul>
        <li><strong>Attributes:</strong> applicantName, status</li>
        <li><strong>Methods:</strong>
            <ul>
                <li><code>getApplicantName()</code>, <code>getStatus()</code>: Get application details.</li>
                <li><code>updateStatus()</code>: Update the application status.</li>
                <li><code>setStatusFromOptions()</code>: Select from pre-defined status options.</li>
            </ul>
        </li>
    </ul>
    
    <h3>3️⃣ FacultySearch.java</h3>
    <ul>
        <li><strong>Attributes:</strong> committeeChair, position, startDate, endDate, committeeMembers</li>
        <li><strong>Methods:</strong>
            <ul>
                <li><code>addCommitteeMember()</code>: Add new members to the committee.</li>
                <li><code>listCommitteeMembers()</code>: Display the list of members in the committee.</li>
            </ul>
        </li>
    </ul>
</section>

<section>
    <h2>🧁 System Workflow</h2>
    <ul>
        <li><strong>Login:</strong> Users log in using their username and password.</li>
        <li><strong>User Management:</strong> Admins can create new users or modify existing user information.</li>
        <li><strong>Application Handling:</strong> Add new applications, view existing applications, and update the status of applications.</li>
        <li><strong>Faculty Search Management:</strong> Create new faculty searches, assign committee members, and track progress.</li>
    </ul>
</section>

<section>
    <h2>🚀 Technologies Used</h2>
    <ul>
        <li>Java</li>
        <li>OOP</li>
        <li>Data Structures</li>
    </ul>
</section>

<section>
    <h2>🏋️‍♂️ Contributing</h2>
    <p>Contributions are welcome! If you'd like to contribute, please fork the repository and make a pull request.</p>
</section>

<section>
    <h2>🌟 Future Enhancements</h2>
    <ul>
        <li>Add GUI</li>
        <li>Database Integration</li>
        <li>Advanced Authentication</li>
    </ul>
</section>

</body>
</html>
