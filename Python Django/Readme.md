# Web Designing with Python Django
## Some Question Answers before jump into the web development
- How Internet Works
    - Server 
        - Cloud Service Provider
    - Client
    - Network 
    - DNS
    - IP address
    - CDN
- How Website Works 
    - FrontEnd
    - BackEnd
    - CMS
    - Languages/DBs
    - Static and Dynamic pages
- Future of Internet 
    - BlockChain
    - WEB3.0
    - NFT's
# The Django 
- Django is a back-end server side web framework.
- Django is free, open source and written in Python.
- Django makes it easier to build web pages using Python.
- Framework is a support structure or system that holds parts together, has something stretched over it or acts as the main structure. 
- Basically it's a combination of certain packages and components 
- Some part of code is ready made some part of code you have to written
- There are other frameworks in market to develop web app
- It's written by Adrian Holovaty, Simon Willison
- Initial release 21 July 2005
- Django was invented by Lawrence Journal-World in 2003, to meet the short deadlines in the newspaper and at the same time meeting the demands of experienced web developers.

## Intro to MVT
- The MVT (Model View Template) is a software design pattern.
- It is a collection of three important components Model View and Template.
![MVT](https://www.javatpoint.com/django/images/django-mvt-based-control-flow.png)
- Here, a user requests for a resource to the Django, Django works as a controller and check to the available resource in URL.
- If URL maps, a view is called that interact with model and template, it renders a template.
- View: The View is the user interface — what you see in your browser when you render a website. It is represented by HTML/CSS/Javascript and Jinja files.
- Template: A template consists of static parts of the desired HTML output as well as some special syntax describing how dynamic content will be inserted.
- Model: The model is going to act as the interface of your data. It is responsible for maintaining data. It is the logical data structure behind the entire application and is represented by a database (generally relational databases such as MySql, Postgres)

### Setup Virtual Environment and Django Project
1. >pip install virtualenv

2. >python -m virtualenv .tpvenv 

3. >.\.tpvenv\Scripts\activate

4. >deactivate

---
*Creating Django Project*
- Create a folder which contain requirements.txt which contain the packages would you like to install in your virtual environment
- install packages using command `pip install -r requirements.txt`
- else you can install it directly with pip install with package name

1. To start new project use following command (Note: make sure you are in virtual env)
    - `django-admin startproject project_name`


    
2. This will start your basic project with no build app in it on localhost
    - `python manage.py runserver`

- manage.py- This file is used to interact with your project via the command line(start the server, sync the database… etc). For getting the full list of commands that can be executed by manage.py type this code in the command window- 
    - `python manage.py help`

- _init_.py – It is a python package. It is invoked when the package or a module in the package is imported. We usually use this to execute package initialization code, for example for the initialization of package-level data.
- settings.py – As the name indicates it contains all the website settings. In this file, we register any applications we create, the location of our static files, database configuration details, etc.
- urls.py – In this file, we store all links of the project and functions to call.
- wsgi.py – This file is used in deploying the project in WSGI. It is used to help your Django application communicate with the webserver.

- Django basically divides your code into the different different app's
3. You can create app by using
    - `python manage.py startapp app_name`


<!--
## Hello World in Django
- app.urls.py
```python
from django.urls import path
from . import views
urlpatterns = [
    path('',views.index, name = 'index'),
]
```
- app.views.py
```python
from django.http import HttpResponse
from django.shortcuts import render

# Create your views here.
def index(request):
    return HttpResponse('Hello World')

```
- project.urls.py
```python
from django.contrib import admin
from django.urls import path,include

urlpatterns = [
    path('', include('myapp.urls')),
    path('admin/', admin.site.urls),
]
```

-->







