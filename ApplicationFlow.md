# Application Flow


### User Sign up

1. User chooses sign up on the menu (available on all pages, unless the user 
is signed in already).
1. User fills out the sign up form and submits.
1. Request goes to ShowSignUpAction.
1. ShowSignUpAction redirects to signUpAction.
1. signUpAction creates a user object and then creates user in the database.
1. Response to user confirming addition (show a message on the jsp)

### User Sign In

1. User chooses any of the menu in Tab will redirect to sign in (available on all pages, unless the user 
is signed in already).
1. User enters EmailId and password on form and submits. 
1. If user is authenticated, the server will handle allowing access to edit 
pages.  StrutsAuthenticationInterceptor used for authentication (users, users_roles, and roles table).
1. If authentication fails, show error message/page.

### Enter Expense

1. User chooses Enter Expense on the menu (available on all pages).
1. Request goes to ShowEnterExpenseAction.
1. ShowEnterExpenseAction redirects to EnterExpenseAction.
1. EnterExpenseAction uses DAO to save all data from the Jsp.
1. Response to user confirming addition (show a message on the jsp)

### View Expense

1. User chooses View Expense on the menu (available on all pages).
1. Page sends a request to ShowViewExpenseAction 
1. ShowViewExpenseAction redirects to ViewExpenseAction along with criteria 
(Date).
1. ViewExpenseAction uses the ExpenseDao to select expenses according to criteria.
1. Dao performs select and creates expense objects from results.
1. Dao returns list of expenses to Action.
1. Action sends list back to ViewExpenseTable jsp.
1. ViewExpenseTable jsp displays the expense.
1. viewExpenseChart will displays list of expense for month that user selected as Date. 


### Edit Expense

1. User chooses Edit on the menu. (available on all pages).
1. Page sends a request to ShowEditExpenseAction.
1. ShowEditExpenseAction redirects to EditExpenseAction along with criteria 
(Date selected by user).
1. EditSelectedExpenseAction uses the Expense dao to select expenses according to criteria.
1. Dao performs select and creates expense objects from results.
1. Dao returns list of expenses criteria.
1. EditExpensesAction sends list back to viewExpenseList jsp.
1. Response to user confirming addition (show a message on the jsp).










 