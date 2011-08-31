Grails Deployment on Heroku Example
-----------------------------------
-----------------------------------

Example Grails 2.0.0.BUILD-SNAPSHOT application deployable to Heroku's new Java support.

Relevant configuration can be found in the pom.xml and Procfile.

Basic steps to deploy this application to Heroku would be:

    git clone git://github.com/grails-samples/hello-heroku.git
    cd hello-heroku
    rm -rf .git
    git init
    git add .
    git commit -m "init"
    heroku create --stack cedar
    git push heroku master
    
To check it started up properly run:

    heroku logs
    
If there are no errors in the logs you can go the application with:

    heroku open


