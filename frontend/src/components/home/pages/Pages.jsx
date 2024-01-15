import { Footer } from 'components/common/Footer';
import Header from 'components/common/Header';
import React from 'react'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from '../Home';

export const Pages = () => {
  return (
    <Router>
    <Header />
          <Routes>
            <Route path="/" element={<Home />} />
          </Routes>
    <Footer />
    </Router>
  )
}
