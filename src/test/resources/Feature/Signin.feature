Feature: User should be inthe Adactin Webpage
Scenario Outline: User should be in the vaild credentials
Given User should be in Adactin homepage
When User should enters vaild "<Username>" and "<Password>"
And User should click the Sucessful login button
And User should verify the login sucessful message
And User should verify searchhotelpage "<Location>","<Hotels>","<Roomtype>","<NumberofRooms>","<Checkindate>","<Checkoutdate>","<Adultsperroom>","<Childrenperroom>"
And User should verified searchbutton sucessful 
And User should selecthotel from the button sucessfully
And User should click the continuepage
And User should be in the Book a Hotel with entervaild "<firstnam>"
And User should Enter the Lastname "<Lastname>"
And User should vaildate the "<BillingAddress>","<Credit>"
And User should Enter the "<Creditcardtype>","<ExpiryDate>","<ExpiryYear>"
And Userb should in the cvv "<CVV>"
And User should click the booknow "<BookNow>"

Examples: 
|Username      |Password |Location|Hotels     |Roomtype|NumberofRooms|Checkindate|Checkoutdate|Adultsperroom|Childrenperroom|firstnam       |Lastname|BillingAddress|Credit          |Creditcardtype  |ExpiryDate|ExpiryYear|CVV|
|sandhyasaurabh|123456789|Brisbane|Hotel Creek|Standard|2            |11/03/2023 |12/01/2023  |3            |4              |Sandhya shri    |Saurabh |Bangalore     |1234567886788855|American Express|January   |2019      |129|




