# Web Designing with Python Django
![DJANGO](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Python%20Django/media/django.png)
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

- {{ form.as_table }} will render them as table cells wrapped in <tr> tags
- {{ form.as_p }} will render them wrapped in <p> tags
- {{ form.as_ul }} will render them wrapped in <li> tags

## Django Models Form (CRUD)
### Create 
- forms.py
```python
from django import forms
from django.forms import ModelForm
from utility.models import Products
 
 
# creating a form
class ProductForm(ModelForm):
    class Meta:
        # specify model to be used
        model = Products
 
        # specify fields to be used
        fields = '__all__'



'''
fields = [
            "name",
            "price",
        ]
'''
```
- urls.py
```python
    path('productform', views.create_view, name='productform'),
```

- views.py
```python
def create_view(request):
    # dictionary for initial data with
    # field names as keys
    
    success = ''
    form = ProductForm(request.POST or None)
    if form.is_valid():
        form.save()
        success = 'Successfully saved data'
    # add the dictionary during initialization
    return render(request, "utilityTemp/create_view.html", {'form': form, 'success': success})

```
- The is_valid() method is used to perform validation for each field of the form, it is defined in Django Form class.
- It returns True if data is valid and place all data into a cleaned_data attribute

- template create_view.html
```html
{% include 'navbar.html'%}
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Add Product Form</h1>
    <form method="POST" >

        <!-- Security token -->
        {% csrf_token %}
    
        <!-- Using the formset -->
        {{ form }}
        
        <input type="submit" value="Submit">
    </form>

    <h1 style="color: red;">
    {{success}}
    </h1>
    
</body>
</html>
```
### Read
- urls.py
```python
    path('products', views.products, name='products'),

```
- views.py
```python
def products(request):
    products_data = Products.objects.all()
    return render(request, 'utilityTemp/products.html', {'products': products_data})

```
- template products.html
```html
{% include 'navbar.html' %}

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>   
<body>
       
   
    <title>Display Products</title>
    <h1>Products</h1>
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

    <h1 style="color: red;">{{success}}</h1>
    
</body>
</html>
```
### Delete
- modify template products.html add the delete button which sends product id with url
```html
        <p class="card-text">Quantity : {{i.quantity}}</p>
        <a href="/delete/{{ i.id }}"><Button>DELETE</Button></a>

```
- This button delete will send id of product to the delete url

- urls.py
```python 
    path('delete/<id>', views.delete, name='delete'),
```
- `<id>` will handle the id send by template

- views.py
```python
def delete(request, id):
    Products.objects.get(id=id).delete()
    return render(request, 'utilityTemp/products.html', {'success':'Successfully deleted Item'})

```

### Update
- Create button of update in products.html
- Which send product id to the update url-->views
```html
    <a href="/update/{{ i.id }}"><Button>UPDATE</Button></a>
```
- urls.py
```python
    path('update/<id>', views.update_view, name='update'),
```
- views.py
```python

def update_view(request, id):
    success = ''
    # fetch the object related to passed id
    obj = Products.objects.get(id = id)
    return render(request, "utilityTemp/update_view.html", {'object': obj, 'success':success})

```
- update_view.html
```html
{% include 'navbar.html' %}
{% load static %}
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update</title>
    <script src="{% static 'js/update_view.js' %}"></script>

</head>
<body>
    <h1>Update Product</h1>
    <div class="main">
        <!-- Create a Form -->
        <form method="POST" action="{% url 'updateData' %}">
            <!-- Security token by Django -->
            {% csrf_token %}
            ID <input type="text" name="id" value="{{object.id}}" readonly="readonly" onclick="idUpdateError()">

            Name<input type="text" name="name" value="{{ object.name }}" id="">
            Price <input type="number" name="price" id="" value="{{object.price}}">
            Quantity <input type="number" name="quantity" value="{{object.quantity}}">
            <input type="submit" value="Update">
        </form>
        <p id="idupdate" style="color: red;"></p>
    
    </div>
    
    
</body>
</html>
```

