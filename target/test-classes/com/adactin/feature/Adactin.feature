Feature: Hotel Booking in Adactin Application

@somkeTest
Scenario Outline: Login
Given user Launch The Application
When user Enter The "<username>" In Username Field
And User Enter The "<password>" In Password Field
Then user Click On The Login Button And It Navigates To Search Hotel Page

Examples:
|username|password|
|Gibofariz|G777#b1|
|Gibofariz|G777@l|
|Gibofariz|G777#bl|

@sanityTest
Scenario: Search Hotel

When user Select The "Paris" as Location
And user Select The "Hotel Cornice" as Hotel
And user Select The "Deluxe" as Room Type
And user Select The "2" as Number Of Rooms
And user Select The "21/11/2021" as Check In Date
And user Select the "23/11/2021" as Chcek Out Date
And user Select "3" as Adults Per Room
And user Select "1" as Children Per Room
Then user Click On The Search Button And It Navigates To Select Hotel Page

@sanityTest
Scenario: Select Hotel

When user Select The Radio Button To Select The Hotel 
Then user Click On The Continue Button And It Navigates To Book A Hotel Page

@sanityTest
Scenario: Book A Hotel

When user Enter The "Gibril" In First Name Field
And user Enter The "Fariz" In Last Name Field
And user Enter The "No.215,9th main Road, newyark" In Billing Address Field
And user Enter The "9876543210987654" In Credit Card Number Field
And user Select The Credit Card Type In Credit card Field
And user Selcet The Expiry Month In Expiry Month Field
And user Select The Expiry Year In Expiry Year Field
And user Enter The CVV Number In CVV Number Field
Then user Click On The Book Now Button And It Navigates Booking Confirmation Page

@sanityTest
Scenario: Booking Confirmation

Then user Click On The My Itinerary Button And It Navigates To Booked Itinerary Page

@regressionTest
Scenario: Logout

Then user Click On The Logout Button And It Navigates To Login Page
 