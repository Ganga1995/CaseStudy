Feature:SignUp

Scenario: Sign Up Functinality
Given Launch Browser
When Enter the username "kumarii" 
And  Enter the firstname "GS"
And  Enter the lastname "SG"
And Enter password "123456789"
And Enter Confirm Password "123456789"
And user selects Gender
And Enter Email "kumari@gmail.com"
And Enter mobile number "1234567891"
And Enter DOB "2/2/1995"
And Enter address "Rajajinagar Banglore"
And select seciurity question
And Enter ANSWER "Dog"
And submit
Then Test if user registerd successfully