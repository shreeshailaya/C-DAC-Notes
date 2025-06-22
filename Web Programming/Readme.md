 # 15/7
 ### Introduction to Web
 
 - Network of Networks
 - ARPANET project undertaken by US defence
 

# HTML

### What is HTML?
HTML (HyperText Markup Language) is the standard language for creating web pages. It defines the structure and content of a webpage using a system of elements and tags.

### Basic Structure of an HTML Document
```
<!DOCTYPE html>
<html>
<head>
  <title>My First Page</title>
</head>
<body>
  <h1>Hello, world!</h1>
  <p>This is a paragraph.</p>
</body>
</html>
```
 - `<!DOCTYPE html>` declares the document type.
 - `<html>` is the root element.
 - `<head>` contains meta-information (title, styles, links).
 - `<body>` contains visible content.

### HTML Elements
Common tags include:

 - `<h1>` to `<h6>` — Headings
 - `<p>` — Paragraphs
 - `<a>` — Links
 - `<img>` — Images
 - `<ul>`, `<ol>`, `<li>` — Lists
 - `<div>`, `<span>` — Layout/containers

### Forms in HTML
HTML forms are used to collect user input.

#### Example Form
```
<form action="/submit" method="post" target="_blank" enctype="multipart/form-data">
  <label for="name">Name:</label>
  <input type="text" name="name" id="name" />

  <label for="email">Email:</label>
  <input type="email" name="email" id="email" />

  <input type="submit" value="Submit" />
</form>

```

#### Important Attributes
| Attribute | Description |
|---|---|
| name | Specifies the name of attribute |
| action | Specifies the URL of the program where to send the form data |
| method | Specifies the HTTP method used for sending the data |
| target | Specifies where to display the response that is received after submitting the form. possible values are _blank, _self, _parent, _top |
| enctype | Specify how the form data should be encoded |

### Semantic HTML
Semantic tags give meaning to the HTML content:
 - `<header>`, `<nav>`, `<main>`, `<section>`, `<footer>` — used for better structure and accessibility.
 - Helps screen readers and improves SEO.

### HTML Media
 - Images: `<img src="image.jpg" alt="Description" />`
 - Video: `<video controls src="video.mp4"></video>`
 - Audio: `<audio controls src="audio.mp3"></audio>`

### HTML Resources
 - https://developer.mozilla.org/en-US/docs/Web/HTML
 - https://www.w3schools.com/html


# CSS 
 CSS (Cascading Style Sheets) is used to control the appearance of HTML elements. It allows you to define layout, colors, fonts, spacing, and more.


### Types of CSS

- **External** – CSS is written in a separate `.css` file.
- **Internal** – CSS is written inside a `<style>` tag within the HTML `<head>`.
- **Inline** – CSS is applied directly to an element using the `style` attribute.

 
### External CSS
 - Styling info will be written separately 
 - .css file
 - General look and feel for the website
 - Useful for applying consistent styling across multiple   pages.
 
 ```html
 
 <head>
 
 <link href="path.css" type="text/css" rel="stylesheet" />
 
 </head>
 
 ```
 ```css
 selector  {
 attribute : value;
 }
 
/* styles.css */
p {
  color: green;
  font-size: 16px;
}

 ```
 - The example shows a tag selector
 
 
 ### Internal CSS
 - Styles are written in the same HTML page using a <style> tag in head section
 - Best for single-page styling or quick overrides.

```html

<head>
  <style>
    h1 {
      color: blue;
      font-family: Arial, sans-serif;
    }
  </style>
</head>


```

### Inline
- Styling info will be written along with element
- Inline styles are added directly to the HTML tag using the style attribute	

```html
<p style="color: green; font-weight: bold;">Inline styled paragraph</p>

```

