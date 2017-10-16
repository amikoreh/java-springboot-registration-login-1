# Simple Java Spring Boot Registration and Login Example
================================
* Still in development. Very simple concept to try out using Spring Boot, Data JPA, in-memory (hibernate) db with persistent SQL option.

#### Application Requires/Java Dependencies:
- Java JDK 1.8
- Maven 3.5.0
- Spring Boot (spring-boot-starter-parent - 1.4.7.RELEASE)
- Spring Security
- Spring Data JPA
- HSQLDB / MySQL 5.6+

#### Other libraries:
- Bootstrap 3.3.7
- jQuery 2.2.4

#### Build + Run:
- `$ mvn install`
- `$ mvn clean spring-boot:run`

#### Other details:
Existing user on persistent MySQL:
- PW: admintest
- UN: admintest

Run the -war / -jar from target:
- `$ java -jar target/name-of-SNAPSHOT.jar`

Make sure to use java 1.8
- `java -version`
- `$ export JAVA_HOME="$(/usr/libexec/java_home -v 1.8)"`

#### Resources:
- [Spring.io](https://spring.io/)
- [Spring Boot guides](https://spring.io/guides/gs/spring-boot/)
- [Spring Boot docs](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Maven](https://maven.apache.org/)
- [Bootstrap 3](http://getbootstrap.com)
- [sdkman.io](http://sdkman.io/)
