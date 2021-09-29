import React from 'react';
import Navbar from './Navbar';


/*
import HeaderBottom from './HeaderBottom';

*/

const Header = (props) => {  
  return (
    <section className="main-home">
      
        <header>
          <Navbar />
          {/* <HeaderBottom  {...props} /> */}
        </header>
     
    </section>
  );
};

export default Header;