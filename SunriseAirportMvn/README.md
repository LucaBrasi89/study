* ----- * ----- * ----- * ----- * ----- * ----- ** ----- * ----- * ----- * ----- * ----- * ----- *

                                    SunriseAirport

                                    Main Academy graduation project

* ----- * ----- * ----- * ----- * ----- * ----- ** ----- * ----- * ----- * ----- * ----- * ----- *


    Task:
        Develop componential layered application for airport management.
        Provide:
            - view of the airline flightNumber information about arrivals and departures (separately).
            It should reflect the information about the arrival (departure) date and time,
            flightNumber number, city/port of arrival (departure), terminal, flightNumber status (check-in,
            gate closed, arrived, departed at, unknown, canceled, expected at, delayed, in
            flightNumber), gate
            - view of the flights pricelist with the class prices
            - view of the passengers list. It should reflect the information about the flightNumber
            number, passenger first name, second name, nationality, passport, date of
            birthday, sex, class (business, economy). Only for company staff
            - insert, delete and update of this information. Only for company staff
            - search by the flightNumber number, price, first and second name, passport, arrival
            (departure) port of and information output in the specified format. Clients
            information is only for company staff

    Prerequisites:

        -installed Java (version 1.8);
	    -downloaded mysql-connector-java.jar (http://central.maven.org/maven2/mysql/mysql-connector-java/5.1.21/mysql-connector-java-5.1.21.jar)
        -internet connection for connected to remote DB;

    How to run:

        Way 1:

        1. Open project in Intellij IDEA
        2. Follow to "File/Project Structure"
        3. Click to libraries section and add "mysql-connector-java.jar"
        4. Open in editor mainfile "App.java" and run it by pressing "Crtl+Shift+F10"

        Way 2:

        1. open terminal (cmd.exe for Windows or terminal for Linux)
        2. Type absolute path to jar file, and run java like see below:
            
            java -jar "path_to_jar/SunriseAirport-1.0-SNAPSHOT-jar-with-dependencies.jar"
        3. Press "ENTER" key

        
    How to use:

        There is two types of user permissions: user and company staff. Applications starts with user permission. User can see
        arrivals and depatures with information, search flights by number and airport name.
        For login like company staff - do authorization via login-password with one of the following users:

            root - root (login - passwd, case sensetive)
            admin - admin
            andrew - andrew

        Company staff can manage with clients data, search flights with more detail mechanism and show information about one.
    

    Build With:

        -JavaFX
        -JDBC (MySQL database)
        -Maven

    Authors:

        created by: Andrew Sotnikov
        email: andrew.sotnikov.eng@gmail.com



        


