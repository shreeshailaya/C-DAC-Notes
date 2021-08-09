import logo from './logo.svg';
import './App.css';
import {Link,Route} from 'react-router-dom';
import Login from './components/Login';
import Home from './components/Home';
import Register from './components/Register';


function App() {
  return (
    <div>
    <nav>
      <ul>
        <li>
          <Link to="/home">Home</Link>
        </li>
        <li>
          <Link to="/login">Login</Link>
        </li>
        <li>
          <Link to="/register">Register</Link>
        </li>                        
      </ul>
    </nav>
 
  <Route path="/home" component={Home} exact></Route>
  <Route path="/login" component={Login} ></Route>
  <Route path="/register" component={Register} ></Route>
  <br /><br /><br />
  
  </div>
);
}

export default App;
