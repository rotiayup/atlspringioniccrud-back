FROM openjdk:17
COPY ./target/demo-0.0.1-SNAPSHOT.war serviceioniccrud.war
# COPY keystore.jks /keystore.jks
# COPY keystore.p12 /keystore.p12
# portatiletik aldaketa
EXPOSE 443
# EXPOSE 8443
# EXPOSE 9001
ENTRYPOINT ["java","-jar","/serviceioniccrud.war"]
