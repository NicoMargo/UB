import React from 'react'
import { Outlet, NavLink } from "react-router-dom";
function App(){
    return(
        <>   
        
        <div className='container-fluid'>
            <nav className="fs-4 navbar sticky-top navbar-expand-lg navbar-dark bg-dark  mt-4">
                <div className="container-fluid ">           

                    <NavLink  className="fs-4 navbar-brand" to="/">Inicio</NavLink >
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarText">
                        <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                          <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                              Lista
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                              <NavLink  className="nav-link" to="/certificados">Certificados</NavLink >

                              <NavLink className="dropdown-item" to="Localizar">Localizar un elemento</NavLink >
                              <NavLink className="dropdown-item" to="#">Insertar un Elemento</NavLink >
                              <NavLink className="dropdown-item" to="#">Eliminar un Elemento</NavLink >
                              <NavLink className="dropdown-item" to="#">Ordenar Lista</NavLink >
                              <NavLink className="dropdown-item" to="#">Copiar Una Lista</NavLink >
                              <NavLink className="dropdown-item" to="#">Dividir en sublistas</NavLink >
                              <NavLink className="dropdown-item" to="#">Unir Varias Listas</NavLink >
                            </ul>
                          </li>

                          
                   
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
        
        

        <Outlet />
        
        <footer className="container">
            
        </footer>
    </>
    )   
}
export default App