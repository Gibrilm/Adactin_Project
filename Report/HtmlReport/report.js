$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@somkeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cusername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;login;;1"
    },
    {
      "cells": [
        "Gibofariz",
        "G777#b1"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;login;;2"
    },
    {
      "cells": [
        "Gibofariz",
        "G777@l"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;login;;3"
    },
    {
      "cells": [
        "Gibofariz",
        "G777#bl"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;login;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@somkeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Gibofariz\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"G777#b1\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defination.user_Launch_The_Application()"
});
formatter.result({
  "duration": 3084828500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gibofariz",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 554642000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "G777#b1",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 263841300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 800210300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@somkeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Gibofariz\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"G777@l\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defination.user_Launch_The_Application()"
});
formatter.result({
  "duration": 548221500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gibofariz",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 311736800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "G777@l",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 266060000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 560941200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@somkeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Gibofariz\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"G777#bl\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defination.user_Launch_The_Application()"
});
formatter.result({
  "duration": 458746800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gibofariz",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 341625100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "G777#bl",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 239777600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1164083800,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user Select The \"Paris\" as Location",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user Select The \"Hotel Cornice\" as Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The \"Deluxe\" as Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The \"2\" as Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The \"21/11/2021\" as Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select the \"23/11/2021\" as Chcek Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select \"3\" as Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Select \"1\" as Children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Click On The Search Button And It Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Paris",
      "offset": 17
    }
  ],
  "location": "Step_Defination.user_Select_The_as_Location(String)"
});
formatter.result({
  "duration": 257869400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Cornice",
      "offset": 17
    }
  ],
  "location": "Step_Defination.user_Select_The_as_Hotel(String)"
});
formatter.result({
  "duration": 268790700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deluxe",
      "offset": 17
    }
  ],
  "location": "Step_Defination.user_Select_The_as_Room_Type(String)"
});
formatter.result({
  "duration": 208901400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 17
    }
  ],
  "location": "Step_Defination.user_Select_The_as_Number_Of_Rooms(String)"
});
formatter.result({
  "duration": 183546600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "21/11/2021",
      "offset": 17
    }
  ],
  "location": "Step_Defination.user_Select_The_as_Check_In_Date(String)"
});
formatter.result({
  "duration": 260832300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "23/11/2021",
      "offset": 17
    }
  ],
  "location": "Step_Defination.user_Select_the_as_Chcek_Out_Date(String)"
});
formatter.result({
  "duration": 263136700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 13
    }
  ],
  "location": "Step_Defination.user_Select_as_Adults_Per_Room(String)"
});
formatter.result({
  "duration": 203611300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    }
  ],
  "location": "Step_Defination.user_Select_as_Children_Per_Room(String)"
});
formatter.result({
  "duration": 204921700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Click_On_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1148618000,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Select Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user Select The Radio Button To Select The Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user Click On The Continue Button And It Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defination.user_Select_The_Radio_Button_To_Select_The_Hotel()"
});
formatter.result({
  "duration": 227305400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Click_On_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 935982200,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Book A Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "user Enter The \"Gibril\" In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "user Enter The \"Fariz\" In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enter The \"No.215,9th main Road, newyark\" In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Enter The \"9876543210987654\" In Credit Card Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Select The Credit Card Type In Credit card Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Selcet The Expiry Month In Expiry Month Field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Select The Expiry Year In Expiry Year Field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user Enter The CVV Number In CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user Click On The Book Now Button And It Navigates Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Gibril",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_First_Name_Field(String)"
});
formatter.result({
  "duration": 335732900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fariz",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Last_Name_Field(String)"
});
formatter.result({
  "duration": 329221200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No.215,9th main Road, newyark",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Billing_Address_Field(String)"
});
formatter.result({
  "duration": 478021000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9876543210987654",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Credit_Card_Number_Field(String)"
});
formatter.result({
  "duration": 333939100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Select_The_Credit_Card_Type_In_Credit_card_Field()"
});
formatter.result({
  "duration": 350460300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Selcet_The_Expiry_Month_In_Expiry_Month_Field()"
});
formatter.result({
  "duration": 341307700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Select_The_Expiry_Year_In_Expiry_Year_Field()"
});
formatter.result({
  "duration": 474707400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Enter_The_CVV_Number_In_CVV_Number_Field()"
});
formatter.result({
  "duration": 467588700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Click_On_The_Book_Now_Button_And_It_Navigates_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 186373800,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Booking Confirmation",
  "description": "",
  "id": "hotel-booking-in-adactin-application;booking-confirmation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 51,
  "name": "user Click On The My Itinerary Button And It Navigates To Booked Itinerary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defination.user_Click_On_The_My_Itinerary_Button_And_It_Navigates_To_Booked_Itinerary_Page()"
});
formatter.result({
  "duration": 7346933500,
  "status": "passed"
});
});