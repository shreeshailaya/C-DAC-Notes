import React from 'react';
import Header from './homePageComponents/Header';
import './Home.css';

const Home = () => {
    return (
        <div>
            <Header/>
            <div className="wrapper">

                <div className="content">
                    <h1>Welcome to Online Clinic Management System.</h1>

                </div>

                <ul className="share">
                    <li data-text="facebook"><i className="fa fa-facebook" aria-hidden="true" /></li>
                    <li data-text="twitter"><i className="fa fa-twitter" aria-hidden="true" /></li>
                    <li data-text="google+"><i className="fa fa-google-plus" aria-hidden="true" /></li>
                </ul>
            </div>
            <br/>


        </div>


    );
};

export default Home;