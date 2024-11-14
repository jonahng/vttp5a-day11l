use maven repository to get more dependencies. copy the text to Pom.xml

Use bootstrap from getbootstrap.com to do javascript and html and css. No need to do css yourself

# MAVEN COMPILER COMMANDS.
in project root folder

mvnw.cmd clean 

package the compiled bytecode classes into jar file
mvnw.cmd package

this deletes the "/target" folder and redownloads the dependencies, recompiles it to class files and package to jar.
mvnw.cmd clean package

run the application in embedded local server, it downloads the dependencies and runs. Apache web server
mvnw.cmd spring-boot:run


# To set the arguments when running maven
• mvn spring-boot:run -Dspring-boot.run.arguments=“--port=3000
<space>--logLevel=TRACE”

