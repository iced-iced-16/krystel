# Hello-Render

This is a simple Java webapp (WAR) that includes:
- index.html (welcome page)
- a HelloServlet at /hello that prints "Hello Servlet"

Build locally:
mvn clean package

Deploy on Render:
- Push to GitHub
- Create a new Web Service on Render and connect this repo
- Render will use the Dockerfile to build a Tomcat container and run the app
- Visit https://<your-render-url> and https://<your-render-url>/hello
"# hello" 
