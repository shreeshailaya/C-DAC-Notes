 # 15/7
 ### Introduction to Web
 
 - Network of Networks
 - ARPANET project undertaken by US defence
 
## FULL STACK web developement components -

# Front end — 
	Html,css,js
	frameworks : react.js ,angular.js ,vue.js 
	Third party libraries - Jquery

# Backend —
	Development languages
	Node js
	Express js
	Python
	Java/.net/ruby
	Databases and caching
	Databases - mongoldb, oracle,sql

# Version control
	Git
	Github

# UI/UX
# Server — apache/nginx
# API — REST and SOAP. 


## SOFTWARE STACKS 

# LAMP Stack
LAMP is a widely used model for web service stacks. Its name "LAMP" is an acronym of four open-source components.
L= Linux: An open source operating system
A= Apache: Widely used web server software
M= MySQL: Popular open source database
P=PHP: Server-side open source scripting language
These above-discussed components, supporting one another. Many popular websites and web applications run on LAMP stack, Example: Facebook.

# MERN Stack
MERN is a collection of JavaScript-based technologies:
M=MongoDB: Popular nosql database
E=Express: Light and portable web program framework
R=React: A javascript library for building user interfaces
N=Node.js: A server-side JavaScript run time
This stack currently in the huge demand as it is widely used to develop web applications.


# MEAN Stack
MEAN Stack Application Development is witnessing a growing trend in usage. MEAN is an abbreviation of:
M = MongoDB: nosql Database
E = Express: Easy to use light and portable web program framework
A = Angular.js: Robust framework for developing HTML5 and JavaScript- web programs
N = Node.is: a server-side JavaScript run time


# HTML
### HTML forms
| Attribute | Description |
|---|---|
| name | Specifices the name of attribute |
| action | Specifies the URL of the program where to send the form data |
| method | Specifice the HTTP method used for sending the data |
| target | Specifice where to display the response that is received after submitting the form. possible values are _blank, _self, _parent, _top |
| enctype | Specify how the form data should be encoded |



 # CSS 
 - External
 - Internal 
 - Inline
 
 ### External 
 - Styling info will be written separately 
 - .css file
 - General look and feed for the website
 
 ```html
 
 <head>
 
 <link href="path.css" type="text/css" rel="stylesheet" />
 
 </head>
 
 ```
 ```css
 selector 
 {
 
 attribute : value;
 attribute : value;
 
 }
 
 p	//tag selector
 {
 	color : green;	
 }
 ```
 - Selector should be the tag
 
 
 ### Internal 
 - Styling info will be writterrn in the same HTML page wing style tag in head section

```html

<head>
<style>
h1
{

attribute : value;	//style rules

}
</style>

</head>

```

### Inline
- Styling info will be written along with element
- Style attribute
- with the tag-specific	

```html
<p style="color:geen">dkfjdkjfksjdkfj</p>
```

### Cascading 
- intotal 
- Everypage web page can take css from external(font),internal(paddding) and inline(color)

- Domination of css
	- browser
	- inline
	- internal
	- external

- ID and Class
- ID is unique name 
- Class is we classify in one catagory
-  . is used in css for class selection


# Java Script
- It used as client side scripting language
- To avoid load on server we need Js
- Every thing cannot be send to server
- It is also called client side scripting
- Js is intrepted language '
- Errors will be releved at the the of excuation
- Browser is the interpeter of js language 
- JS is called as lightweight language
- Js interpreter is very small size
- Loosely typed language
- Does not have support for fileIO and DB
- It is used or generating dynamic HTML
- It is used for data validation on client side 
- JS can be empaded in a existing HTML for this we use `<script>`
- Js can be even written in external file 


document.write("Hello World");




### JS Objects
- 1.Language Supported
- 2.Browser Objects
- 3.DOM Objects

- Objects contain one or more key-value pairs
- The key portion can be anything string  and value can be anything in value in number,string
- As it turns out, nearly everything in js is an object like arrays,functions, numbers even string
- And they all have properties and methods.

```js
vat myObject={
sayHello:function(){
	console.log("HELLO");
},
myName:"sayali"
};

myObject.sayHello(); //console HELLO
console.log(myObject.myName); //console sayali

```


### Functions in JS
```js
function myFunction(p1, p2) {
  return p1 * p2;   // The function returns the product of p1 and p2
}
```

- Function Return 

```js

let x = myFunction(4, 3);   // Function is called, return value will end up in x

function myFunction(a, b) {
  return a * b;             // Function returns the product of a and b
}

```




### Dynamic HTML

- Factorial in JS
```js

<script>
    function findFactoial(no){
        var i,fact;
        fact = 1;
        for (i = 1; i <= no; i++)
        {
	        fact = fact*i;
        }
        alert("Factorial : "+fact);
        document.getElementById("result").innerHTML = "Factorial of "+no+" is : "+fact;
    }

</script>

```


### Array and Build in Objects JS
- All array demo and code ![ALL Array Demos](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Web%20Programming/21-7-d6/21june1/ass1.html)

