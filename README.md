# Weather-Radar
JBoss Fuse Weather Radar API
The Scope of this exercise would be defined by following components:
 1. Weather/Radar System (External Service)
 2. ESB Weather API
    a. Receives a request
    b. Invokes external Weather/Radar Service
    c. Sends data to a Data Source (SQL Server database) 
    d. Builds and Send a Response back to API Caller
 3. Caller (Consumer) of ESB Weather API   
 
 To deploy the application in Jboss fuse server
 1. open the server in the application directory.
 2. run the the command "install mvn:com.weather/Spring-Weather/SNAPSHOT/0.0.1"
 3. After success the console will show a bundle ID
 4. To start the app, give start"Bundle ID" 
