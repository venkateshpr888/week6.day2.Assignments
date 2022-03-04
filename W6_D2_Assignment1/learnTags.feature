Feature: Testcases using LeafTaps
Background: 
Given Load the application url as 'http://leaftaps.com/opentaps'
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login as 'decorativeSubmit' 
And Click on Homepage as 'CRM/SFA'
@Smoke @Regression
Scenario Outline: TestCase1_CreateContact
When Click Contacts 
And Click Create Contacts
Given First Name as <Fname>
And Last name as <Lname>
When Click submit
And Find Name
Then Print Name
Examples:
|Fname|Lname|
|'venkatesh'|'ravi'|
@Sanity
Scenario: TestCase_EditLead
When Click on Lead 
And Click on Find Lead
Given Change Company Name as 'LEAF TEST'
When Click Submit for company
Then Changed Company Name

@Functional
Scenario: TestCase_DuplicateLead
When Click on Lead for Delete 
And Click on Find Lead to delete
And Click Email
Given Enter Email Address as 'venkatesh@gmail.com'
When Click DuplicateLead
Then Lead Duplicated