### Regular Expression in js
```js
<script>
    function check()
    {

        //fname validation
        var fname=document.getElementById("fname").value;
        if (fname == "" || fname == null) {
                document.getElementById("error").innerHTML = "First Name required";
                return;
            }
          //  else if(!(/^[A-Z]+[a-zA-Z]*$/.test(fname)))
          else if(!(/^[A-Z][a-z]+\s[A-Z][a-z]+$/.test(fname)))
            {
          
                    document.getElementById("error").innerHTML = "Enter Full name in Title case";
                    return;
            }
            else
            {
                document.getElementById("error").innerHTML = "";
            }
        
        
 var numonly = /^[0-9]{10}$/;
 var mail = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
 var course = /^[PG-].+[A-Za-z]{3,8}$/    
</script>

```


### DOM Manipulation

- ![DOM Manipulation](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Web%20Programming/23-7-d8/DOM%20Manipulation-1/5/window.html)

# AJAX
- AJAX = Asynchronous JavaScript And XML.
- AJAX is not a programming language.
- AJAX just uses a combination of:

	- A browser built-in XMLHttpRequest object (to request data from a web server)
	- JavaScript and HTML DOM (to display or use the data)


![](https://github.com/shreeshailaya/C-DAC-Notes/tree/main/Web%20Programming/Media/ajax.png)
- HTML
```html
<!DOCTYPE html>
<html>
<body>

<div id="demo">
  <h2>Let AJAX change this text</h2>
  <button type="button" onclick="loadDoc()">Change Content</button>
</div>

</body>
</html>
```
- ajax
```js
function loadDoc() {
  const xhttp = new XMLHttpRequest();
  xhttp.onload = function() {
    document.getElementById("demo").innerHTML = this.responseText;
    }
  xhttp.open("GET", "ajax_info.txt", true);
  xhttp.send();
}

```
### Advantage of AJAX
- Callback
	- Ajax is used to perform a callback, making a quick round trip to and from server to retrive and save the data without posting the entire data.\
- Making Asynchronous Calls
		- Ajax allows you to make Asynchronous call to a web server. This allow to the client browser to avoid waiting for all data for arriving before allowing user to act one more.
- User Friendly
	- Because a page postback is begin to eliminated, ajax enables applications will always be more responsive faster and more user friendly
- Increase speed 
	- because of callback and Asynchronous it willincrease the speed

- [Registration form in HTML](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Web%20Programming/27-7-d11/Assignments/3/RegistrationDetails.html)


- [Handling Validation in AJAX](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Web%20Programming/27-7-d11/Assignments/3/RegistrationDetails.html)


# Jquery
### Intro
```js

 <script src="scripts/jquery-3.4.1.min.js"></script>
    <script>

        $(document).ready(function(){
alert("hi");

        });

    </script>
```

### HTML DOM using jQuery
```js
    <script>
        $(document).ready(function () {
            $("#empty").click(function () {
                $("#info").empty();
            });

            $("#remove").click(function () {
                $("#info").remove();
            });
        });

    </script>

``` 
```html

<body>
    <div id="info" style="width:200px;height:300px;background-color:yellow">
        <p> Jquery is used for reducing client side scripting </p>
        <p> Uses of JQuery</p>
        <ul>
            <li> Jquery effects </li>
            <li> CSS Manipulation </li>
            <li> HTML DOM manipulation </li>
        </ul>
    </div>
    <button id="empty">Empty Div</button>
    <button id="remove">Remove Div</button>
</body>

```

### jQuery Effects Animate

<ul>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_backgroundpositionxy">backgroundPositionX</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_backgroundpositionxy">backgroundPositionY</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_borderwidth">borderWidth</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_borderbottomwidth">borderBottomWidth</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_borderleftwidth">borderLeftWidth</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_borderrightwidth">borderRightWidth</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_bordertopwidth">borderTopWidth</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_borderspacing">borderSpacing</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_margin">margin</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_marginbottom">marginBottom</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_marginleft">marginLeft</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_marginright">marginRight</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_margintop">marginTop</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_opacity">opacity</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_outlinewidth">outlineWidth</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_padding">padding</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_paddingbottom">paddingBottom</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_paddingleft">paddingLeft</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_paddingright">paddingRight</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_paddingtop">paddingTop</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_height">height</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_width">width</a></li>    
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_maxheight">maxHeight</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_maxwidth">maxWidth</a></li>    
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_minheight">minHeight</a></li>
    <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_minwidth">minWidth</a></li>    
      <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_fontsize">fontSize</a></li>    
      <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_bottom">bottom</a></li>    
      <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_left">left</a></li>    
      <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_right">right</a></li>    
      <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_top">top</a></li>    
      <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_letterspacing">letterSpacing</a></li>
      <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_wordspacing">wordSpacing</a></li>
      <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_lineheight">lineHeight</a></li>     
      <li><a target="_blank" href="https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_eff_ani_textindent">textIndent</a></li>
    </ul>
    
   


# 26/6 Node JS

- It is a server side language
- Ryan Dahl used JS v8 engine to develope Node js (v8 engine was a part of chrome )
- Node JS runs as a single thread application which is called event loop
- Event loop recive and send request maintained in queue
- Advantage is Scability and Performance
- Opensource with MIT licence
- Lightweight framework which include bare minimum module
- When you install Node it will automatically install NPM(Node package manager)
- It is used to install various node modules
- These node modules are avalible in center respo
```js
node firstnodeapp.js

```
### Node Modules
- Core Module
- Local Module
- Third party module
- Use of http module to create server


# React 
- States and modifing it with functions 

