 # 15/7
 ### Introduction to Web
 
 - Network of Networks
 - ARPANET project undertaken by US defence
 
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
- 3. DOM Objects


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

