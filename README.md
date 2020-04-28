# CurrencyApp

We are going to be creating a currency app with Spring Boot, PostgreSQL and React.

The steps for creating this application: 
- Initialize the project with Spring initializr. Start with the folowing dependencies:
    - Web: Spring Web Starter
    - JPA: Spring Data JPA
    - H2 Database
    - PostgreSQL Driver
    - Lombok
    - Spring Boot DevTools
- Create your model and repository. 
- Add the correct settings to application.properties. 
- Use CommandLineRunner in your main application class to insert some demo data. 
- Run your code and select your table in H2 to see your demo data. 
- Add controllers

### Security
- Add dependencies (security + jjwt)
- Set configuration
- Define User entity and repository
- Create UserDetailServiceImpl
- Finish Security Configuration
- Save demo data in CommandLineRunner

## JWT
- Create a service that creates and validates JWT tokens. 
- Create a class with user credentials
- Make filters for login and authentication
- Finalize the SecurityConfiguration
