import './App.css';
import DisplayMessage from './States/State_Assignment1';
import DisplayParagraph from './States/StateAssignment2';

function App() {  


  {/*var names =["Monika","Snehal","Dhanashree","Bakul"];*/}

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
            <br/><br/>  
            <h1 style={{ color : 'blue'}}>Hello From React</h1> <br/><br/>
           {/* <Factorial number="5"></Factorial><br/><br/>
            <DisplayNameList names={names}></DisplayNameList><br/><br/>
            <Employee id="2001" name="Bakul" salary="100000"></Employee><br/><br/>
            <Employee></Employee><br/><br/> */}

            <DisplayMessage></DisplayMessage>  <br/><br/>
            <DisplayParagraph></DisplayParagraph>

       </center>                  
    </div>
  );
}

export default App;
