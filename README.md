ST10454421 Mananjalo Mfeka

First, i created a new Android project in Android Studio. Make sure to select Kotlin as the primary language andupdated my imulator for my android studio to be a bit faster.
the i imlpemented  my app and created an API service and implemented Setting Up the Project
from there i started Adding Dependencies
fast forward i started creating data models
4. getting Up Retrofit
5.things were going good so i started fetching weather data

https://github.com/ST10454421/Myfirstexam/edit/master/README.md


![Screenshot (23)](https://github.com/ST10454421/Myfirstexam/assets/164014886/ef5a8563-ba45-46b5-bc9b-5259ca8e38cf)

![Screenshot (21)](https://github.com/ST10454421/Myfirstexam/assets/164014886/fe0ef621-9a06-4799-ab99-fb18113ec3c3)

![Screenshot (19)](https://github.com/ST10454421/Myfirstexam/assets/164014886/ac5b1790-08f4-467a-8ba0-c3b992650598)
Initialize the Application

Set up the user interface with input fields and display areas.
Initialize necessary variables and objects (e.g., API keys, URL endpoints, data structures).
User Input

Prompt the user to enter the city name.
Fetch Weather Data

Make an API call to the weather service to get the 7-day forecast for the specified city.
Handle the API response and parse the JSON data into a usable format.
Process Weather Data

Extract weather information for each day from Monday to Sunday.
Store the data in a structured format (e.g., list or array).
Display Weather Data

Update the user interface to display the weather forecast for each day.
Include details such as temperature, humidity, and weather description.
Error Handling

Implement error handling for scenarios such as invalid city names, API call failures, and data parsing errors.
Display appropriate error messages to the user.
End

Flowchart
Let's describe the flowchart step-by-step:

Start
Initialize Application
Set up UI elements
Initialize variables and objects
User Input
Prompt for city name
Fetch Weather Data
Make API call to get 7-day forecast
API Call Successful?
If no, go to Error Handling
If yes, continue to Process Weather Data
Process Weather Data
Parse JSON response
Extract and store data for each day
Display Weather Data
Update UI with forecast from Monday to Sunday
Error Handling
Display error messages
End
Flowchart Diagram
Here's a textual representation of the flowchart:

sql
Copy code
            +-------------------+
            |       Start       |
            +-------------------+
                    |
                    v
            +-------------------+
            | Initialize App    |
            +-------------------+
                    |
                    v
            +-------------------+
            |   User Input      |
            +-------------------+
                    |
                    v
            +-------------------+
            | Fetch Weather Data|
            +-------------------+
                    |
                    v
       +------------------------------+
       | API Call Successful?         |
       |   (Yes)        (No)          |
       +-------+          +-----------+
               |          |
               v          v
     +----------------+  +----------------+
     | Process Weather|  |  Error Handling|
     |      Data      |  |  Display Error |
     +----------------+  +----------------+
               |
               v
     +------------------+
     | Display Weather  |
     |     Data         |
     +------------------+
               |
               v
           +-----------+
           |    End    |
           +-----------+



