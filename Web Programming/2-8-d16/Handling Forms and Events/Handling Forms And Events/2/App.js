import RegFormComponent from "./HandlingFormAndEvent/EventHandling_Assignment2";


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
            <RegFormComponent></RegFormComponent>
       </center>                  
    </div>
  );
}

export default App;
