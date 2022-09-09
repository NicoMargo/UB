
import React from 'react'
import { createRoot } from 'react-dom/client';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import App from './Components/App';
import Home from './Pages/Home';

// import your route components too

const root = createRoot(document.getElementById('root')); 

root.render(
    <BrowserRouter>
        <Routes>
            <Route path='/'   element={<App />}>
                <Route index element={<Home />} />                 
 
            </Route>
        </Routes>
    </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