- in static js/update_view.js
```js
function idUpdateError()
{
    document.getElementById('idupdate').innerHTML = 'Sorry you cannot update value of id'
    
}
```
- action updateData in urls.py
```python
    path('update_data', views.updateData, name='updateData')
```
- views.py

```python


def updateData(request):
    print(request.POST)
    
    id1 = request.POST['id']
    name1 = request.POST['name']
    price1 = request.POST['price']
    quantity1 = request.POST['quantity']

    print(id1)
    obj = get_object_or_404(Products, id = id1)
    obj.name = name1
    obj.price = price1
    obj.quantity = quantity1

    obj.save()
    
    return render(request, 'utilityTemp/products.html', {'success': 'Updated successfully'})
```
### Image Upload 

- Settings.py

```python
# Base url to serve media files  
MEDIA_ROOT = os.path.join(BASE_DIR, 'media')
# Path where media is stored  
MEDIA_URL = '/media/'
```
- models.py
```python
    img = models.ImageField(upload_to='images/', default='default_product.png')

```

- pip install Pillow  9.1.1 (latest)
- main project urls.py
```python
from django.conf import settings
from django.conf.urls.static import static
if settings.DEBUG:
        urlpatterns += static(settings.MEDIA_URL,
                              document_root=settings.MEDIA_ROOT)
```

- template.html
```html
 <!-- multipart/form-data Required for handling image -->
<form method="POST"  enctype="multipart/form-data">

        <!-- Security token -->
        {% csrf_token %}
    
        <!-- Using the formset -->
        {{ form.as_p }}
        
        <button type="submit" value="Submit">SUBMIT</button>
    </form>

```
- views.py
```python

def create_view(request):
    # dictionary for initial data with
    # field names as keys
    
    success = ''
    if request.method == "POST":
        form = ProductForm(request.POST, request.FILES)
        if form.is_valid():
            name = form.cleaned_data.get("name")
            price = form.cleaned_data.get("price")
            quantity = form.cleaned_data.get("quantity")
            img = form.cleaned_data.get("img")

            obj = Products.objects.create(
                                 name = name,
                                 price = price,
                                 quantity = quantity,
                                 img = img
                                 )
            obj.save()
            print(name)
            success = 'Successfully saved data'
    else:
      form = ProductForm()

    # add the dictionary during initialization
    return render(request, "utilityTemp/create_view.html", {'form': form, 'success': success})

```
#### Customization of Django Forms(Applying css/js)
- When you `runserver` every form will converted into a html page so you can use that html tags to customized the form 

