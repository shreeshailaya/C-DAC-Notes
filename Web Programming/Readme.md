 # 15/7
 ### Introduction to Web
 - Network of Networks
 - ARPANET project undertaken by US defence

> Needs expansion

# HTML
### HTML tags
There are plenty of different HTML tags, although nowadays most website are pretty much mostly written with `<div>`s.
> As much as most websites nowadays mostly write `<div>`s, it is good practice to use HTML tags which give meaningful context.

You can write out html tags using the following syntax. The first is more common as complex layouts and websites are built by wrapping many different `<divs>`. You can use the second syntax if you do not need to write text or child HTML tags within.

```html
<!-- This is a HTML comment, it will not affect your code when it is run. -->
<div></div>
<div/>
```

#### Link tag
```html
<a></a>
```

#### Paragraph tag
```html
<p></p>
```

#### Article tag
```html
<article></article>
```

#### Section tag
```html
<section></section>
```

#### Table tag
> Before grid and flexbox, complex layouts were hacked together using tables.

```html
<table>
    <tr>
        <th></th>
    </tr>
    <tr> 
        <td></td>
    </tr>
</table>
```
- `<tr>` denotes table row, `<th>` denotes table heading, `<td>` denotes table data.
> there are numerous other ways to write tables but they will not be covered here


##### HTML Lists
###### Unordered Lists
With unordered lists, the list items are marked with bullet points.

Example usage:
```html
<ul>
    <li></li>
</ul>
```

> `<li></li>` denotes a list item.

###### Ordered Lists
With ordered lists, the list items are marked with numbers or letters

Example usage:
```html
<ol>
    <li></li>
</ol>
```

##### HTML forms
| Attribute | Description |
|---|---|
| name | Specifices the name of attribute |
| action | Specifies the URL of the program where to send the form data |
| method | Specifice the HTTP method used for sending the data |
| target | Specifice where to display the response that is received after submitting the form. possible values are _blank, _self, _parent, _top. |
| enctype | Specify how the form data should be encoded |

`_blank` opens the response in a new window or tab, _self opens the response in the current windows. 

Example usage:
```html
<form name="my_form" method="post" action="/server_code.php" target="_blank" enctype="multipart/form-data">
<!-- Rest of the form attributes -->
</form>
```

# CSS 
Lets you change and modify the general look and feel for the website.
> More precisely, it is a set of instructions which tells your browser how to render specific HTML elements by criteria such as class, id, specificity

With CSS, there are three different ways of referencing a stylesheet within your HTML document.
- External
- Internal 
- Inline

Consider the following when choosing which of the three approaches to use:
- Is the styling very specific to a small number of HTML elements? If yes, inline styling is the answer.
- Is the custom css you write small enough (e.g. less than 100 lines of code) that you do not to dedicate a custom css file to? If yes, use internal styling.
- Else, use external styling (recommended for most cases)
> You can be flexible and use a combination of the three, though larger projects would mostly use a CSS preprocessor like [SASS](https://sass-lang.com/)
 
### External 
- Reference an external stylesheet in your HTML file, can be local (writing your own custom `.css` in another file)
- or loading one remotely via a CDN
 
```html
<head>
 <link href="./path_to_your_css.css" type="text/css" rel="stylesheet" />
</head>
```

```css
selector {
 // attribute : value;
 // ...
}

//html tag selector
p	{
color : green;	
}

```
 - Selector should be the tag
 
 
### Internal 
- Styling info will be writterrn in the same HTML page wing style tag in head section

```html
<head>
    <style>
        h1 {
            // style rules
        }
    </style>
</head>
<body>
    <!-- Rest of your HTML document -->
</body>
```

### Inline
- Styling info will be written along with element
- Style attribute
- with the tag-specific	

```html
<p style="color:green">test text</p>
```

### Cascading order
- Every web page can take css from external (e.g. font), internal (e.g. padding) and inline (e.g. color)
- Rendering order of css
	- browser engine's implementation
	- inline styles
	- internal styles
	- external styles

#### ID and Class selectors
##### ID selector
ID is unique name given to one element.

```html
<!-- ... --->
<p id="red_bg"> 
    I will have a red background 
</p>
<!-- ... --->
```
```css
#red_bg {
    background-color: red;
}
```
> This code tells the browser to set the background color to red for HTML elements with an id of `#red_bg`

#### Class selector
Classes can be assigned styling to a group of multiple HTML elements.

```html
<!-- ... --->
<p class="red_bg"> 
    I will have a red background 
</p>
<!-- ... --->
```
```css
.red_bg {
    background-color: red;
}
.blue_text {
    color: blue;
}
```

You can stack calls to different classes e.g.
```html
<p class="red_bg blue_text">
    I will have a red background and blue text
</p>
```

#### Specificity
See https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_cascade/Specificity for more.


# JavaScript
- It used as client side scripting language
- To avoid load on server we need JavaScript
- Not everything can or should be send to the server/backend
- It is also called client side scripting
- JavaScript is interpreted language, it is not compiled to bytecode or binary
- Errors will be show up at runtime only (this is a bad thing, which is which tools like TypeScript exist)
- Browser is the interpreter of JavaScript language 
- JS is called as lightweight language
- JS interpreter is very small size
- Loosely typed language (no type safety, which is also where TypeScript comes in)
- Does not have support for file I/O operations and direct database access (although you can use REST API calls to query databases)
- It is used or generating dynamic HTML
- It is used for data validation on client side 
- JS can be embedded in a existing HTML for this we use `<script>`
- JS can be also be written in external file 

```js
document.write("Hello World");
```

Like CSS, you can use external, internal or inline scripts. The factors to consider are analogous.

### JS Objects
1. Language Supported
2. Browser Objects
3. DOM Objects

- Objects contain one or more key-value pairs
- The key portion can be anything string  and value can be anything in value in number,string
- As it turns out, nearly everything in JavaScript is an object like arrays,functions, numbers even string
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

- Function returning a value

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
    function findFactorial(no){
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

> The runtime will be quite bad for larger values of `no` in the `findFactorial` function as JS is single-threaded.


### Array and Build in Objects JS
- All array demo and code ![ALL Array Demos](https://github.com/shreeshailaya/C-DAC-Notes/blob/main/Web%20Programming/21-7-d6/21june1/ass1.html)

### Regular Expression in JS
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


# jQuery
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
- Ryan Dahl used JS v8 engine to develop Node js (v8 engine was a part of chrome)
- Node JS runs as a single thread application which is called event loop
- Event loop receives and send request maintained in queue
- Advantage is Scalability and Performance
- Open source with MIT licence
- Lightweight framework which include bare minimum module
- When you install Node it will automatically install NPM (Node package manager)
- It is used to install various node modules
- These node modules are available in central repositories

```js
> node firstnodeapp.js
```

### Node Modules
- Core Module
- Local Module
- Third party module
- Use of http module to create server

# React 
- States and modifing it with functions 

# More Resources
- https://www.w3schools.com/
- https://developer.mozilla.org/en-US/
