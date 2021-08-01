import logo from './logo.svg';
import './App.css';
import HelloWorld from './components/HelloWorld';
import HelloWorldClass from './components/HelloWorldClass';
import WelcomeAndLogo from './components/Ass3';

function App() {
  return (

    <div>
      <WelcomeAndLogo />
      <h1>H! HEllo</h1>
      <HelloWorld />
      <HelloWorldClass />
    </div>

  );
}

export default App;




   {/* <div className="App">
      <header className="App-header">
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
      </header>
  </div> */}