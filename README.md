JSF Bootstrap Starter
=====
JSF Bootstrap starter project with Primefaces
This is Maven project that alows you to use JSF (PrimeFaces in this project) with Bootstrap framework 

## Key Files

### pom.xml

Includes project starter dependency. All other jsf dependencies are included transitively.

```xml
    <dependencies>
        <dependency>
            <groupId>javax</groupId>
            <artifactId>javaee-web-api</artifactId>
            <version>7.0</version>
            <scope>provided</scope>
        </dependency>
        
        <!-- https://mvnrepository.com/artifact/org.primefaces/primefaces -->
        <dependency>
            <groupId>org.primefaces</groupId>
            <artifactId>primefaces</artifactId>
            <version>6.1</version>
        </dependency>
        
        <!-- https://mvnrepository.com/artifact/org.webjars/bootstrap -->
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>bootstrap</artifactId>
            <version>3.3.7</version>
        </dependency>
        
        <!-- https://mvnrepository.com/artifact/org.webjars/jquery -->
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>jquery</artifactId>
            <version>3.2.1</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.webjars/font-awesome -->
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>font-awesome</artifactId>
            <version>4.7.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.webjars/holderjs -->
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>holderjs</artifactId>
            <version>2.5.2</version>
        </dependency>


    </dependencies>
```

### src/main/webapp/resources
Contains folders for: **css**, **img** and **js**

### src/main/webapp/templates/layout
Contains the **main.xhtml** which includes other xhtml templates, Javascript files and Stylesheets

### src/main/webapp/templates/include
Includes xhtml templates: **navbar.xhtml**, **header.xhtml**, **content.xhtml**, **footer.xhtml**

### src/main/webapp/WEB-INF/web.xml
This is web app configuration file which includes settings for: context-param, welcome-file, servlet, mime-mapping
```xml
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd" version="3.1">

    <!-- Change to "Production" when you are ready to deploy -->
    <context-param>
        <param-name>javax.faces.PROJECT_STAGE</param-name>
        <param-value>Development</param-value>
    </context-param>

    <!-- Welcome page -->
    <welcome-file-list>
        <welcome-file>index.xhtml</welcome-file>
    </welcome-file-list>

    <!-- JSF mapping -->
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>

    <!-- Map these files with JSF -->
    <servlet-mapping>
        <servlet-name>Faces Servlet</servlet-name>
        <url-pattern>*.xhtml</url-pattern>
    </servlet-mapping>

    <!-- web fonts -->
    <mime-mapping>
        <extension>eot</extension>
        <mime-type>application/vnd.ms-fontobject</mime-type>
    </mime-mapping>
    <mime-mapping>
        <extension>otf</extension>
        <mime-type>font/opentype</mime-type>
    </mime-mapping>
    <mime-mapping>
        <extension>ttf</extension>
        <mime-type>application/x-font-ttf</mime-type>
    </mime-mapping>
    <mime-mapping>
        <extension>woff</extension>
        <mime-type>application/x-font-woff</mime-type>
    </mime-mapping>
    <mime-mapping>
        <extension>woff2</extension>
        <mime-type>application/font-woff2</mime-type>
    </mime-mapping>
    <mime-mapping>
        <extension>svg</extension>
        <mime-type>image/svg+xml</mime-type>
    </mime-mapping>
    <mime-mapping>
        <extension>ico</extension>
        <mime-type>image/x-icon</mime-type>
    </mime-mapping>

</web-app>
```

## Getting Help

* Take a look at [Primefaces Documentation](https://www.primefaces.org/documentation/).
* Take a look at [Bootstrap Getting started](http://getbootstrap.com/getting-started/).
* Report questions and bugs at [github.com/EverestConsulting/jsfbootstrapstarter/issues](https://github.com/EverestConsulting/jsfbootstrapstarter/issues).