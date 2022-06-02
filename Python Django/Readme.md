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
1. > pip install virtualenv

2. > python -m virtualenv .tpvenv 

3. > .\.tpvenv\Scripts\activate

4. > deactivate

---
*Creating Django Project*
- Create a folder which contain requirements.txt which contain the packages would you like to install in your virtual environment
- install packages using command `pip install -r requirements.txt`
- else you can install it directly with pip install with package name

1. To start new project use following command (Note: make sure you are in virtual env)
    - > `django-admin startproject project_name`


    
2. This will start your basic project with no build app in it on localhost
    - > `python manage.py runserver`

- manage.py- This file is used to interact with your project via the command line(start the server, sync the database… etc). For getting the full list of commands that can be executed by manage.py type this code in the command window- 
    - > `python manage.py help`

- _init_.py – It is a python package. It is invoked when the package or a module in the package is imported. We usually use this to execute package initialization code, for example for the initialization of package-level data.
- settings.py – As the name indicates it contains all the website settings. In this file, we register any applications we create, the location of our static files, database configuration details, etc.
- urls.py – In this file, we store all links of the project and functions to call.
- wsgi.py – This file is used in deploying the project in WSGI. It is used to help your Django application communicate with the webserver.

- Django basically divides your code into the different different app's
3. You can create app by using
    - > `python manage.py startapp app_name`



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
### Hello World with Template
- Create a template folder in root of project
- Add index.html page in it
- Major change in settings.py in project settings
- Set path in DIRS 
```python
TEMPLATES = [
{
    'DIRS': ['BASE_DIR', 'template_dir_name'],
}
]
```
- render the views function with request and the html file name
```python
def index(request):
    return render(request, 'template_name.html')
```
### Sending dynamic data from view's to template
- app.views.py
```python
def index(request):
    return render(request, 'template_name.html', {key:value})
```
- template.html
```html
<h2> This is value come from views: {{key}} </h2>
```
- Every app that created that should be register in setting.py in installed apps
> python manage.py migrate 
- This command migrate the changes in base and app 

- Setting up new path of template dir




