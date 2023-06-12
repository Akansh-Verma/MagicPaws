import React from "react";
import logo from '../images/logo.png';

const Header = () => {
    return (
        <header className="header">
            <div className="logo-container">
                <img src={logo} alt="Magic Paws logo"  className="logo"/>
                <h1 className="tagline">MagicPaws</h1>
            </div>
            <nav className="navigation">
                <ul>
                    <li><a href="/">Home</a></li>
                    <li><a href="/products">Products</a></li>
                    <li><a href="/about">About</a></li>
                    <li><a href="/contact">Contact</a></li>
                </ul>
            </nav>
            <div className="search-bar">
                <input type="text" placeholder="Search for products..." />
                <button>Search</button>
            </div>
        </header>
    );
}

export default Header;