## Class Based Views
- At its core, a class-based view allows you to respond to different HTTP request methods with different class instance methods, instead of with conditionally branching code inside a single view function.
- Class based views are very structured
- for handling the templates you need to create `app_name` folder in templates 
- for example create_view
- views.py
```python
from django.views.generic.edit import CreateView

class ProductCreate(CreateView):
 
    # specify the model for create view
    model = Products
 
    # specify the fields to be displayed
 
    fields = ['name', 'price', 'quantity', 'img']
```
- urls.py
```python
from utility.views import ProductCreate

path('classcreate', ProductCreate.as_view(), name='classcreate')   #Class based Views for create

```
- templates/utility/products_form.html
```python
{% include 'navbar.html' %}
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Class View Template</title>
</head>
<body>
    <h1>Add products based on class view</h1>
    <form method="POST" enctype="multipart/form-data">

        <!-- Security token -->
        {% csrf_token %}
    
        <!-- Using the formset -->
        {{ form.as_p }}
        
        <input type="submit" value="Submit">
    </form>
    
</body>
</html>
```
- Refer this [link](https://www.geeksforgeeks.org/class-based-generic-views-django-create-retrieve-update-delete/)  for other operations like retrieve, update, delete

## Django Admin Customization
### Adding Search and Filters
- Currently, we have only a few entries in our models, but what if the entries increase to hundreds or thousands due to more number of users?
-  To get data of a particular entry will become tedious if we go by looking at each entry.
- Therefore we need to add a search bar or a filter feature to allow entries to be accessed easily.
```python
from django.contrib import admin
from utility.models import Products

# Register your models here.
@admin.register(Products)
class Products(admin.ModelAdmin):
     # Let you to search with title name, price, quantity
    search_fields = ['name']
    # List filter
    list_filter = ['price']
```
### Viewing Additional Fields
- In admin interface, normally we see only one field of our models in the list view. We can add more fields to view with list_display.
```python
@admin.register(Products)
class Products(admin.ModelAdmin):
    list_display =['name','price', 'quantity']
```

## Relations in Models

### Many-to-one fields:
- This is used when one record of a model A is related to multiple records of another model B.
- For example – a model Song has many-to-one relationship with a model Album, i.e. an album can have many songs, but one song cannot be part of multiple albums.
- Many-to-one relations are defined using `ForeignKey` field of django.db.models.
```python
from django.db import models

class Album(models.Model):
	title = models.CharField(max_length = 100)
	artist = models.CharField(max_length = 100)

class Song(models.Model):
	title = models.CharField(max_length = 100)
	album = models.ForeignKey(Album, on_delete = models.CASCADE)

```
### Many-to-many fields:
- This is used when one record of a model A is related to multiple records of another model B and vice versa. 
- For example – a model Book has many-to-many relationship with a model Author, i.e. an book can be written by multiple authors and an author can write multiple books
- Many-to-many relations are defined using ManyToManyField field of `django.db.models`.
```python
from django.db import models

class Author(models.Model):
	name = models.CharField(max_length = 100)
	desc = models.TextField(max_length = 300)

class Book(models.Model):
	title = models.CharField(max_length = 100)
	desc = models.TextField(max_length = 300)
	authors = models.ManyToManyField(Author)


```
- It is a good practice to name the many-to-many field with the plural version of the related model, lowercase. It doesn’t matter which of the two models contain the many-to-many field, but it shouldn’t be put in both the models.

### One-to-one fields:
- This is used when one record of a model A is related to exactly one record of another model B.
- This field can be useful as a primary key of an object if that object extends another object in some way.
- For example – a model Car has one-to-one relationship with a model Vehicle, i.e. a car is a vehicle. One-to-one relations are defined using `OneToOneField` field of `django.db.models`.
```python
from django.db import models

class Vehicle(models.Model):
	reg_no = models.IntegerField()
	owner = models.CharField(max_length = 100)

class Car(models.Model):
	vehicle = models.OneToOneField(Vehicle,
		on_delete = models.CASCADE, primary_key = True)
	car_model = models.CharField(max_length = 100)


```
- It is a good practice to name the one-to-one field with the same name as that of the related model, lowercase.
### On delete integrity options
- on_delete = models.CASCADE – This is the default value. It automatically deletes all the related records when a record is deleted.(e.g. when an Album record is deleted all the Song records related to it will be deleted)
- on_delete = models.PROTECT – It blocks the deletion of a record having relation with other records.(e.g. any attempt to delete an Album record will be blocked)
- on_delete = models.SET_NULL – It assigns NULL to the relational field when a record is deleted, provided null = True is set.
- on_delete = models.SET_DEFAULT – It assigns default values to the relational field when a record is deleted, a default value has to be provided.
- on_delete = models.SET() – It can either take a default value as parameter, or a callable, the return value of which will be assigned to the field.
- on_delete = models.DO_NOTHING – Takes no action. Its a bad practice to use this value.

## User Model 
- The Django’s built-in authentication system is great. For the most part we can use it out-of-the-box, saving a lot of development and testing effort.

- Now we have to connect our Product with the seller so you have to do some changes in models 
```python
from django.contrib.auth.models import User


class Products(models.Model):
    name = models.CharField(max_length=100, default='')
    quantity = models.IntegerField()
    price = models.IntegerField()
    img = models.ImageField(upload_to='images/', default='default_product.png')
    seller = models.ForeignKey(User, on_delete=models.CASCADE)


    def __str__(self):
        return self.name

```
- This changes in Products will connect the User( inbuilt model )to the Products model
- Now you need to do some changes in `views.py` so that without selecting user, based on login user seller will save, for that you need to take instance of logged in user from views and save it
```python
obj = Products.objects.create(
                                 name = name,
                                 price = price,
                                 quantity = quantity,
                                 img = img,
                                 seller = request.user #user who has active login
                            )
```
- Now remove `seller_field` from forms.py
- So based on log in user data will save
- Add seller in products.html
```html
        <h5 class="card-title">Price : {{i.price}}</h5>
        <h5 class="card-title">Seller : {{i.seller}}</h5>
        <p class="card-text">Quantity : {{i.quantity}}</p>
```

### Authentication
#### is_authenticated tag 

- syntax
```
{% if user.is_authenticated %}
    ...
{% else %}
    ...
{% endif %}
```
- Then use `is_authenticated` tag for hide the UPDATE and DELETE button.


### @login_required
- This decorators represent that for accessing the function you need to login first 
```python
from django.contrib.auth.decorators import login_required
@login_required(redirect_field_name='my_redirect_field')
def my_view(request):
    ...

#OR

from django.contrib.auth.decorators import login_required

@login_required(login_url='/accounts/login/')
def my_view(request):
    ...
```
- Use login required on delete/update functions in views
### Verify user when DELETE and UPDATE
- views.py
```python

@login_required
def delete(request, id):
    
    obj = Products.objects.get(id=id)
    if obj.seller == request.user:
        obj.delete()
        return render(request, 'utilityTemp/products.html', {'success':'Successfully deleted Item'})
    else:
        return HttpResponse('<h2>Sorry you cannot edit this you are not the owner of this post </h2>')



@login_required
def update_view(request, id):
    success = ''
    # fetch the object related to passed id
    
    obj = Products.objects.get(id = id)
    print(obj.seller)
    if obj.seller == request.user:
        return render(request, "utilityTemp/update_view.html", {'object': obj, 'success':success})
    else: 
        return HttpResponse('<h2>Sorry you cannot edit this you are not the owner of this post </h2>')

```
- Hide create_view form
- create_view.html
```html
{% include 'navbar.html'%}
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    {% if user.is_authenticated %}
    <h1>Add Product Form</h1>
    <form method="POST"  enctype="multipart/form-data">

        <!-- Security token -->
        {% csrf_token %}
    
        <!-- Using the formset -->
        {{ form.as_p }}
        
        <button type="submit" value="Submit">SUBMIT</button>
    </form>

   

    <h1 style="color: red;">
    {{success}}
    </h1>
{% else %}

    <h3>Login required to view this page</h3>
{% endif %}
</body>
</html>

```



### Create users/accounts app which handles login registration and logout
- Now make changes in the Navbar.html
- Which creates login/registration links when user is not login and logout and welcome user when user is login
```html
</li>
          </ul>
          
        </div>
        {% if user.is_authenticated %}
        Welcome {{ user.get_username }} 
        
          <a class="nav-link" href="{% url 'logout' %}">logout</a>
        {% else %}
          <a class="nav-link" href="{% url 'login' %}">Login</a>
          <a class="nav-link" href="{% url 'registration' %}">Registration</a>

        {% endif %}
      </nav>
      
```

## User Login and Registration and Logout
### Registration

- userTemp/registration.html
```html
{% include 'navbar.html' %}
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration</title>
</head>
<body>
    <h1>Registration Form</h1>
    <form method="post">
        {% csrf_token %}
        Username <input type="text" name="username" id="username"> <p></p>
        First Name <input type="text" name="fname" id="fname"> <p></p>
        Last Name <input type="text" name="lname" id="lname"><p></p>
        Email <input type="email" name="email" id="email"><p></p>
        Password <input type="password" name="pass1" id="pass1"><p></p>
        Re-enter Password <input type="password" name="pass2" id="pass2"><p></p>
        <input type="submit" value="Register"><p></p>
    </form>

    <h1 style="color: red;">{{msg}}</h1>
</body>
</html>
```
- views.py
```python

def registration(request):
    msg = ''
    if request.method == 'POST':

        username = request.POST['username']
        fname = request.POST['fname']
        lname = request.POST['lname']
        email = request.POST['email']
        pass1 = request.POST['pass1']
        pass2 = request.POST['pass2']
        if pass1 == pass2:
            myuser = User.objects.create_user(username, email, pass1)
            myuser.first_name = fname
            myuser.last_name = lname
            myuser.save()
            msg = 'Registration Done'
            return render(request, 'userTemp/registration.html', {'msg': msg} )
        else:
            msg = 'Passwords are not matching'
            return render(request, 'userTemp/registration.html', {'msg': msg} )

    else:
        return render(request, 'userTemp/registration.html')

```
### Login
- login.html
```html
{% include 'navbar.html' %}
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>LOGIN</h1>
    
    <form method="post">
        {% csrf_token %}
        Username <input type="text" name="username" id="username"> <p></p>
        Password <input type="password" name="password" id="password"> <p></p>
        <input type="submit" value="Submit">
    </form>
    <h1 style="color: red;">{{msg}}</h1>
</body>
</html>
```
- views.py
```python

def loginfun(request):
    if request.method == 'POST':
        username = request.POST['username']
        password = request.POST['password']

        user = authenticate(username=username, password=password)
        if user is not None:
            login(request, user)
            return render(request, 'index.html')
        else:
            return render(request, 'userTemp/login.html', {'msg': 'Invalid username or password'})

    else:
        return render(request, 'userTemp/login.html')


```
### logout
- views.py
```python
def logoutfun(request):
    logout(request)
    return redirect('login')
```

## Deployment and Git/Github
### Git vs Github
<!--
### Configuration on project
- install
```
pip install whitenoise

and then

pip install gunicorn
```
- Add Procfile and Following content
```
web: gunicorn projectname.wsgi 
```
- change setting.py MIDDLEWARE
```python
MIDDLEWARE = [
    ...,
    'whitenoise.middleware.WhiteNoiseMiddleware',
    ...,
    ...,
]
```
- change settings.py STATIC_ROOT
```python
STATIC_ROOT = os.path.join(BASE_DIR, 'staticroot')

```
- Run command
- `python manage.py collectstatic`
- Generate requirements.txt
- `pip freeze > requirements.txt`

- Now create github repo and push code 
- Create Account on `heroku.com`
- change settings.py
```python
ALLOWED_HOSTS = [
    '127.0.0.1',
    'appname.herokuapp.com'
]
```
!-->

### 1. Install gunicorn and whitenoise
```
pip install whitenoise

and then

pip install gunicorn
```

### 2. Add Procfile and Following content

![Procfile](https://www.codechit.com/wp-content/uploads/2021/01/image-8.png)

### 3. Now you need to add **Procfile** inside root directory. This file will not have any extension and name should be exactly same as Procfile. Now open this Procfile and add following line

- `web: gunicorn projectname.wsgi `

- Because my project name is pass_gen, therefore my Procfile will contain something like this: **web: gunicorn pass_gen.wsgi**

### 4. Add Following MIDDLEWARE:
- Now you need to add the above item right after the first item inside the MIDDLEWARE list of settings.py
```
MIDDLEWARE = [
    ...,
    'whitenoise.middleware.WhiteNoiseMiddleware',
    ...,
    ...,
]
```

### 5. Now add STATIC_ROOT Path in Settings.py:
- Now you need to add STATIC_ROOT Path in settings.py to tell where to look for static files e.g, css, js, etc.
```python
STATIC_ROOT = os.path.join(BASE_DIR, 'staticroot')
```
### 6. Run following command
- `python manage.py collectstatic`
- check staticroot folder is created or not

### 7. Add requirements.txt File:
- Now add requirements.txt file to your root directory. So, that heroku could install all the required packages that they need to run this app on their server.

- To add requirements.txt file:
- `pip freeze > requirements.txt`

### 8. Create account on github and create a new repository and push your project code in that repository.
- Use VS code shell or install git and use git bash

![github](https://www.codechit.com/wp-content/uploads/2021/01/image-9.png)

### 9. Step no 8 commands only push readme.md file for push whole project use following commands
```
git add .
git commit -m 'base project'
git push origin main
```

### 10. Create account on heroku 
### 11. Create new app on heroku

![create app](https://www.codechit.com/wp-content/uploads/2021/01/image-12.png)

### 12. Once you’ve selected name for your app then add your app_domain inside your ALLOWED_HOST in settings.py
- `appname.herokuapp.com`
- settings.py in main project dir

```python
ALLOWED_HOSTS = [
    '127.0.0.1'
    'appname.herokuapp.com'
]
```
### 13. Now again, commit and push these changes to your github.
```shell
> git add .
> git commit -m "Allowed Hosts"
> git push -u origin main
```
### 14. Connect GitHub to You Heroku App:
- Now you need connect that github repository to your heroku app. Where your configured django project is available.

![heroku](https://www.codechit.com/wp-content/uploads/2021/01/image-13-1536x695.png)

- So, just click to connect to the GitHub button. Once you’ve connected you GitHub account then search that repository where your django project is available. And then Connect it

![search](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Python%20Django/media/search.png)

### 15. Enable Auto deployment Option:
- Now scroll down and there you will see option **Enable Automatic Deploys**, click on it to enable this feature.
- And Now whenever you will make and new changes in your repository then it will automatically fetch your changes and then will apply those changes to deployed app.
![ab](https://www.codechit.com/wp-content/uploads/2021/01/image-17.png)


- Then Finally click on **deploy branch**:
- And now your site will be fully live on url: yourappname.herokuapp.com.
![deploy](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Python%20Django/media/deploy.png)

## Deploy on Cpanel
### 1
![cdeploy](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Python%20Django/media/cdeploy1.png)




### 2
![cdeploy](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Python%20Django/media/cdeploy2.png)

### 3
![cdeploy](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Python%20Django/media/cdeploy3.png)

### 4
![cdeploy](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Python%20Django/media/cdeploy4.png)


### 5
![cdeploy](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Python%20Django/media/cdeploy5.png)


### 6
![cdeploy](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Python%20Django/media/cdeploy6.png)


### 7
![cdeploy](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Python%20Django/media/cdeploy7.png)


### 8
![cdeploy](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Python%20Django/media/cdeploy8.png)

### 9
```
[vitkarte@s ~]$ ls
demopython.vitkar.tech
[vitkarte@s ~]$ cd demopython.vitkar.tech/
[vitkarte@s demopython.vitkar.tech]$ dir
passenger_wsgi.py  public  tmp
[vitkarte@s demopython.vitkar.tech]$ git clone https://github.com/shreeshailaya/deployment-of-django.git
Cloning into 'deployment-of-django'...
remote: Enumerating objects: 253, done.
remote: Counting objects: 100% (253/253), done.
remote: Compressing objects: 100% (194/194), done.
remote: Total 253 (delta 54), reused 250 (delta 51), pack-reused 0
Receiving objects: 100% (253/253), 695.11 KiB | 3.99 MiB/s, done.
Resolving deltas: 100% (54/54), done.
[vitkarte@slime demopython.vitkar.tech]$ source /home/vitkarte/virtualenv/demopython.vitkar.tech/3.8/bin/activate && cd /home/vitkarte/demopython.vitkar.tech
(demopython.vitkar.tech:3.8)[vitkarte@slime demopython.vitkar.tech]$ dir
deployment-of-django  passenger_wsgi.py  public  tmp
(demopython.vitkar.tech:3.8)[vitkarte@slime demopython.vitkar.tech]$ cd deployment-of-django/
(demopython.vitkar.tech:3.8)[vitkarte@slime deployment-of-django]$ pip install -r requirements.txt
```



### 10
![cdeploy](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Python%20Django/media/cdeploy10.png)

### 11

- passenger_wsgi.py
```python
import os
import sys

import MyProject.wsgi
application = MyProject.wsgi.application
```
### 12
![cdeploy](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Python%20Django/media/cdeploy12.png)

### 13
![cdeploy](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Python%20Django/media/cdeploy13.png)

***

Compiled by [Shreeshail Vitkar](https://github.com/shreeshailaya)
	
Feel free to fork @ [C-dac Notes](https://github.com/shreeshailaya/c-dac)

***


