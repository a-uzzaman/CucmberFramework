# CucumberBDD
Java, TestNG, Maven, CucumberBDD, Gherkin, GIT and ect 

# How to run
To run full test suite, you can say "mvn verify"

Customize run:
mvn verify -Denv=qa -Dbrowser=ch -Dcucumber.filter.tags="@signIn"
User needs to provide the env type and browser type. 
Example env=qa or stg or prd and browser=ch or ff
