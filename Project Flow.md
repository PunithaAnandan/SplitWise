# Application Flow


### User Sign up

1. User chooses sign up on the menu (available on all pages, unless the user 
is signed in already).
1. User fills out the sign up form and submits.
1. Request goes to sign up servlet.
1. Servlet creates a user object and then creates user in the database.
1. Response to user confirming addition (show a message on the jsp)

### User Sign In

1. User chooses sign in on the menu (available on all pages, unless the user 
is signed in already).
1. User enters EmailId and password on form and submits. 
1. If user is authenticated, the server will handle allowing access to edit 
pages.  JDBCRealm used for authentication (users, users_roles, and roles table).
1. If authentication fails, show error message/page.

### Enter Expense

1. User chooses Enter Expense on the menu (available on all pages).
1. EnterExpenseServlet uses DAO to save all data from the Jsp.
1. Servlet sends list back to viewExpense jsp.
1. viewExpense jsp displays the reports(when user select view expense from menu).

### View Expense

1. Page sends a request to view Expense servlet along with criteria 
(Month or Year).
1. Servlet uses the Expense dao to select expenses according to criteria.
1. Dao performs select and creates expense objects from results.
1. Dao returns list of expenses to servlet.
1. Servlet sends list back to View Expense jsp.
1. View Expense jsp displays the expense.
1. Consider paging results so page does not get super long and too much data 
is sent.

### Edit Expense

1. Page sends a request to edit Expense servlet along with criteria 
(Month selected by user).
1. Servlet uses the Expense dao to select expenses according to criteria.
1. Dao performs select and creates expense objects from results.
1. Dao returns list of expenses criteria to servlet.
1. Servlet sends list back to View Expense jsp.
1. View Expense jsp displays the expense.
1. Consider paging results so page does not get super long and too much data 
is sent.

### Compare Expenses

1. Page sends a request to Compare Expenses servlet along with criteria 
(Month/Year selected by user).
1. Servlet uses the Expense dao to select expenses according to criteria.
1. Dao performs select and creates expense objects from results.
1. Dao returns list of expenses criteria to servlet.
1. Servlet sends list back to View Expense jsp.
1. View Expense jsp displays the expense.
1. Consider paging results so page does not get super long and too much data 
is sent.

### About

1. Static page - html only? 
1. Consider making contact info configurable.

### Add Trail Report
1. Option only available to logged in users with proper role
1. User selects trail to report on
1. User enters trail report details
1. Details are sent to Add Trail Report servlet
1. Servlet creates trail report object
1. Servlet sends object to dao
1. Dao adds report to the database
1. Servlet sends confirmation to report page that report has been added.

### Add Trail 
1. Option only available to logged in users with proper role
1. User enters trail  details
1. Details are sent to Add Trail  servlet
1. Servlet creates trail  object
1. Servlet sends object to dao
1. Dao adds trail to the database
1. Servlet sends confirmation to trail page that trail has been added.








 