### CSS Selectors 
| Selector   | Example      | Description                                   |
| ---------- | ------------ | --------------------------------------------- |
| Tag        | `p {}`       | Targets all `<p>` elements                    |
| Class      | `.btn {}`    | Targets elements with class="btn"             |
| ID         | `#header {}` | Targets element with id="header"              |
| Descendant | `div p {}`   | Targets `<p>` inside `<div>`                  |
| Grouping   | `h1, h2 {}`  | Applies same styles to both `<h1>` and `<h2>` |

### CSS Specificity & Cascading 
CSS styles can come from multiple sources. Priority (highest to lowest):

1. Inline CSS
2. Internal CSS
3. External CSS
4. Browser defaults

### ID and Class
 - id is unique per element. Use #id in CSS.
 - Class can be reused. Use .class in CSS.
```html
<p id="intro">...</p>
<p class="highlight">...</p>
```
```css
#intro {
  font-weight: bold;
}

.highlight {
  color: orange;
}

```

### CSS Preprocessors: SASS/SCSS
SASS adds features like variables, nesting, and functions to CSS.
```scss
$primary-color: #3498db;

.button {
  background-color: $primary-color;
  padding: 10px;

  &:hover {
    background-color: darken($primary-color, 10%);
  }
}
```
To use SASS:
 - Install SASS CLI (npm install -g sass)
 - Compile: sass style.scss style.css

### Best Practices
 - Keep CSS modular (use classes over IDs for reuse)
 - Group related styles together
 - Use naming conventions (e.g., BEM)
 - Avoid inline styles for maintainability
 - Use CSS variables for consistent theming

### CSS Tools & Resources
 - https://developer.mozilla.org/en-US/docs/Web/CSS
 - https://www.w3schools.com/css

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
React is a JavaScript library for building user interfaces, especially single-page applications. It uses a component-based architecture.

### Key Concepts:

#### Components:
 - Functional Components (modern, with hooks)
 - Class Components (older, with lifecycle methods)

```jsx
function Greeting() {
  return <h1>Hello!</h1>;
}
```

#### JSX
React uses JSX, a syntax extension that allows writing HTML-like code inside JavaScript.

```jsx
const element = <h1>Welcome</h1>;
```

#### State and Hooks
 - React's state is used to manage internal, dynamic data.
 - Hooks are special functions that let you “hook into” React features like state and lifecycle methods in functional components.
```jsx
import { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);
  
  return (
    <div>
      <p>You clicked {count} times</p>
      <button onClick={() => setCount(count + 1)}>Click me</button>
    </div>
  );
}
```
 - useState() is a React hook for state management.
 - Hooks can only be used in functional components.

#### Props
Props allow data to be passed from one component to another, typically from parent to child.
```jsx
function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}
```
Usage:
```jsx
<Welcome name="Alice" />
```

### Component Hierarchy 
React apps consist of a tree of components, with a top-level App component typically rendering children.

### React Lifecycle (Class Component Example)
```jsx
class Example extends React.Component {
  componentDidMount() {
    // Code runs after the component mounts
  }

  componentWillUnmount() {
    // Cleanup before component is removed
  }

  render() {
    return <div>Example Component</div>;
  }
}
```
### React Lifecycle (Functional Component Example)
In functional components, lifecycle behavior is handled using the useEffect hook:
```jsx
import { useEffect } from 'react';

function Example() {
  useEffect(() => {
    // Runs after the component mounts
    console.log("Component mounted");

    return () => {
      // Cleanup before the component is removed (like componentWillUnmount)
      console.log("Component unmounted");
    };
  }, []); // Empty dependency array = run once on mount and cleanup on unmount

  return <div>Example Component</div>;
}

```


### Other React Concepts 
 - React Router – Enables navigation between views/pages in a React app.
 - Context API – Allows sharing state globally without prop drilling.
 - useEffect – for side effects (like fetching data)
 ```jsx
import { useEffect } from 'react';

useEffect(() => {
  console.log("Component mounted");
}, []);
 ```
 - React Developer Tools – browser extension for debugging

### Useful Resources
 - https://react.dev
 - https://www.w3schools.com/react
 - https://react.dev/learn/state-a-components-memory