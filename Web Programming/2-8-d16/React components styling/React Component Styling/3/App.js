import WelcomeCompo from "./ReactCompoStyling/ComponentStyling_Assignment2";
import LoginCompo from "./ReactCompoStyling/ComponentStyling_Assignment3";

function App() {  

  return (
    <div className="App">
      {/*<header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        </header>                                   */}
       <center>       
       <h1 style={{ color : 'blue'}}>Hello From React</h1> <br/><br/>
       <LoginCompo></LoginCompo>
       </center>                  
    </div>
  );
}

export default App;
