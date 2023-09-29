# What is port conflict? How to fix it?
* A port conflict ouccer when one or more programs want to use the same port.
* Intialy one of them using that port second one is trying to use that port then port conflict will ouccer.
# How to fix it:
* first step go to browser and type http://localhost:8080 and get which one has that port number. lets say you will get oracle database occupy that port then
* Go to win+r and type  services.msc click enter, scroll down to find the service named OracleOraDB18Home1TNSListener or a similar name (it might vary based on your Oracle version and installation). This is the Oracle Listener service.
  Right-click on the service and select "Stop" from the context menu.
  Once you stop the Oracle Listener service, the Oracle database server will be stopped. Now port number 8080 is free to use
