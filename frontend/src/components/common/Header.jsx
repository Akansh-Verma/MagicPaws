import React from "react";
import logo from '../assets/images/logo.png';


const Header = () => {
    
    return (
        <header>
            <div className="container">
                <nav>
                    <div className="toggle">
                        <button>Menu</button>
                    </div>
                    <div className="left">
                        <img src={logo} alt="Logo" />
                    </div>
                </nav>
            </div>
        </header>
    );
}

export default Header;