## Views 
![views](https://media.geeksforgeeks.org/wp-content/uploads/20200124153519/django-views.jpg)
- A view is a place where we put our business logic of the application
```python
# import Http Response from django
from django.http import HttpResponse
# get datetime
import datetime

# create a function
def home_view(request):
	# fetch date and time
	now = datetime.datetime.now()
	# convert to string
	html = "Time is {}".format(now)
	# return response
	return HttpResponse(html)

```
- There are two types of view 
    - Class based views
    - Function based views 



### Templates and Django Templates Language
- You can change the path of template file by configuration of settings.py
- Variable 
    - A variable outputs a value from the context, which is a dict-like object mapping keys to values.
    - Variables are surrounded by {{ and }} like this:
    - `My first name is {{ first_name }}. My last name is {{ last_name }}.`
- Tags
    - Tags provide arbitrary logic in the rendering process.
    - For example, a tag can output content, serve as a control structure e.g. an “if” statement or a “for” loop, grab content from a database, or even enable access to other template tags.
    - Syntax `{% tag_name %}`
    - Commonly used tags
    ```
    Comment, cycle, extends,
    if, for loop, for … empty loop,
    Boolean Operators, firstof, include,
    lorem, now, url
    ```

### if else in templates
```python
# import Http Response from django
from django.shortcuts import render

# create a function
def home_view(request):
	# create a dictionary
	context = {
		"data" : 99,
	}
	# return response
	return render(request, "home.html", context)

```

```html

{% if data %}
Value in data is : - {{ data }}
{% else %}
Data is empty
{% endif%}


```
### for in templates 
- app.views.py
```python

def home_view(request):
    context = {
        'data': 'This is Django view and templates',
        'lst': [2,4,9]
    }
    return render(request, 'home.html', context)

```
- template.home.html
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Views/Templates</title>
</head>
<body>
    <h1>{{ data }}</h1>
    <br>
    <b>This is list view </b>
    <br>
    {% for i in lst %}
    <b>{{ i }}</b>
    <br>
    {% endfor %}
</body>
</html>
```
- install jinja extension for jinja code view 

## Filters
- Django Template Engine provides filters that are used to transform the values of variables and tag arguments.
- Syntax `{{ variable_name | filter_name }}`
- Some of filters
```
add, addslashes, capfirst,
center,	cut, date,
default, dictsort, divisibleby,
escape, filesizefodivisible,
join, last,	length,
line numbers,	lower,	make_list,
random,	slice,	slugify,
time,	timesince,	title,
unordered_list,	upper,	wordcount
```

### Comments 
```html
{% comment "Optional note" %}
    Commented out text 
    {% endcomment %}
```
### include tag
- Include tag inject the code of one template to the another template 
- include tag do not override the existing code 
- where ever you put include it will call whole template there 
- you have to just mention `{% include 'template_name.html' %}`
### extends tag
- extends tag is used for inheritance of templates in django
- One needs to repeat the same code again and again. Using extends we can inherit templates as well as variables.
- base.html
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Base HTML</title>
</head>
<body>
   
    <h1>BAse HTML</h1>
    {% block content %}
    
    {% endblock %}
    
</body>
</html>
```
-  home.html
```html
{% extends "base.html" %}
<!DOCTYPE html>
<html lang="en">
<head>
    <title>home.html</title>
</head>
<body>
    
    {% block content %}
    {{ data }}
    {% endblock %}
    
</body>
</html>
```
- Inheritance means it overriding all the content in html
- block content block allow to block the content which is selected or which is present in block

### Static files
- Static files are the files which contains js/css/image files 
- The static folder helps to user to store the js, css and image file 
- To invoke static Make change is settings.py
```python 
STATICFILES_DIRS = [
   os.path.join(BASE_DIR, 'static/')
]

STATIC_URL = 'static/'
```
- Use tag `{% load static %}` and load the static file for example 
- 
    ```
    {% load static %}
    <link href="{% static 'home.css' %}" rel="stylesheet">     
    <script src="{% static 'js/home.js' %}"></script>
    <img src = "{% static 'logo.png' %}" height="200" width="200" class="d-inline-block align-top">

    ```
### Simple operation in django
- adding 2 numbers with get method 
### Difference between GET and POST
- Post add 2 numbers
- csrf_token 

### Models
- A Django model is the built-in feature that Django uses to create tables, their fields, and various constraints.
- Each model is a Python class that subclasses django.db.models.Model.
- Each attribute of the model represents a database field.
- With all of this, Django gives you an automatically-generated database-access API
![models](https://media.geeksforgeeks.org/wp-content/uploads/20191220123439/django-models.png)


```python 
class Products(models.Model):
    name =  models.CharField(max_length=100, blank=True)
    price = models.IntegerField(null = True)
    quantity = models.IntegerField()

    def __str__(self):
        return self.name

```

- __str__() function represent how object should be display
- after writing this you need to run following command for making migrations
    - `python manage.py makemigrations`
    - `python manage.py migrate`
- Every time you made changes in models you need to run these commands 
- 


### ORM (Object Relational Mapping)
- We can access the Django ORM by running the following command inside our project directory.
    `python manage.py shell`
- This brings us to an interactive Python console. Assuming that our models exist in MyProject/smallapp/models.py we can import our models using the following command:
    - `from smallapp.models import products`
- * NOTE: You can use django_extension package so it will provide shell_plus so you need not to explicitly import the classes*

- Adding objects/record in DB
    ````
    a = Products(name = 'name_of_product', price = 22, quantity = 33)
    a.save()
    ```
- View all objects/data from DB 
    `Products.objects.all()`
- Search/filter object 
    `Products.objects.filter(name = 'product_name')`
- Update Object 

    ```
    a = Product.objects.get(pk = pk_id)
    a.name = 'new_name'
    a.save()
    ```
- Delete object 
    ```
    a = Product.objects.get(pk = pk_id)
    a.delete()

    OR

    Product.objects.get(pk = pk_id).delete()

    ```
- register in admin.py
```python 
@admin.register(Products)
class Products(admin.ModelAdmin):
    pass  
```

- create superuser
    `python manage.py createsuperuser
- login with 

### Create, Delete and View with template form 
#### View Products

- NAV bar
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NAV</title>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Products</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
          <ul class="navbar-nav">
            <li class="nav-item active">
              <a class="nav-link" href="{% url 'home' %}">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="{% url 'products' %}">Products</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="{% url 'pform' %}">Add Products</a>

            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Dropdown link
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                <a class="dropdown-item" href="#">Action</a>
                <a class="dropdown-item" href="#">Another action</a>
                <a class="dropdown-item" href="#">Something else here</a>
              </div>
            </li>
          </ul>
        </div>
      </nav>
</body>
</html>
```

- display_products.html
```html
{% include 'navbar.html' %}

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Display Products</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">    
    {{products.name}}
    {% for i in products%}
    <div class="card text-white bg-primary mb-3" style="max-width: 18rem;">
        <div class="card-header">Name : {{i.name}}</div>
        <div class="card-body">
            <h5 class="card-title">ID : {{i.id}}</h5>
          <h5 class="card-title">Price : {{i.price}}</h5>
          <p class="card-text">Quantity : {{i.quantity}}</p>
        </div>
      </div>

    {% endfor %}
    
</body>
</html>
```

- views.py
```python
def products(request):
    pros = Products.objects.all()
    return render(request, 'display_products.html', {'products':pros})

```
- urls.py

```python
 path('products', views.products, name= 'products'),
```
### Including the boostrap CDN's properly
- Before including the CDN check all the CDN you are using are of same version
- When you extends the html its fine base.html version of boostrap will continue everywhere 
- But when you include html page you have to explicitly add all CDN as per base.html
### Add and Delete Products

```html
{% include 'navbar.html'%}

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    
    <h1>ADD PRODUCT</h1>

<form action="add_pro" method="get">
    NAME<input type="text" name="name" id="">
    PRICE<input type="text" name="price" id="">
    QUANTITY<input type="text" name="quantity" id="">
    <input type="submit" value="submit">
    


</form>
<br><br><br>

<h1>DELETE PRODUCT</h1>

<form action="delete" method="get">
    ID of Product<input type="text" name="id">
    <input type="submit" value="DELETE">

</form>
<br><br>



    <h1 style="color: red;">{{success}}</h1>
</body>
</html>
```

- urls.py

```python
from django.urls import path
from . import views

urlpatterns = [
    path('',views.index, name='home'),
    path('add_pro', views.add_pro, name='add_pro'),
    path('productForm', views.productForm, name='pform'), 
    path('products', views.products, name= 'products'),
    path('delete', views.delete, name='delete'),
    
    
   
]
```

- views.py
```python

from django.shortcuts import render
from smallapp.forms import ProductForm
from smallapp.models import Products


# Create your views here.
def index(request):
    return render(request, 'index.html')

def productForm(request):
    #context ={}
    #context['form']= ProductForm()
    return render(request, "add_product.html")

def add_pro(request):
    name1 = request.GET['name']
    price1 = request.GET['price']
    quantity1 = request.GET['quantity']
    img = ''#request.GET['img']

    Products.objects.create(name = name1, price = price1, quantity = quantity1)
   
    return render(request, 'add_product.html', {'success':'Successfully Saved data'})

def products(request):
    pros = Products.objects.all()
    return render(request, 'display_products.html', {'products':pros})

def delete(request):
    id1 = int(request.GET['id'])
    snippet = Products.objects.get(id=id1).delete()
    return render(request, 'add_product.html', {'success':'deleted successfully'})

```
## Django Forms
- When one creates a Form class, the most important part is defining the fields of the form
- Each field has custom validation logic, along with a few other hooks.
- Note that all types of work done by Django forms can be done with advanced HTML stuff, but Django makes it easier and efficient especially the validation part. Once you get hold of Django forms you will just forget about HTML forms.
- Syntax `field_name = forms.FieldType(**options) `
- Create forms.py in your app folder
```python
from django import forms
from .models import Products
 
 
# creating a form
class ProductForm(forms.Form):
    name = forms.CharField(max_length=200)
    info = forms.CharField(max_length=200)

```

- urls.py
```python
    path('productform', views.create_view),

```
- views.py

```python
def create_view(request):

    form = ProductForm()
    return render(request, "utilityTemp/create_view.html", {'form': form})

```
- create_view.html
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form method="POST" action="submitted">

        <!-- Security token -->
        {% csrf_token %}
    
        <!-- Using the formset -->
        {{ form }}
        
        <input type="submit" value="Submit">
    </form>
    
</body>
</html>
```

