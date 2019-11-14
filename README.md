# mysqlrestservice
My assignment to PolSource

Hello in the following note i'll tell you how to use my RESTFUL Api.
For running project you need (Intellij IDEA/eCLIPSE IDE for Java IDE) with
Apache Maven support, MySQL 5.x, MySQL or PhpMyAdmin depends on which you prefer,
and REST client you wish. I reccomend Postman.
You should run my project as normal app. Next you open MySQL client and create an
empty database my_db.
CREATE DATABASE my_db;
Our database will automatically create tables at the runtime based on our Java
entity classes.
After doing this , Click on my project and select Rus As -> Java Application.
If you'll asked about something, select the Application class an the main class to 
execute.Try the REST APIs exposed by the NoteRepository. You can create a new note 
using POST request and read all the notes by sending a GET request to the same URL. 
To see the available functionalities, 
visit the http://localhost:8080/profile/notes URL.
in POST you can enter { "title": "Study",  "content": "You should study all your life" }
also you can use both of CRUD command's in my project, so i hope you'll enjoy it.
Best regards Illia Mokhyr
